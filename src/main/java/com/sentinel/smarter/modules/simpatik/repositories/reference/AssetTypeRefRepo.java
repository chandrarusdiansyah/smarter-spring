package com.sentinel.smarter.modules.simpatik.repositories.reference;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.simpatik.models.reference.AssetTypeRef;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface AssetTypeRefRepo extends ReadOnlyRepo<AssetTypeRef,String> {
    @Query(value = "SELECT * FROM lan_dbspt.tbl_jenis_barang WHERE ID_PERUSAHAAN = ?1;", nativeQuery = true)
    List<AssetTypeRef> findAssetTypeByIDCompany(String id_perusahaan);
}
