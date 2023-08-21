package com.Day_3_classwork.controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Day_3_classwork.model.Employee;
import com.Day_3_classwork.service.ApiService;

@RestController
public class ApiController {
	@Autowired
	ApiService aser;
	
	@PostMapping("addemployee")
	public Employee add(@RequestBody Employee e)
	{
		return aser.saveinfo(e);
	}
	
	@GetMapping("showdetails")
	public List<Employee> show()
	{
		return aser.showinfo();
	}
}
