package com.sentinel.smarter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.models.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,String> {
    
}
