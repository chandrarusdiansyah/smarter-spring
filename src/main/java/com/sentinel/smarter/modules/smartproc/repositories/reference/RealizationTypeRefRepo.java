package com.sentinel.smarter.modules.smartproc.repositories.reference;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.smartproc.models.reference.RealizationTypeRef;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface RealizationTypeRefRepo extends ReadOnlyRepo<RealizationTypeRef,String>{
    @Query(value = "SELECT * FROM lan_dbspc.tbl_jenis_realisasi WHERE ID_PERUSAHAAN = ?1;", nativeQuery = true)
    List<RealizationTypeRef> findRealizationTypeReferenceByIDCompany(String id_perusahaan);
}
