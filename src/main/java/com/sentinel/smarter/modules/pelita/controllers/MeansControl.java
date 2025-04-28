package com.sentinel.smarter.modules.pelita.controllers;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.sentinel.smarter.modules.pelita.payloads.request.MeansRequest;
import com.sentinel.smarter.modules.pelita.services.MeansService;
import com.sentinel.smarter.payloads.response.Response;
import com.sentinel.smarter.utilities.PathUtility;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/pelita/Vve7QnEXOl")
public class MeansControl {
    @Autowired
    private MeansService meansService;

    //view

    @GetMapping("/v1/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> findMeansViewByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = meansService.findMeansViewByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v2/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> findMeansViewAvailable(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = meansService.findMeansViewAvailable(id_perusahaan);
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
            Response response = meansService.findReferenceByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //control

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> getMeansByID(@PathVariable("id") String id) {
        try {
            Response response = meansService.getMeansByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }     
    }

    @PostMapping
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> addMeans (@RequestBody MeansRequest request){
        try {
            Response response = meansService.addMeans(request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        } 
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> updateMeansByID(@PathVariable("id") String id, @RequestBody MeansRequest request) {
        try {
            Response response = meansService.updateMeansByID(id, request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @PostMapping("/photo")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public String fileUpload(@RequestParam("file") MultipartFile multipartFile){
        try {
            File file = new File(PathUtility.SMARTER_IMAGE_REAL_PATH + "means/" + multipartFile.getOriginalFilename());
            multipartFile.transferTo(file);

            return String.format("File upload successfully");
        } catch (IOException e) {
            return String.format("File upload failed");
        }
    }
}
