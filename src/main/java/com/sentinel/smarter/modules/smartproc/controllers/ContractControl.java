package com.sentinel.smarter.modules.smartproc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.sentinel.smarter.modules.smartproc.payloads.request.ContractRequest;
import com.sentinel.smarter.modules.smartproc.services.ContractService;
import com.sentinel.smarter.payloads.response.Response;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/smartproc/SVpK7juIBs")
public class ContractControl {
    @Autowired
    private ContractService contractService;

    //view

    @GetMapping("/v1/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTPROC')")
    public ResponseEntity<?> findPartnerByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = contractService.findContractByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v2/{id_perusahaan}/{id_jenis_kontrak}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTPROC')")
    public ResponseEntity<?> findContractByIDContractType(@PathVariable("id_perusahaan") String id_perusahaan, @PathVariable("id_jenis_kontrak") String id_jenis_kontrak) {
        try {
            Response response = contractService.findContractByIDContractType(id_perusahaan, id_jenis_kontrak);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v3/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTPROC')")
    public ResponseEntity<?> findContractContractTypeViewByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = contractService.findContractContractTypeViewByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v4/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTPROC')")
    public ResponseEntity<?> findContractWorkPlaceViewByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = contractService.findContractWorkPlaceViewByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v5/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTPROC')")
    public ResponseEntity<?> findContractValueWorkPlaceViewByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = contractService.findContractValueWorkPlaceViewByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v6/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTPROC')")
    public ResponseEntity<?> findContractNotFinished(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = contractService.findContractNotFinished(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //reference

    @GetMapping("/reference/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTPROC')")
    public ResponseEntity<?> findReferenceByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = contractService.findReferenceByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //control

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTPROC')")
    public ResponseEntity<?> getContractByID(@PathVariable("id") String id) {
        try {
            Response response = contractService.getContractByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }     
    }

    @PostMapping
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTPROC')")
    public ResponseEntity<?> addContract(@RequestBody ContractRequest request){
        try {
            Response response = contractService.addContract(request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        } 
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTPROC')")
    public ResponseEntity<?> updateContractByID(@PathVariable("id") String id, @RequestBody ContractRequest request) {
        try {
            Response response = contractService.updateContractByID(id, request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
