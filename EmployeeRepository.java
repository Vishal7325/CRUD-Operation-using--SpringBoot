package Crud.Springboot.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Crud.Springboot.demo.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	
	

}
