package in.hrushiit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.hrushiit.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>{
	/*
   //select * from employee where emp_country ='India';
	public  List<Employee> findByempCountry(String country);
	
	//select * from employee where empGender ='Male';
	public List<Employee> findByempGender(String gender);
	//select * from employee where empGender = 'Male' and empCountry ='India';
	
	public List<Employee>findByEmpGenderAndEmpCountry(String gender,String country);
	//select * from employee where empSalary > 5000;
	public List<Employee>findByEmpSalaryGreaterThan(Double salary);
	*/
	
	//for using Custome Queries
	
	//@Query("from Employee")
	//public List<Employee>getAllEmps();
//	@Query("from Employee where empCountry=india")
//	public List<Employee> getEmpCountry();
	
	@Query("from Employee where empGender=:gender")
	public List<Employee> getEmpswitchGender(String gender);
	
	@Query(value="select * from employee",nativeQuery = true) //to convert Hql queries into sql queries ,that's why we use (nativeQuery = true) operation
	public List<Employee> getEmpSql();
	
	
	
}
