package com.sentinel.smarter.modules.simpatik.repositories.reference;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.simpatik.models.reference.DocumentTypeRef;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface DocumentTypeRefRepo extends ReadOnlyRepo<DocumentTypeRef,String>{
    @Query(value = "SELECT * FROM lan_dbspt.tbl_jenis_dokumen WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<DocumentTypeRef> findDocumentTypeByIDCompany(String id_perusahaan);
}
