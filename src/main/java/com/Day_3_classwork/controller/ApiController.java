package com.Day_3_classwork.controller;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public ResponseEntity<Boolean> add(@RequestBody Employee e) {
        boolean isAdded = aser.saveinfo(e) != null;
        return new ResponseEntity<>(isAdded, HttpStatus.OK);
    }

	
	@GetMapping("showdetails")
	public List<Employee> show()
	{
		return aser.showinfo();
	}
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> showDetail(@PathVariable Long id) {
	    Employee employee = aser.getEmployeeById(id);
	    
	    if (employee != null) {
	        return new ResponseEntity<>(employee, HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}


}
