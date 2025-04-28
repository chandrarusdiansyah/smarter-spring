package com.sentinel.smarter.modules.pelita.repositories.reference;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.pelita.models.reference.InfrastructureTypeRef;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface InfrastructureTypeRefRepo extends ReadOnlyRepo<InfrastructureTypeRef,String> {
    @Query(value = "SELECT * FROM lan_dbplt.tbl_jenis_prasarana WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<InfrastructureTypeRef> findInfrastructureTypeByIDCompany(String id_perusahaan);
}
