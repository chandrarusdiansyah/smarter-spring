package com.sentinel.smarter.modules.smartproc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.smartproc.models.Contract;

@Repository
public interface ContractRepo extends JpaRepository<Contract,String>{
    
}
