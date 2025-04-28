package com.sentinel.smarter.modules.smarttask.repositories.reference;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.smarttask.models.reference.TaskPriorityRef;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface TaskPriorityRefRepo extends ReadOnlyRepo<TaskPriorityRef,String>{
    @Query(value = "SELECT * FROM lan_dbstk.tbl_tugas_prioritas WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<TaskPriorityRef> findTaskPriorityByIDCompany(String id_perusahaan);
}
