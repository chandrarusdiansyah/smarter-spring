package com.sentinel.smarter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sentinel.smarter.payloads.response.Response;
import com.sentinel.smarter.services.MenuService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/menu/B0yRjc6Rxy")
public class MenuControl {
    @Autowired
    private MenuService menuService;

    @GetMapping("/v1/{id_jenis_pengguna}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('ADMINISTRATOR') or hasAuthority('SIMPATIK') or hasAuthority('PELITA') or hasAuthority('PELITA_USER') or hasAuthority('SMARTPROC') or hasAuthority('SUPPLIES') or hasAuthority('SMARTTASK') or hasAuthority('PRESENCE')")
    public ResponseEntity<?> findMenuByIDUserType(@PathVariable("id_jenis_pengguna") String id_jenis_pengguna) {
        try {
            Response response = menuService.findMenuByIDUserType(id_jenis_pengguna);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
