package com.sentinel.smarter.modules.smarttask.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.smarttask.models.TaskManager;

@Repository
public interface TaskManagerRepo extends JpaRepository<TaskManager,String> {
    
}
