package com.sentinel.smarter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.sentinel.smarter.payloads.request.PositionRequest;
import com.sentinel.smarter.payloads.response.Response;
import com.sentinel.smarter.services.PositionService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/smarter/PKdCaOZZFt")
public class PositionControl {
    @Autowired
    private PositionService positionService;

    //list
    
    @GetMapping("/v1/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('ADMINISTRATOR')")
    public ResponseEntity<?> findPositionByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = positionService.findPositionByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //control

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('ADMINISTRATOR')")
    public ResponseEntity<?> getPositionByID(@PathVariable("id") String id) {
        try {
            Response response = positionService.getPositionByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }     
    }

    @PostMapping
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('ADMINISTRATOR')")
    public ResponseEntity<?> addPosition (@RequestBody PositionRequest request){
        try {
            Response response = positionService.addPosition(request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        } 
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('ADMINISTRATOR')")
    public ResponseEntity<?> updatePositionByID(@PathVariable("id") String id, @RequestBody PositionRequest request) {
        try {
            Response response = positionService.updatePositionByID(id, request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
