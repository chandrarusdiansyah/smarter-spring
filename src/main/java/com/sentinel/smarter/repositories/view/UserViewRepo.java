package com.sentinel.smarter.repositories.view;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.models.view.UserView;

import java.util.List;

@Repository
public interface UserViewRepo extends JpaRepository<UserView,String> {
    Optional<UserView> findByUsername(String nama_pengguna);
    Boolean existsByUsername(String nama_pengguna);
    Boolean existsByEmail(String email);

    @Query(value = "SELECT * FROM lan_dbsmt.pengguna WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<UserView> findUserByIDCompany(String id_perusahaan);
}
