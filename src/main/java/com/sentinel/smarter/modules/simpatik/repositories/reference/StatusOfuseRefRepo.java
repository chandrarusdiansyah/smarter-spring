package com.sentinel.smarter.modules.simpatik.repositories.reference;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.simpatik.models.reference.StatusOfUseRef;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface StatusOfuseRefRepo extends ReadOnlyRepo<StatusOfUseRef,String> {
    @Query(value = "SELECT * FROM lan_dbspt.tbl_status_guna WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<StatusOfUseRef> findStatusOfUseByIDCompany(String id_perusahaan);
}
