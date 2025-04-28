package com.sentinel.smarter.modules.simpatik.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.simpatik.models.view.AlocationView;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface AlocationViewRepo extends ReadOnlyRepo<AlocationView,String> {
    @Query(value = "SELECT * FROM lan_dbspt.alokasi WHERE ID_PERUSAHAAN = ?1;", nativeQuery = true)
    List<AlocationView> findAclocationViewByIDCompany(String id_perusahaan);

    @Query(value = "SELECT * FROM lan_dbspt.alokasi WHERE ID_PERUSAHAAN = ?1 AND ID_JENIS_BARANG = ?2;", nativeQuery = true)
    List<AlocationView> findAclocationViewByItemType(String id_perusahaan, String id_jenis_barang);

    @Query(value = "SELECT * FROM lan_dbspt.alokasi WHERE ID_PERUSAHAAN = ?1 AND ID_JENIS_BARANG = ?2 AND ID_SATUAN_KERJA = ?3", nativeQuery = true)
    List<AlocationView> findAlocationByIDWorkUnit(String id_perusahaan, String id_jenis_barang, String id_satuan_keja);
}
