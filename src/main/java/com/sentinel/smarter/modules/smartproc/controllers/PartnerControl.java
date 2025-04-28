package com.sentinel.smarter.modules.smartproc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.sentinel.smarter.modules.smartproc.payloads.request.PartnerRequest;
import com.sentinel.smarter.modules.smartproc.services.PartnerService;
import com.sentinel.smarter.payloads.response.Response;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/smartproc/dhzaTEt7Up")
public class PartnerControl {
    @Autowired
    private PartnerService partnerService;

    //list

    @GetMapping("/v1/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTPROC')")
    public ResponseEntity<?> findPartnerByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = partnerService.findPartnerByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //control

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTPROC')")
    public ResponseEntity<?> getPartnerByID(@PathVariable("id") String id) {
        try {
            Response response = partnerService.getPartnerByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }     
    }

    @PostMapping
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTPROC')")
    public ResponseEntity<?> addPartner(@RequestBody PartnerRequest request){
        try {
            Response response = partnerService.addPartner(request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        } 
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTPROC')")
    public ResponseEntity<?> updatePartnerByID(@PathVariable("id") String id, @RequestBody PartnerRequest request) {
        try {
            Response response = partnerService.updatePartnerByID(id, request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

}
