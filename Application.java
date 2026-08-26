 package in.hrushiit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.hrushiit.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(Application.class, args);
		
		EmployeeService empService =context.getBean(EmployeeService.class);
		//empService.saveEmployee();
		//empService.getAllEmps();
		//+
		//empService.getEmpsWithCountry();
		//empService.getEmpsWithGender();
		//empService.getEmpGenAndCountry();
		//empService.getEmpSalary();
		
		//Calling Custom Queries
		
		
		//empService.getAllemps();
		//empService.getEmpGender();
		empService.getEmpClass();
	}

}
