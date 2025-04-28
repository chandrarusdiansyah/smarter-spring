package com.sentinel.smarter.modules.pelita.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.pelita.models.view.GuestView;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface GuestViewRepo extends ReadOnlyRepo<GuestView,String>{
    @Query(value = "SELECT * FROM lan_dbplt.tamu WHERE ID_PERUSAHAAN = ?1;", nativeQuery = true)
    List<GuestView> findGuestViewByIDCompany(String id_perusahaan);
}
