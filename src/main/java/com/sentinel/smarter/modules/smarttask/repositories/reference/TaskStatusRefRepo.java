package com.sentinel.smarter.modules.smarttask.repositories.reference;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.smarttask.models.reference.TaskStatusRef;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface TaskStatusRefRepo extends ReadOnlyRepo<TaskStatusRef,String>{
    @Query(value = "SELECT * FROM lan_dbstk.tbl_tugas_status WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<TaskStatusRef> findTaskStatusByIDCompany(String id_perusahaan);
}
