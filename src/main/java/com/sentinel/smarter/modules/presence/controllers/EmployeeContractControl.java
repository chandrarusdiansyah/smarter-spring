package com.sentinel.smarter.modules.presence.controllers;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.sentinel.smarter.modules.presence.payloads.request.EmployeeContractRequest;
import com.sentinel.smarter.modules.presence.services.EmployeeContractService;
import com.sentinel.smarter.payloads.response.Response;
import com.sentinel.smarter.utilities.PathUtility;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/presence/uWGJhsPj3D")
public class EmployeeContractControl {
    @Autowired
    private EmployeeContractService employeeContractService;

    //view

    @GetMapping("/v1/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PRESENCE')")
    public ResponseEntity<?> findEmployeeContractViewByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = employeeContractService.findEmployeeContractViewByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v2/{id_satuan_kerja}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PRESENCE')")
    public ResponseEntity<?> findEmployeeContractViewByIDWorkPlace(@PathVariable("id_satuan_kerja") String id_satuan_kerja) {
        try {
            Response response = employeeContractService.findEmployeeContractViewByIDWorkPlace(id_satuan_kerja);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //reference

    @GetMapping("/reference/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PRESENCE')")
    public ResponseEntity<?> findReferenceByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = employeeContractService.findReferenceByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //control

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PRESENCE')")
    public ResponseEntity<?> getEmployeeContractByID(@PathVariable("id") String id) {
        try {
            Response response = employeeContractService.getEmployeeContractByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }     
    }

    @PostMapping
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PRESENCE')")
    public ResponseEntity<?> addEmployeeContract (@RequestBody EmployeeContractRequest request){
        try {
            Response response = employeeContractService.addEmployeeContract(request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        } 
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PRESENCE')")
    public ResponseEntity<?> updateEmployeeContractByID(@PathVariable("id") String id, @RequestBody EmployeeContractRequest request) {
        try {
            Response response = employeeContractService.updateEmployeeContractByID(id, request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @PostMapping("/photo")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PRESENCE')")
    public String fileUpload(@RequestParam("file") MultipartFile multipartFile){
        try {
            File file = new File(PathUtility.SMARTER_IMAGE_REAL_PATH + "employee/" + multipartFile.getOriginalFilename());
            multipartFile.transferTo(file);

            return String.format("File upload successfully");
        } catch (IOException e) {
            return String.format("File upload failed");
        }
    }

    //graphic

    @GetMapping("/graph/v1/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PRESENCE')")
    public ResponseEntity<?> findEmployeeContractGenderGraphicByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = employeeContractService.findEmployeeContractGenderGraphicByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/graph/v2/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PRESENCE')")
    public ResponseEntity<?> findEmployeeContractWorkTypeGraphicByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = employeeContractService.findEmployeeContractWorkTypeGraphicByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //android

    @GetMapping("/android/v1/{nik}")
    public ResponseEntity<?> findEmployeeContractViewByCardID(@PathVariable("nik") String nik) {
        try {
            Response response = employeeContractService.findEmployeeContractViewByCardID(nik);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/android/v2/{id}")
    public ResponseEntity<?> findEmployeeContractViewByID(@PathVariable("id") String id) {
        try {
            Response response = employeeContractService.findEmployeeContractViewByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

}
