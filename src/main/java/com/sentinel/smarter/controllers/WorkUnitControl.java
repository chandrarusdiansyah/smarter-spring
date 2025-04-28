package com.sentinel.smarter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.sentinel.smarter.payloads.request.WorkUnitRequest;
import com.sentinel.smarter.payloads.response.Response;
import com.sentinel.smarter.services.WorkUnitService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/smarter/twrK34g7Ld")
public class WorkUnitControl {
    @Autowired
    private WorkUnitService workUnitService;

    //list
    
    @GetMapping("/v1/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('ADMINISTRATOR')")
    public ResponseEntity<?> findWorkUnitByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = workUnitService.findWorkUnitByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

        //control

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('ADMINISTRATOR')")
    public ResponseEntity<?> getWorkUnitByID(@PathVariable("id") String id) {
        try {
            Response response = workUnitService.getWorkUnitByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }     
    }

    @PostMapping
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('ADMINISTRATOR')")
    public ResponseEntity<?> addWorkUnit (@RequestBody WorkUnitRequest request){
        try {
            Response response = workUnitService.addWorkUnit(request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        } 
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('ADMINISTRATOR')")
    public ResponseEntity<?> updateUnitByID(@PathVariable("id") String id, @RequestBody WorkUnitRequest request) {
        try {
            Response response = workUnitService.updateWorkUnitByID(id, request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
