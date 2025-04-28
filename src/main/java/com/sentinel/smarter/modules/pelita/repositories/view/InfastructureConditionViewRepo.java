package com.sentinel.smarter.modules.pelita.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.pelita.models.view.InfrastructureConditionView;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface InfastructureConditionViewRepo extends ReadOnlyRepo<InfrastructureConditionView,String> {
    @Query(value = "SELECT * FROM lan_dbplt.prasarana_kondisi WHERE ID_PERUSAHAAN = ?1;", nativeQuery = true)
    List<InfrastructureConditionView> findInfrastructureConditionViewByIDCompany(String id_perusahaan);
}
