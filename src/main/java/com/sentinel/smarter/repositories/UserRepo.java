package com.sentinel.smarter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.models.User;

@Repository
public interface UserRepo extends JpaRepository<User,String>{
    
}
