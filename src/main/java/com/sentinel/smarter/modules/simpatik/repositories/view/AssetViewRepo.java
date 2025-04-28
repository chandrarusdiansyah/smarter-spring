package com.sentinel.smarter.modules.simpatik.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.simpatik.models.view.AssetView;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface AssetViewRepo extends ReadOnlyRepo<AssetView,String> {
    @Query(value = "SELECT * FROM lan_dbspt.barang WHERE ID_PERUSAHAAN = ?1;", nativeQuery = true)
    List<AssetView> findAssetViewByIDCompany(String id_perusahaan);
}
