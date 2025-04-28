package com.sentinel.smarter.modules.smarttask.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.smarttask.models.Project;

@Repository
public interface ProjectRepo extends JpaRepository<Project,String> {
    @Query(value = "SELECT * FROM lan_dbstk.tbl_proyek WHERE ID_PERUSAHAAN = ?1;", nativeQuery = true)
    List<Project> findProjectByIDCompany(String id_perusahaan);
}
