package com.Day_3_classwork.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Day_3_classwork.model.Employee;
import com.Day_3_classwork.repository.EmployeeRepo;

@Service
public class ApiService {
	@Autowired
	EmployeeRepo er;
	
	public Employee saveinfo(Employee e)
	{
		return er.save(e);
	}
	
	public List<Employee> showinfo()
	{
		return er.findAll();
	}

	public Employee getEmployeeById(Long id) {
		Optional<Employee> employeeOptional = er.findById(id);
        return employeeOptional.orElse(null);
	}
}
