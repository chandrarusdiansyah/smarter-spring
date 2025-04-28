package com.sentinel.smarter.modules.presence.repositories.reference;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.presence.models.reference.WorkTypeRef;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface WorkTypeRefRepo extends ReadOnlyRepo<WorkTypeRef,String> {
    @Query(value = "SELECT * FROM lan_dbprc.tbl_jenis_kerja WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<WorkTypeRef> findWorkTypeByIDCompany(String id_perusahaan);  
}
