package com.sentinel.smarter.modules.smartproc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.smartproc.models.Partner;

@Repository
public interface PartnerRepo extends JpaRepository<Partner,String>{
    @Query(value = "SELECT * FROM lan_dbspc.tbl_rekanan WHERE ID_PERUSAHAAN = ?1;", nativeQuery = true)
    List<Partner> findPartnerByIDCompany(String id_perusahaan);
}
