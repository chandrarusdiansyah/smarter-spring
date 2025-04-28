package com.sentinel.smarter.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.models.view.UserAccessView;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface UserAccessViewRepo extends ReadOnlyRepo<UserAccessView,String> {
    @Query(value = "SELECT * FROM lan_dbsmt.pengguna_akses WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<UserAccessView> findUserAccessByIDCompany(String id_perusahaan);
}
