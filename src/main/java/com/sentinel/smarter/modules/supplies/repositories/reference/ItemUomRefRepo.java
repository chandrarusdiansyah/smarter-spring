package com.sentinel.smarter.modules.supplies.repositories.reference;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.supplies.models.reference.ItemUomRef;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface ItemUomRefRepo extends ReadOnlyRepo<ItemUomRef,String> {
    @Query(value = "SELECT * FROM lan_dbspl.tbl_satuan WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<ItemUomRef> findUomByIDCompany(String id_perusahaan);
}
