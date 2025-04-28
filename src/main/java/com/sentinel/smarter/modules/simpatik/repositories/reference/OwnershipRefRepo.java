package com.sentinel.smarter.modules.simpatik.repositories.reference;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.simpatik.models.reference.OwnershipRef;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface OwnershipRefRepo extends ReadOnlyRepo<OwnershipRef,String> {
    @Query(value = "SELECT * FROM lan_dbspt.tbl_kepemilikan WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<OwnershipRef> findOwnershipByIDCompany(String id_perusahaan);
}
