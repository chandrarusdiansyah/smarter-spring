package com.sentinel.smarter.modules.supplies.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.supplies.models.view.TransactionView;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface TransactionViewRepo extends ReadOnlyRepo<TransactionView,String> {
    @Query(value = "SELECT * FROM lan_dbspl.transaksi WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<TransactionView> findTransactionViewByIDCompany(String id_perusahaan);

    @Query(value = "SELECT * FROM lan_dbspl.transaksi WHERE ID_PERUSAHAAN = ?1 AND ID_JENIS_TRANSAKSI = ?2", nativeQuery = true)
    List<TransactionView> findTransactionViewByIDTransactionType(String id_perusahaan, String id_jenis_transaksi);
}
