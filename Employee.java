package Crud.Springboot.demo.Model;



import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_data")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable= false, name= "employee_name")
	private String name;
	
	@Column(nullable= false, name= "employee_email")
	private String email;
	
	@Column(nullable= false, name= "employee_salary")
	private double salary;
	
	@Column(nullable=false, name= "employee_Join_date")
	private LocalDateTime DateOfJoining;
	
	public Employee()
	{
		
	}
	
	
	


	public Employee(Long id, String name, String email, double salary, LocalDateTime dateOfJoining) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		DateOfJoining = dateOfJoining;
	}





	public void setDateOfJoining(LocalDateTime dateOfJoining) {
		DateOfJoining = dateOfJoining;
	}





	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}





	public LocalDateTime getDateOfJoining() {
		return DateOfJoining;
	}






	
	
	
	
	
}
