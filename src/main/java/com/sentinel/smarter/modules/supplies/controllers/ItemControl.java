package com.sentinel.smarter.modules.supplies.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.sentinel.smarter.modules.supplies.payloads.request.ItemRequest;
import com.sentinel.smarter.modules.supplies.services.ItemService;
import com.sentinel.smarter.payloads.response.Response;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/supplies/QNHhcop6V9")
public class ItemControl {
    @Autowired
    private ItemService itemService;

    //view
    
    @GetMapping("/v1/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SUPPLIES')")
    public ResponseEntity<?> findItemViewByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = itemService.findItemViewByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v2/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SUPPLIES')")
    public ResponseEntity<?> findItemItemTypeViewByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = itemService.findItemItemTypeViewByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //reference

    @GetMapping("/reference/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SUPPLIES')")
    public ResponseEntity<?> findReferenceByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = itemService.findReferenceByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //control

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SUPPLIES')")
    public ResponseEntity<?> getItemByID(@PathVariable("id") String id) {
        try {
            Response response = itemService.getItemByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }     
    }

    @PostMapping
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SUPPLIES')")
    public ResponseEntity<?> addItem (@RequestBody ItemRequest request){
        try {
            Response response = itemService.addItem(request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        } 
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SUPPLIES')")
    public ResponseEntity<?> updateItemByID(@PathVariable("id") String id, @RequestBody ItemRequest request) {
        try {
            Response response = itemService.updateItemByID(id, request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
