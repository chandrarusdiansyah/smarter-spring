package com.sentinel.smarter.modules.pelita.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.sentinel.smarter.modules.pelita.payloads.request.InfrastructureRequest;
import com.sentinel.smarter.modules.pelita.services.InfrastructureService;
import com.sentinel.smarter.payloads.response.Response;
import com.sentinel.smarter.utilities.PathUtility;

import java.io.File;
import java.io.IOException;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/pelita/db8syijCL9")
public class InfrastructureControl {
    @Autowired
    private InfrastructureService infrastructureService;

    //view

    @GetMapping("/v1/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> findInfrastructureViewByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = infrastructureService.findInfrastructureViewByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    
    @GetMapping("/v2/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> findInfrastructureViewAvailable(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = infrastructureService.findInfrastructureViewAvailable(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v3/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> findInfrastructureConditionViewByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = infrastructureService.findInfrastructureConditionViewByIDCompany(id_perusahaan);
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
            Response response = infrastructureService.findReferenceByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //control

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> getInfrastructureByID(@PathVariable("id") String id) {
        try {
            Response response = infrastructureService.getInfrastructureByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }     
    }

    @PostMapping
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> addInfrastructure (@RequestBody InfrastructureRequest request){
        try {
            Response response = infrastructureService.addInfrastructure(request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        } 
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> updateInfrastructureByID(@PathVariable("id") String id, @RequestBody InfrastructureRequest request) {
        try {
            Response response = infrastructureService.updateInfrastructureByID(id, request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @PostMapping("/photo")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public String fileUpload(@RequestParam("file") MultipartFile multipartFile){
        try {
            File file = new File(PathUtility.SMARTER_IMAGE_REAL_PATH + "infrastructure/" + multipartFile.getOriginalFilename());
            multipartFile.transferTo(file);

            return String.format("File upload successfully");
        } catch (IOException e) {
            return String.format("File upload failed");
        }
    }
}
