package com.sentinel.smarter.modules.pelita.repositories.reference;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.pelita.models.reference.GuestTypeRef;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface GuestTypeRefRepo extends ReadOnlyRepo<GuestTypeRef,String> {
    @Query(value = "SELECT * FROM lan_dbplt.tbl_jenis_tamu WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<GuestTypeRef> findGuestTypeByIDCompany(String id_perusahaan);
}
