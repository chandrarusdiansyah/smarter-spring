package com.sentinel.smarter.modules.simpatik.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.sentinel.smarter.modules.simpatik.payloads.request.AlocationRequest;
import com.sentinel.smarter.modules.simpatik.services.AlocationService;
import com.sentinel.smarter.payloads.response.Response;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/simpatik/Xjk0hsgeaK")
public class AllocationControl {
    @Autowired
    private AlocationService alocationService;
        
    //view

    @GetMapping("/v1/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SIMPATIK')")
    public ResponseEntity<?> findAclocationViewByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = alocationService.findAclocationViewByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v2/{id_perusahaan}/{id_jenis_barang}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SIMPATIK')")
    public ResponseEntity<?> findAclocationViewByItemType(@PathVariable("id_perusahaan") String id_perusahaan, @PathVariable("id_jenis_barang") String id_jenis_barang) {
        try {
            Response response = alocationService.findAclocationViewByItemType(id_perusahaan, id_jenis_barang);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v3/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SIMPATIK')")
    public ResponseEntity<?> findAclocationWorkUnitViewByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = alocationService.findAclocationWorkUnitViewByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v4/{id_perusahaan}/{id_jenis_barang}/{id_satuan_kerja}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SIMPATIK') or hasAuthority('PELITA')")
    public ResponseEntity<?> findAlocationByIDWorkUnit(@PathVariable("id_perusahaan") String id_perusahaan, @PathVariable("id_jenis_barang") String id_jenis_barang, @PathVariable("id_satuan_kerja") String id_satuan_kerja) {
        try {
            Response response = alocationService.findAlocationByIDWorkUnit(id_perusahaan, id_jenis_barang, id_satuan_kerja);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //reference

    @GetMapping("/reference/{id_perusahaan}/{id_jenis_barang}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SIMPATIK')")
    public ResponseEntity<?> findReferenceByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan, @PathVariable("id_jenis_barang") String id_jenis_barang) {
        try {
            Response response = alocationService.findReferenceByIDCompany(id_perusahaan, id_jenis_barang);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //control

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SIMPATIK')")
    public ResponseEntity<?> getAlocationByID(@PathVariable("id") String id) {
        try {
            Response response = alocationService.getAlocationByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }     
    }

    @PostMapping
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SIMPATIK')")
    public ResponseEntity<?> addAlocation (@RequestBody AlocationRequest request){
        try {
            Response response = alocationService.addAlocation(request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        } 
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SIMPATIK')")
    public ResponseEntity<?> updateAlocationByID(@PathVariable("id") String id, @RequestBody AlocationRequest request) {
        try {
            Response response = alocationService.updateAlocationByID(id, request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }    
    }

}
