package com.sentinel.smarter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.models.Application;

import java.util.List;

@Repository
public interface ApplicationRepo extends JpaRepository<Application,String> {
    @Query(value = "SELECT * FROM lan_dbsmt.tbl_aplikasi WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<Application> findApplicationByIDCompany(String id_perusahaan);
}
// 