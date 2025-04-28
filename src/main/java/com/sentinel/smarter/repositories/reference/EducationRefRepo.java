package com.sentinel.smarter.repositories.reference;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.models.reference.EducationRef;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface EducationRefRepo extends ReadOnlyRepo<EducationRef,String> {
    @Query(value = "SELECT * FROM lan_dbsmt.tbl_pendidikan WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<EducationRef> findEducationByIDCompany(String id_perusahaan);
}
