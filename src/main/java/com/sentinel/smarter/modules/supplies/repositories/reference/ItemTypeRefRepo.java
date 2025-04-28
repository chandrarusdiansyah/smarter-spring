package com.sentinel.smarter.modules.supplies.repositories.reference;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.supplies.models.reference.ItemTypeRef;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface ItemTypeRefRepo extends ReadOnlyRepo<ItemTypeRef,String> {
    @Query(value = "SELECT * FROM lan_dbspl.tbl_jenis_barang WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<ItemTypeRef> findItemTypeByIDCompany(String id_perusahaan);
}
