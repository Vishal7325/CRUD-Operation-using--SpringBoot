package Crud.Springboot.demo.Service;

import java.util.List;

import Crud.Springboot.demo.Model.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
	
	public Employee getEmployeeById(Long id);
	
	public List<Employee> getEmployees();
	
	public Employee updateEmployee(Employee employee);
	
	public void deleteEmployee(Long id);
}
