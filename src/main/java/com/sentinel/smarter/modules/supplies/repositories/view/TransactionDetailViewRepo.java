package com.sentinel.smarter.modules.supplies.repositories.view;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.sentinel.smarter.modules.supplies.models.view.TransactionDetailView;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface TransactionDetailViewRepo extends ReadOnlyRepo<TransactionDetailView,String> {
    @Query(value = "SELECT * FROM lan_dbspl.transaksi_detail WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<TransactionDetailView> findTransactionDetailViewByIDCompany(String id_perusahaan);

    @Query(value = "SELECT * FROM lan_dbspl.transaksi_detail WHERE ID_PERUSAHAAN = ?1 AND ID_JENIS_TRANSAKSI = ?2", nativeQuery = true)
    List<TransactionDetailView> findTransactionDetailViewByIDTransactionType(String id_perusahaan, String id_jenis_transaksi);

    @Query(value = "SELECT * FROM lan_dbspl.transaksi_detail WHERE ID_TRANSAKSI = ?1", nativeQuery = true)
    List<TransactionDetailView> findTransactionDetailViewByIDTransaction(String id_transaksi);
}
