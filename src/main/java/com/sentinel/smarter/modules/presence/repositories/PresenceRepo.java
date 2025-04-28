package com.sentinel.smarter.modules.presence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.presence.models.Presence;

@Repository
public interface PresenceRepo extends JpaRepository<Presence,String>{
    
}
