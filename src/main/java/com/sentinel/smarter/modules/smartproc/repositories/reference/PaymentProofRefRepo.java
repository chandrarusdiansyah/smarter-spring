package com.sentinel.smarter.modules.smartproc.repositories.reference;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.smartproc.models.reference.PaymentProofRef;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface PaymentProofRefRepo extends ReadOnlyRepo<PaymentProofRef,String> {
    @Query(value = "SELECT * FROM lan_dbspc.tbl_bukti_bayar WHERE ID_PERUSAHAAN = ?1;", nativeQuery = true)
    List<PaymentProofRef> findPaymentProofReferenceByIDCompany(String id_perusahaan);
}
