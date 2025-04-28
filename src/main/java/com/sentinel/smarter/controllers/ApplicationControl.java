package com.sentinel.smarter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.sentinel.smarter.payloads.request.ApplicationRequest;
import com.sentinel.smarter.payloads.response.Response;
import com.sentinel.smarter.services.ApplicationService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/smarter/0UaXP8qsr7")
public class ApplicationControl {

    @Autowired
	private ApplicationService applicationService;

    //list

    @GetMapping("/v1/{id_perusahaan}")
    public ResponseEntity<?> findApplicationByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = applicationService.findApplicationByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //control

    @GetMapping("/{id}")
    // @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('ADMINISTRATOR')")
    public ResponseEntity<?> getApplicationByID(@PathVariable("id") String id) {
        try {
            Response response = applicationService.getApplicationByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }     
    }

    @PostMapping
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('ADMINISTRATOR')")
    public ResponseEntity<?> addApplication (@RequestBody ApplicationRequest request){
        try {
            Response response = applicationService.addApplication(request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        } 
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('ADMINISTRATOR')")
    public ResponseEntity<?> updateGuestByID(@PathVariable("id") String id, @RequestBody ApplicationRequest request) {
        try {
            Response response = applicationService.updateApplicationByID(id, request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
