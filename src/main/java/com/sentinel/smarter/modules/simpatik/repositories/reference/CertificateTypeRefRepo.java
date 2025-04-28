package com.sentinel.smarter.modules.simpatik.repositories.reference;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.simpatik.models.reference.CertificateTypeRef;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface CertificateTypeRefRepo extends ReadOnlyRepo<CertificateTypeRef, String>{
    @Query(value = "SELECT * FROM lan_dbspt.tbl_jenis_sertifikat WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<CertificateTypeRef> findCertificateTypeByIDCompany(String id_perusahaan);
}
