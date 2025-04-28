package com.sentinel.smarter.modules.pelita.repositories.reference;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.pelita.models.reference.FloorRef;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface FloorRefRepo extends ReadOnlyRepo<FloorRef,String> {
    @Query(value = "SELECT * FROM lan_dbplt.tbl_lantai WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<FloorRef> findFloorByIDCompany(String id_perusahaan);
}
