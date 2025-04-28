package com.sentinel.smarter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.sentinel.smarter.payloads.request.WorkPlaceRequest;
import com.sentinel.smarter.payloads.response.Response;
import com.sentinel.smarter.services.WorkPlaceService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/smarter/Q0EiEPGDl9")
public class WorkPlaceControl {
     @Autowired
    private WorkPlaceService workPlaceService;

    //list
    
    @GetMapping("/v1/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('ADMINISTRATOR') or hasAuthority('PELITA') or hasAuthority('SIMPATIK') or hasAuthority('PELITA_USER') or hasAuthority('PRESENCE')")
    public ResponseEntity<?> findWorkPlaceByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = workPlaceService.findWorkPlaceByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //control

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('ADMINISTRATOR')")
    public ResponseEntity<?> getWorkPlaceByID(@PathVariable("id") String id) {
        try {
            Response response = workPlaceService.getWorkPlaceByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }     
    }

    @PostMapping
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('ADMINISTRATOR')")
    public ResponseEntity<?> addWorkPlace (@RequestBody WorkPlaceRequest request){
        try {
            Response response = workPlaceService.addWorkPlace(request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        } 
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('ADMINISTRATOR')")
    public ResponseEntity<?> updatePlaceByID(@PathVariable("id") String id, @RequestBody WorkPlaceRequest request) {
        try {
            Response response = workPlaceService.updateWorkPlaceByID(id, request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
