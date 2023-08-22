package com.Day_3_classwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Day_3_classwork.model.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}