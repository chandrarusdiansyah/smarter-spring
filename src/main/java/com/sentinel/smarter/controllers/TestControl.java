package com.sentinel.smarter.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/test")
public class TestControl {
    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }

    @GetMapping("/user")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('ADMINISTRATOR') or hasAuthority('USER')")
    public String userAccess() {
        return "User Content.";
    }

    @GetMapping("/developer")
    @PreAuthorize("hasAuthority('DEVELOPER')")
    public String developerAccess() {
        return "Developer Board.";
    }

    @GetMapping("/administrator")
    @PreAuthorize("hasAuthority('ADMINISTRATOR')")
    public String adminAccess() {
        return "Admin Board.";
    }
}
