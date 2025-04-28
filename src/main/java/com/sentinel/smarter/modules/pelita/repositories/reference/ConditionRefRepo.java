package com.sentinel.smarter.modules.pelita.repositories.reference;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.pelita.models.reference.ConditionRef;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface ConditionRefRepo extends ReadOnlyRepo<ConditionRef,String> {
    @Query(value = "SELECT * FROM lan_dbplt.tbl_kondisi WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<ConditionRef> findConditionByIDCompany(String id_perusahaan);
}
