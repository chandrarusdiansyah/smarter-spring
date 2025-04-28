package com.sentinel.smarter.modules.presence.repositories.reference;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.presence.models.reference.PresenceStatusRef;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface PresenceStatusRefRepo extends ReadOnlyRepo<PresenceStatusRef,String>{
    @Query(value = "SELECT * FROM lan_dbprc.tbl_status_presensi WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<PresenceStatusRef> findPresenceStatusByIDCompany(String id_perusahaan);    
}
