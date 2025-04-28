package com.sentinel.smarter.repositories.reference;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.models.reference.GradeRef;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface GradeReferRepo extends ReadOnlyRepo<GradeRef, String> {
    @Query(value = "SELECT * FROM lan_dbsmt.tbl_golongan WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<GradeRef> findGradeByIDCompany(String id_perusahaan);
}
