package com.sentinel.smarter.modules.supplies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.supplies.models.Transaction;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction,String> {
    
}
