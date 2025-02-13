package Crud.Springboot.demo.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Crud.Springboot.demo.Exception.RecordNotFoundException;
import Crud.Springboot.demo.Model.Employee;
import Crud.Springboot.demo.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	
	@Override
	public Employee saveEmployee(Employee employee) {
		employee.setDateOfJoining(LocalDateTime.now());
		return employeeRepository.save(employee);

	}

	@Override
	public Employee getEmployeeById(Long id) {

		Optional<Employee> EmployeeDb = employeeRepository.findById(id);

		if (EmployeeDb.isPresent()) {
			Employee employee = EmployeeDb.get();
			return employee;
		} else {
			throw new RecordNotFoundException("Record Not Found");
		}
	}

	
	@Override
	public List<Employee> getEmployees() {

		return employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployee(Employee employee) {

		Optional<Employee> employeeDb = employeeRepository.findById(employee.getId());

		if (employeeDb.isPresent()) {
			Employee employeeUpdate = employeeDb.get();
			employeeUpdate.setSalary(employee.getSalary());
			employeeUpdate.setEmail(employee.getEmail());
			employeeRepository.save(employeeUpdate);
			return employeeUpdate;
		} else {
			throw new RecordNotFoundException("Record Not Found");
		}
	}

	@Override
	public void deleteEmployee(Long id) {
		Optional<Employee> employeeDB = employeeRepository.findById(id);

		if (employeeDB.isPresent()) {
			employeeRepository.delete(employeeDB.get());
		} else {
			throw new RecordNotFoundException("Record Not Found");
		}
	}

}
