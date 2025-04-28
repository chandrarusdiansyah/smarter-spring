package com.sentinel.smarter.modules.supplies.implementations;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.sentinel.smarter.modules.supplies.models.TransactionDetail;
import com.sentinel.smarter.modules.supplies.models.view.TransactionDetailView;
import com.sentinel.smarter.modules.supplies.payloads.request.TransactionDetailRequest;
import com.sentinel.smarter.modules.supplies.repositories.TransactionDetailRepo;
import com.sentinel.smarter.modules.supplies.repositories.view.TransactionDetailViewRepo;
import com.sentinel.smarter.modules.supplies.services.TransactionDetailService;
import com.sentinel.smarter.payloads.response.Response;

@Service
public class TransactionDetailImpl implements TransactionDetailService {
    @Autowired
    private TransactionDetailViewRepo transactionDetailViewRepo;
    @Autowired
    private TransactionDetailRepo transactionDetailRepo;

    //view

    public Response findTransactionDetailViewByIDCompany(String id_perusahaan){
        List<TransactionDetailView> transactionDetailViews = transactionDetailViewRepo.findTransactionDetailViewByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data transaksi ditemukan", transactionDetailViews);
        return response;
    }

    public Response findTransactionDetailViewByIDTransactionType(String id_perusahaan, String id_jenis_transaksi){
        List<TransactionDetailView> transactionDetailViews = transactionDetailViewRepo.findTransactionDetailViewByIDTransactionType(id_perusahaan, id_jenis_transaksi);
        Response response = new Response(HttpStatus.OK.value(),"data transaksi ditemukan", transactionDetailViews);
        return response;
    }

    public Response findTransactionDetailViewByIDTransaction(String id_transaksi){
        List<TransactionDetailView> transactionDetailViews = transactionDetailViewRepo.findTransactionDetailViewByIDTransaction(id_transaksi);
        Response response = new Response(HttpStatus.OK.value(),"data transaksi ditemukan", transactionDetailViews);
        return response;
    }

    //control

    @Override
    public Response getTransactionDetailByID(String id){
        TransactionDetail transactionDetail = transactionDetailRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data transaksi tidak ditemukan");
        });
        return new Response(HttpStatus.OK.value(), "data transaksi ditemukan", transactionDetail);
    }

    @Override
    public Response addTransactionDetail(TransactionDetailRequest request){
        TransactionDetail transactionDetail = new TransactionDetail();
        transactionDetail.setID_perusahaan(request.getID_perusahaan());
        transactionDetail.setID_jenis_transaksi(request.getID_jenis_transaksi());
        transactionDetail.setID_transaksi(request.getID_transaksi());
        transactionDetail.setID_barang(request.getID_barang());
        transactionDetail.setHarga(request.getHarga());
        transactionDetail.setJumlah(request.getJumlah());
        transactionDetail.setKeterangan(request.getKeterangan());
        transactionDetail.setID_pengguna(request.getID_pengguna());

        transactionDetailRepo.save(transactionDetail);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data transaksi berhasil disimpan");
        response.setData(null);

        return response;
    }

    @Override
    public Response updateTransactionDetailByID(String id, TransactionDetailRequest request){
        TransactionDetail transactionDetail = transactionDetailRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data transaksi tidak ditemukan");
        });

        transactionDetail.setID_perusahaan(request.getID_perusahaan());
        transactionDetail.setID_jenis_transaksi(request.getID_jenis_transaksi());
        transactionDetail.setID_transaksi(request.getID_transaksi());
        transactionDetail.setID_barang(request.getID_barang());
        transactionDetail.setHarga(request.getHarga());
        transactionDetail.setJumlah(request.getJumlah());
        transactionDetail.setKeterangan(request.getKeterangan());
        transactionDetail.setID_pengguna(request.getID_pengguna());

        transactionDetailRepo.save(transactionDetail);

        return new Response(HttpStatus.OK.value(), "data transaksi berhasil disimpan", null);
    }

    @Override
    public Response deleteTransactionDetailByID(String id){
        transactionDetailRepo.deleteById(id);
        return new Response(HttpStatus.OK.value(), "data transaksi berhasil dihapus", null);
    }
}
