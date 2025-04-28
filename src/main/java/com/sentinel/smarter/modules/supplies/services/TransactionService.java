package com.sentinel.smarter.modules.supplies.services;

import com.sentinel.smarter.modules.supplies.payloads.request.TransactionRequest;
import com.sentinel.smarter.payloads.response.Response;

public interface TransactionService {
    //view
    Response findTransactionViewByIDCompany(String id_perusahaan);
    Response findTransactionViewByIDTransactionType(String id_perusahaan, String id_jenis_transaksi);
    //reference
    Response findReferenceByIDCompany(String id_perusahaan);
    //control
    Response getTransactionByID(String id);
    Response addTransaction(TransactionRequest request);
    Response updateTransactionByID(String id, TransactionRequest request);
    Response deleteTransactionByID(String id);
}
