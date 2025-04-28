package com.sentinel.smarter.modules.simpatik.repositories.reference;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.simpatik.models.reference.SbsnStatusRef;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface SbsnStatusRefRepo extends ReadOnlyRepo<SbsnStatusRef,String> {
    @Query(value = "SELECT * FROM lan_dbspt.tbl_status_sbsn WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<SbsnStatusRef> findSbsnStatusByIDCompany(String id_perusahaan);
}
