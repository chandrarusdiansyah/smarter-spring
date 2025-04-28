package com.sentinel.smarter.modules.simpatik.repositories.reference;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.simpatik.models.reference.AssetRef;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface AssetRefRepo extends ReadOnlyRepo<AssetRef,String> {
    @Query(value = "SELECT * FROM lan_dbspt.barang WHERE ID_PERUSAHAAN = ?1 AND ID_JENIS_BARANG = ?2", nativeQuery = true)
    List<AssetRef> findItemByIDCompany(String id_perusahaan, String id_jenis_barang);
}
