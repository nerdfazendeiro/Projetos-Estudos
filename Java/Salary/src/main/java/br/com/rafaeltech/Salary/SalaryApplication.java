package br.com.rafaeltech.Salary;

import br.com.rafaeltech.Salary.entities.Employee;
import br.com.rafaeltech.Salary.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SalaryApplication implements CommandLineRunner {

	@Autowired
	private SalaryService salaryService;

	public static void main(String[] args) {

		SpringApplication.run(SalaryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee("Maria", 4000.0);
		System.out.println(salaryService.netSalary(employee));
	}
}
