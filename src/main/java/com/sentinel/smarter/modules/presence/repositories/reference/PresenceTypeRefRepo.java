package com.sentinel.smarter.modules.presence.repositories.reference;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.presence.models.reference.PresenceTypeRef;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface PresenceTypeRefRepo extends ReadOnlyRepo<PresenceTypeRef,String> {
    @Query(value = "SELECT * FROM lan_dbprc.tbl_status_presensi WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<PresenceTypeRef> findPresenceStatusByIDCompany(String id_perusahaan);    
}
