package com.sentinel.smarter.modules.pelita.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.sentinel.smarter.modules.pelita.payloads.request.OrderInfrastructureRequest;
import com.sentinel.smarter.modules.pelita.services.OrderInfrastructureService;
import com.sentinel.smarter.payloads.response.Response;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/pelita/buV3dqCxZR")
public class OrderInfrastructureControl {
    @Autowired
    private OrderInfrastructureService orderInfrastructureService;

    //view

    @GetMapping("/v1/{id_pesan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> findOrderInfrastructureViewByIDOrder(@PathVariable("id_pesan") String id_pesan) {
        try {
            Response response = orderInfrastructureService.findOrderInfrastructureViewByIDOrder(id_pesan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v2/{id_perusahaan}/{tanggal}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> findOrderInfrastructureViewBySingeDate(@PathVariable("id_perusahaan") String id_perusahaan, @PathVariable("tanggal") String tanggal) {
        try {
            Response response = orderInfrastructureService.findOrderInfrastructureViewBySingeDate(id_perusahaan, tanggal);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //control

    @PostMapping
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> addOrderInfrastructure (@RequestBody OrderInfrastructureRequest request){
        try {
            Response response = orderInfrastructureService.addOrderInfrastructure(request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        } 
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> deleteOrdertByID(@PathVariable("id") String id) {
        try {
            Response response = orderInfrastructureService.deleteOrderInfrastructureByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }     
    }
}
