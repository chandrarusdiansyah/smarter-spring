package com.sentinel.smarter.modules.simpatik.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.simpatik.models.Asset;

@Repository
public interface AssetRepo extends JpaRepository<Asset,String>{
    @Query(value = "SELECT * FROM lan_dbspt.barang WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<Asset> findAssetByIDCompany(String id_perusahaan);
}
