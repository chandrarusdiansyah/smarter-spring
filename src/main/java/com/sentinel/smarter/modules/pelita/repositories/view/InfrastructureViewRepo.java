package com.sentinel.smarter.modules.pelita.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.pelita.models.view.InfrastructureView;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface InfrastructureViewRepo extends ReadOnlyRepo<InfrastructureView,String> {
    @Query(value = "SELECT * FROM lan_dbplt.prasarana WHERE ID_PERUSAHAAN = ?1;", nativeQuery = true)
    List<InfrastructureView> findInfrastructureViewByIDCompany(String id_perusahaan);

    @Query(value = "SELECT * FROM lan_dbplt.prasarana WHERE ID_PERUSAHAAN = ?1 AND SEWA='Y' AND RAWAT='N' AND INTERNAL='N';", nativeQuery = true)
    List<InfrastructureView> findInfrastructureViewAvailable(String id_perusahaan);
}
