package com.sentinel.smarter.modules.supplies.implementations;


import java.util.List;
import java.util.NoSuchElementException;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.sentinel.smarter.models.view.EmployeeView;
import com.sentinel.smarter.modules.supplies.models.Transaction;
import com.sentinel.smarter.modules.supplies.models.view.TransactionView;
import com.sentinel.smarter.modules.supplies.payloads.request.TransactionRequest;
import com.sentinel.smarter.modules.supplies.repositories.TransactionRepo;
import com.sentinel.smarter.modules.supplies.repositories.view.TransactionViewRepo;
import com.sentinel.smarter.modules.supplies.services.TransactionService;
import com.sentinel.smarter.payloads.response.Response;
import com.sentinel.smarter.repositories.view.EmployeeViewRepo;

@Service
public class TransactionImpl implements TransactionService {
    private ModelMap modelMap = new ModelMap();

    @Autowired
    private TransactionViewRepo transactionViewRepo;
    @Autowired
    private EmployeeViewRepo employeeViewRepo;
    @Autowired
    private TransactionRepo transactionRepo;

    //view

    public Response findTransactionViewByIDCompany(String id_perusahaan){
        List<TransactionView> transactionViews = transactionViewRepo.findTransactionViewByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data transaksi ditemukan", transactionViews);
        return response;
    }

    public Response findTransactionViewByIDTransactionType(String id_perusahaan, String id_jenis_transaksi){
        List<TransactionView> transactionViews = transactionViewRepo.findTransactionViewByIDTransactionType(id_perusahaan, id_jenis_transaksi);
        Response response = new Response(HttpStatus.OK.value(),"data transaksi ditemukan", transactionViews);
        return response;
    }

    //reference

    @Override
    public Response findReferenceByIDCompany(String id_perusahaan){
        modelMap.clear();
        List<EmployeeView> employeeViews = employeeViewRepo.findEmployeeViewByIDCompany(id_perusahaan);
        modelMap.put("employee", employeeViews);
        Response response = new Response(HttpStatus.OK.value(),"data referensi ditemukan", modelMap);
        return response;
    }

    //control

    @Override
    public Response getTransactionByID(String id){
        Transaction transaction = transactionRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data transaksi tidak ditemukan");
        });
        return new Response(HttpStatus.OK.value(), "data transaksi ditemukan", transaction);
    }

    @Override
    public Response addTransaction(TransactionRequest request){
        Transaction transaction = new Transaction();
        transaction.setID_perusahaan(request.getID_perusahaan());
        transaction.setID_jenis_transaksi(request.getID_jenis_transaksi());
        transaction.setTanggal(request.getTanggal());
        transaction.setID_pegawai(request.getID_pegawai());
        transaction.setKeterangan(request.getKeterangan());
        transaction.setTgl_update(LocalDateTime.now().toString());
        transaction.setID_pengguna(request.getID_pengguna());

        transactionRepo.save(transaction);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data transaksi berhasil disimpan");
        response.setData(null);

        return response;
    }

    @Override
    public Response updateTransactionByID(String id, TransactionRequest request){
        Transaction transaction = transactionRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data transaksi tidak ditemukan");
        });

        transaction.setID_perusahaan(request.getID_perusahaan());
        transaction.setID_jenis_transaksi(request.getID_jenis_transaksi());
        transaction.setTanggal(request.getTanggal());
        transaction.setNomor(request.getNomor());
        transaction.setID_pegawai(request.getID_pegawai());
        transaction.setKeterangan(request.getKeterangan());
        transaction.setTgl_update(LocalDateTime.now().toString());
        transaction.setID_pengguna(request.getID_pengguna());

        transactionRepo.save(transaction);

        return new Response(HttpStatus.OK.value(), "data transaksi berhasil disimpan", null);
    }

    @Override
    public Response deleteTransactionByID(String id){
        transactionRepo.deleteById(id);
        return new Response(HttpStatus.OK.value(), "data transaksi berhasil dihapus", null);
    }

}
