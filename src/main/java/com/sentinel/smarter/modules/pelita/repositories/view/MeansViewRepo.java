package com.sentinel.smarter.modules.pelita.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.pelita.models.view.MeansView;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface MeansViewRepo extends ReadOnlyRepo<MeansView,String>{
    @Query(value = "SELECT * FROM lan_dbplt.sarana WHERE ID_PERUSAHAAN = ?1;", nativeQuery = true)
    List<MeansView> findMeansViewByIDCompany(String id_perusahaan);

    @Query(value = "SELECT * FROM lan_dbplt.sarana WHERE ID_PERUSAHAAN = ?1 AND SEWA='Y' AND RAWAT='N' AND INTERNAL='N';", nativeQuery = true)
    List<MeansView> findMeansViewAvailable(String id_perusahaan);
}
