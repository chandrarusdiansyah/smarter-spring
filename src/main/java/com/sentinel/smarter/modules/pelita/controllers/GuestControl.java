package com.sentinel.smarter.modules.pelita.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.sentinel.smarter.modules.pelita.payloads.request.GuestRequest;
import com.sentinel.smarter.modules.pelita.services.GuestService;
import com.sentinel.smarter.payloads.response.Response;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/pelita/OsogM9Dn0f")
public class GuestControl {
    @Autowired
    private GuestService guestService;

    //view

    @GetMapping("/v1/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> findGeustViewByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = guestService.findGuestViewByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //reference

    @GetMapping("/reference/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> findReferenceByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = guestService.findReferenceByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //control

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> getGuestByID(@PathVariable("id") String id) {
        try {
            Response response = guestService.getGuestByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }     
    }

    @PostMapping
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> addGuest (@RequestBody GuestRequest request){
        try {
            Response response = guestService.addGuest(request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        } 
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> updateGuestByID(@PathVariable("id") String id, @RequestBody GuestRequest request) {
        try {
            Response response = guestService.updateGuestByID(id, request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
