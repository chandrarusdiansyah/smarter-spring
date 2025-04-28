package com.sentinel.smarter.modules.smartproc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.sentinel.smarter.modules.smartproc.payloads.request.HandOverRequest;
import com.sentinel.smarter.modules.smartproc.services.HandOverService;
import com.sentinel.smarter.payloads.response.Response;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/smartproc/bMdILss5rq")
public class HandOverControl {
    @Autowired
    private HandOverService handOverService;

    //view

    @GetMapping("/v1/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTPROC')")
    public ResponseEntity<?> findHandOverByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = handOverService.findHandOverByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v2/{id_perusahaan}/{id_kontrak}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTPROC')")
    public ResponseEntity<?> findHandOverByIDContract(@PathVariable("id_perusahaan") String id_perusahaan, @PathVariable("id_kontrak") String id_kontrak) {
        try {
            Response response = handOverService.findHandOverByIDContract(id_perusahaan, id_kontrak);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //control

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTPROC')")
    public ResponseEntity<?> getHandOverByID(@PathVariable("id") String id) {
        try {
            Response response = handOverService.getHandOverByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }     
    }

    @PostMapping
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTPROC')")
    public ResponseEntity<?> addHandOver(@RequestBody HandOverRequest request){
        try {
            Response response = handOverService.addHandOver(request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        } 
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTPROC')")
    public ResponseEntity<?> updateHandOverByID(@PathVariable("id") String id, @RequestBody HandOverRequest request) {
        try {
            Response response = handOverService.updateHandOverByID(id, request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTPROC')")
    public ResponseEntity<?> deleteHandOverByID(@PathVariable("id") String id) {
        try {
            Response response = handOverService.deleteHandOverByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }     
    }
}
