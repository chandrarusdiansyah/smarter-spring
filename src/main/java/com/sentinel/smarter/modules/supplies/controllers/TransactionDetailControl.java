package com.sentinel.smarter.modules.supplies.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sentinel.smarter.modules.supplies.payloads.request.TransactionDetailRequest;
import com.sentinel.smarter.modules.supplies.services.TransactionDetailService;
import com.sentinel.smarter.payloads.response.Response;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/supplies/kuadyutIhL")
public class TransactionDetailControl {
    @Autowired
    private TransactionDetailService transactionDetailService;

    //view
    
    @GetMapping("/v1/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SUPPLIES')")
    public ResponseEntity<?> findTransactionDetailViewByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = transactionDetailService.findTransactionDetailViewByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v2/{id_perusahaan}/{id_jenis_transaksi}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SUPPLIES')")
    public ResponseEntity<?> findTransactionDetailViewByIDTransactionType(@PathVariable("id_perusahaan") String id_perusahaan, @PathVariable("id_jenis_transaksi") String id_jenis_transaksi) {
        try {
            Response response = transactionDetailService.findTransactionDetailViewByIDTransactionType(id_perusahaan, id_jenis_transaksi);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v3/{id_transaksi}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SUPPLIES')")
    public ResponseEntity<?> findTransactionDetailViewByIDTransaction(@PathVariable("id_transaksi") String id_transaksi) {
        try {
            Response response = transactionDetailService.findTransactionDetailViewByIDTransaction(id_transaksi);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //control

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SUPPLIES')")
    public ResponseEntity<?> getTransactionDetailByID(@PathVariable("id") String id) {
        try {
            Response response = transactionDetailService.getTransactionDetailByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }     
    }

    @PostMapping
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SUPPLIES')")
    public ResponseEntity<?> addTransactionDetail (@RequestBody TransactionDetailRequest request){
        try {
            Response response = transactionDetailService.addTransactionDetail(request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        } 
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SUPPLIES')")
    public ResponseEntity<?> updateTransactionDetailByID(@PathVariable("id") String id, @RequestBody TransactionDetailRequest request) {
        try {
            Response response = transactionDetailService.updateTransactionDetailByID(id, request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SUPPLIES')")
    public ResponseEntity<?> deleteTransactionDetailByID(@PathVariable("id") String id) {
        try {
            Response response = transactionDetailService.deleteTransactionDetailByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
