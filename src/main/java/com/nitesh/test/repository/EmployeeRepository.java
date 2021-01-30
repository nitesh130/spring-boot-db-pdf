package com.nitesh.test.repository;

import java.util.List;

import com.nitesh.test.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("FROM Employee e")
    List<Employee> getAllEmployeeData();

}
