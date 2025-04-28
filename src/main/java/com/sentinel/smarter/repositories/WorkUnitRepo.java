package com.sentinel.smarter.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.models.WorkUnit;

@Repository
public interface WorkUnitRepo extends JpaRepository<WorkUnit,String>{
    @Query(value = "SELECT * FROM lan_dbsmt.tbl_unit_kerja WHERE ID_PERUSAHAAN = ?1;", nativeQuery = true)
    List<WorkUnit> findWorkUnitByIDCompany(String id_perusahaan);
}
