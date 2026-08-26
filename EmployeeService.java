package in.hrushiit.service;


import java.util.List;

import org.springframework.stereotype.Service;

import in.hrushiit.entity.Employee;
import in.hrushiit.repository.EmployeeRepository;

@Service 
//to represent as a spring bean we are going to use @Service annotation
public class EmployeeService {
	
	private EmployeeRepository empRepo;
	
	public EmployeeService(EmployeeRepository empRepo) {
		this.empRepo = empRepo;
	}
	/*
	public void saveEmployee() {
		Employee emp = new Employee();
		emp.setEmpId(102);
		emp.setEmpName("Rani");
		emp.setEmpSalary(50000.00);
		emp.setEmpGender("female");
		emp.setEmpCountry("India");
		empRepo.save(emp);
		
		System.out.println("****Record Saved.......... ****");
		
	}
	public void getAllEmps() {
		 Iterable<Employee> emps = empRepo.findAll();
		 //emps.forEach(System.out::println);
		 emps.forEach(e->{
			 System.out.println(e);
		 });
	}
	public void getEmpsWithCountry() {
		List<Employee> emps = empRepo.findByempCountry("India");
		emps.forEach(System.out::println);
	}
	public void getEmpsWithGender() {
		List<Employee> emps1 = empRepo.findByempGender("Male");
		emps1.forEach(System.out::println);
	}
	public void getEmpGenAndCountry() {
		List<Employee> emps = empRepo.findByEmpGenderAndEmpCountry("Male", "India");
		emps.forEach(System.out::println);
	}
	public void getEmpSalary() {
		List<Employee> emps = empRepo.findByEmpSalaryGreaterThan(30000.00);
		emps.forEach(System.out::println);
	}
	*/
	
//	public void getAllemps() {
//		List<Employee> allEmps =empRepo.getAllEmps();
//		allEmps.forEach(System.out::println);
//	}
//	public void getEmpCountry() {
//		List<Employee> allEc = empRepo.getEmpCountry();
//		allEc.forEach(System.out::println);
//	}
	

	public void getEmpGender() {
		List<Employee> allGen = empRepo.getEmpswitchGender("Male");
		allGen.forEach(System.out::println);
	}
	public void getEmpClass() {
		List<Employee> allclass = empRepo.getEmpSql();
		allclass.forEach(System.out::println);
	}
}
