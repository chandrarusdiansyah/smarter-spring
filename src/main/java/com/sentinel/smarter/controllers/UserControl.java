package com.sentinel.smarter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.sentinel.smarter.payloads.request.UserRequest;
import com.sentinel.smarter.payloads.response.Response;
import com.sentinel.smarter.services.UserService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/smarter/7PnRJzR04M")
public class UserControl {
    
    @Autowired
    private UserService userService;

    //list

    @GetMapping("/v1/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('ADMINISTRATOR')")
    public ResponseEntity<?> findUserByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = userService.findUserByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v2/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('ADMINISTRATOR')")
    public ResponseEntity<?> findUserAccessByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = userService.findUserAccessByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //reference

    @GetMapping("/reference/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('ADMINISTRATOR')")
    public ResponseEntity<?> findReferenceByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = userService.findReferenceByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //control

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('ADMINISTRATOR')")
    public ResponseEntity<?> getUserByID(@PathVariable("id") String id) {
        try {
            Response response = userService.getUserByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }     
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('ADMINISTRATOR')")
    public ResponseEntity<?> updateUserByID(@PathVariable("id") String id, @RequestBody UserRequest request) {
        try {
            Response response = userService.updateUserByID(id, request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
