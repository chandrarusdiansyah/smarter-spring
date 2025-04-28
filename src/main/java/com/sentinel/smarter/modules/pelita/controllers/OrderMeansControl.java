package com.sentinel.smarter.modules.pelita.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.sentinel.smarter.modules.pelita.payloads.request.OrderMeansRequest;
import com.sentinel.smarter.modules.pelita.services.OrderMeansService;
import com.sentinel.smarter.payloads.response.Response;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/pelita/f2yQXL0k0R")
public class OrderMeansControl {
    @Autowired
    private OrderMeansService orderMeansService;

    //view

    @GetMapping("/v1/{id_pesan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> findOrderMeansViewByIDOrder(@PathVariable("id_pesan") String id_pesan) {
        try {
            Response response = orderMeansService.findOrderMeansViewByIDOrder(id_pesan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v2/{id_perusahaan}/{tanggal}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> findOrderMeansViewBySingeDate(@PathVariable("id_perusahaan") String id_perusahaan, @PathVariable("tanggal") String tanggal) {
        try {
            Response response = orderMeansService.findOrderMeansViewBySingeDate(id_perusahaan, tanggal);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //control

    @PostMapping
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> addOrderMeans (@RequestBody OrderMeansRequest request){
        try {
            Response response = orderMeansService.addOrderMeans(request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        } 
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> deleteOrdertByID(@PathVariable("id") String id) {
        try {
            Response response = orderMeansService.deleteOrderMeansByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }     
    }
}
