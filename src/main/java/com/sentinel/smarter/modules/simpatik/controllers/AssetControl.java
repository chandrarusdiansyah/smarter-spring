package com.sentinel.smarter.modules.simpatik.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.sentinel.smarter.modules.simpatik.payloads.request.AssetRequest;
import com.sentinel.smarter.modules.simpatik.services.AssetService;
import com.sentinel.smarter.payloads.response.Response;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/simpatik/Xr9aE3e1Eh")
public class AssetControl {
    @Autowired
    private AssetService assetService;

    //view 

    @GetMapping("/v1/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SIMPATIK')")
    public ResponseEntity<?> findAssetByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
      try {
          Response response = assetService.findAssetByIDCompany(id_perusahaan);
          return ResponseEntity.status(response.getStatus()).body(response);
      } catch (Exception e) {
          return ResponseEntity.internalServerError().body(e.getMessage());
      }
    }

    @GetMapping("/v2/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SIMPATIK')")
    public ResponseEntity<?> findAssetViewByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
      try {
          Response response = assetService.findAssetViewByIDCompany(id_perusahaan);
          return ResponseEntity.status(response.getStatus()).body(response);
      } catch (Exception e) {
          return ResponseEntity.internalServerError().body(e.getMessage());
      }
    }

    //reference

    @GetMapping("/reference/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SIMPATIK') or hasAuthority('PELITA')")
    public ResponseEntity<?> findReferenceByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
      try {
          Response response = assetService.findReferenceByIDCompany(id_perusahaan);
          return ResponseEntity.status(response.getStatus()).body(response);
      } catch (Exception e) {
          return ResponseEntity.internalServerError().body(e.getMessage());
      }
    }

    //control

    @PostMapping
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SIMPATIK')")
    public ResponseEntity<?> addAsset (@RequestBody AssetRequest request){
        try {
            Response response = assetService.addAsset(request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        } 
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SIMPATIK')")
    public ResponseEntity<?> getAssetByID(@PathVariable("id") String id) {
        try {
            Response response = assetService.getAssetByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }     
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SIMPATIK')")
    public ResponseEntity<?> updateAssetByID(@PathVariable("id") String id, @RequestBody AssetRequest request) {
        try {
            Response response = assetService.updateAssetByID(id, request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }    
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SIMPATIK')")
    public ResponseEntity<?> deleteAssetByID(@PathVariable("id") String id) {
        try {
            Response response = assetService.deleteAssetByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }     
    }

}
