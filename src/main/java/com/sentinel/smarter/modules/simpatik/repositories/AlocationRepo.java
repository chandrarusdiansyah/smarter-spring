package com.sentinel.smarter.modules.simpatik.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.simpatik.models.Alocation;

@Repository
public interface AlocationRepo extends JpaRepository<Alocation,String>{
    
}
