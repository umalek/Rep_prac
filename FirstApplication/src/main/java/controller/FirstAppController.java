package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Employee;
import repository.EmployeeRepository;

@RequestMapping("/demo")
public class FirstAppController {
	
	@Autowired
	EmployeeRepository employeeRepo;
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET, produces={"application/json"})
	
	public List<Employee> getAllEmployees(){
		return employeeRepo.findAll();
		
	}

}
