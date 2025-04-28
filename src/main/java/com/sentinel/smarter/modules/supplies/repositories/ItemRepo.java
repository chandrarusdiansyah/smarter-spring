package com.sentinel.smarter.modules.supplies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.supplies.models.Item;

@Repository
public interface ItemRepo extends JpaRepository<Item,String> {
    
}
