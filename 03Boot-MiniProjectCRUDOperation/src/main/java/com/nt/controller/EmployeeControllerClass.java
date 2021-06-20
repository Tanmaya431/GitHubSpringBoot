package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.entity.Employee;
import com.nt.service.IEmpService;

@Controller
public class EmployeeControllerClass {
	@Autowired
	private IEmpService serv;
	
	@GetMapping("/welcome")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/report")
	public String getEmployee(Map<String,Object> map) {
		//use service
		Iterable<Employee> empList=serv.fetchAllEmployee();
		map.put("empsList", empList);
		return "show_emps";
	}

}
