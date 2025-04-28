package com.sentinel.smarter.modules.supplies.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.sentinel.smarter.modules.supplies.payloads.request.TransactionRequest;
import com.sentinel.smarter.modules.supplies.services.TransactionService;
import com.sentinel.smarter.payloads.response.Response;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/supplies/SCaIKQ2lXa")
public class TransactionControl {
    @Autowired
    private TransactionService transactionService;

    //view
    
    @GetMapping("/v1/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SUPPLIES')")
    public ResponseEntity<?> findTransactionViewByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = transactionService.findTransactionViewByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
    
    @GetMapping("/v2/{id_perusahaan}/{id_jenis_transaksi}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SUPPLIES')")
    public ResponseEntity<?> findTransactionViewByIDTransactionType(@PathVariable("id_perusahaan") String id_perusahaan, @PathVariable("id_jenis_transaksi") String id_jenis_transaksi) {
        try {
            Response response = transactionService.findTransactionViewByIDTransactionType(id_perusahaan, id_jenis_transaksi);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //reference

    @GetMapping("/reference/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SUPPLIES')")
    public ResponseEntity<?> findReferenceByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = transactionService.findReferenceByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //control

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SUPPLIES')")
    public ResponseEntity<?> getTransactionByID(@PathVariable("id") String id) {
        try {
            Response response = transactionService.getTransactionByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }     
    }

    @PostMapping
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SUPPLIES')")
    public ResponseEntity<?> addTransaction (@RequestBody TransactionRequest request){
        try {
            Response response = transactionService.addTransaction(request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        } 
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SUPPLIES')")
    public ResponseEntity<?> updateTransactionByID(@PathVariable("id") String id, @RequestBody TransactionRequest request) {
        try {
            Response response = transactionService.updateTransactionByID(id, request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SUPPLIES')")
    public ResponseEntity<?> deleteTransactionByID(@PathVariable("id") String id) {
        try {
            Response response = transactionService.deleteTransactionByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
