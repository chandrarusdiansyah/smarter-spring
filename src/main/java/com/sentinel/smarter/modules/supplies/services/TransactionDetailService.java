package com.sentinel.smarter.modules.supplies.services;

import com.sentinel.smarter.modules.supplies.payloads.request.TransactionDetailRequest;
import com.sentinel.smarter.payloads.response.Response;

public interface TransactionDetailService {
    //view
    Response findTransactionDetailViewByIDCompany(String id_perusahaan);
    Response findTransactionDetailViewByIDTransactionType(String id_perusahaan, String id_jenis_transaksi);
    Response findTransactionDetailViewByIDTransaction(String id_transaksi);
    //control
    Response getTransactionDetailByID(String id);
    Response addTransactionDetail(TransactionDetailRequest request);
    Response updateTransactionDetailByID(String id, TransactionDetailRequest request);
    Response deleteTransactionDetailByID(String id);
}
