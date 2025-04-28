package com.sentinel.smarter.modules.presence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.presence.models.EmployeeContract;

@Repository
public interface EmployeeContractRepo extends JpaRepository<EmployeeContract,String> {
    
}
