package com.sentinel.smarter.modules.simpatik.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.simpatik.models.view.AlocationWorkPlaceView;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface AlocationWorkPlaceViewRepo extends ReadOnlyRepo<AlocationWorkPlaceView,String> {
    @Query(value = "SELECT * FROM lan_dbspt.alokasi_satuan_kerja WHERE ID_PERUSAHAAN = ?1;", nativeQuery = true)
    List<AlocationWorkPlaceView> findAclocationWorkPlaceViewByIDCompany(String id_perusahaan);
}
