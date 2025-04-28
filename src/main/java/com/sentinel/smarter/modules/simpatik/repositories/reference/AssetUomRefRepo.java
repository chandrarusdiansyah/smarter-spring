package com.sentinel.smarter.modules.simpatik.repositories.reference;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.simpatik.models.reference.AssetUomRef;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface AssetUomRefRepo extends ReadOnlyRepo<AssetUomRef,String> {
    @Query(value = "SELECT * FROM lan_dbspt.tbl_satuan WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<AssetUomRef> findUomByIDCompany(String id_perusahaan);
}
