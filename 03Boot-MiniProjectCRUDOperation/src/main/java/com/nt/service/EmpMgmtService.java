package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repo.IEmployeeRepo;

@Service("empServ")
public class EmpMgmtService implements IEmpService {
	@Autowired
	private IEmployeeRepo repo;

	@Override
	public Iterable<Employee> fetchAllEmployee() {
		
		return repo.findAll();
	}

}
