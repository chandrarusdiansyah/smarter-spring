package com.sentinel.smarter.modules.pelita.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.pelita.models.OrderMeans;

@Repository
public interface OrderMeansRepo extends JpaRepository<OrderMeans,String>{
    
}
