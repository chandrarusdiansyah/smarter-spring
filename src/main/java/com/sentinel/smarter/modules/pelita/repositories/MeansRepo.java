package com.sentinel.smarter.modules.pelita.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.pelita.models.Means;

@Repository
public interface MeansRepo extends JpaRepository<Means,String>{
    
}
