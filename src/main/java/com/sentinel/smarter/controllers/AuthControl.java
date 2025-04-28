package com.sentinel.smarter.controllers;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.sentinel.smarter.models.User;
import com.sentinel.smarter.payloads.request.LoginRequest;
import com.sentinel.smarter.payloads.request.UserRequest;
import com.sentinel.smarter.payloads.response.JwtResponse;
import com.sentinel.smarter.payloads.response.Response;
import com.sentinel.smarter.repositories.UserRepo;
import com.sentinel.smarter.repositories.view.UserViewRepo;
import com.sentinel.smarter.securities.jwt.JwtUtils;
import com.sentinel.smarter.securities.services.UserDetailsImpl;


@CrossOrigin
@RestController
@RequestMapping("/auth")
public class AuthControl {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserViewRepo userViewRepo;
    
    @Autowired
    UserRepo userRepo;

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    JwtUtils jwtUtils;

    @PostMapping("/signin")
    public Response authenticateUser(@Valid @RequestBody LoginRequest request) {

        Authentication authentication = authenticationManager
            .authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtils.generateJwtToken(authentication);
        
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();

        // ResponseCookie jwtCookie = jwtUtils.generateJwtCookie(userDetails);

        List<String> roles = userDetails.getAuthorities().stream()
            .map(item -> item.getAuthority())
            .collect(Collectors.toList());


        Response response = new Response(HttpStatus.OK.value(),"data pengguna ditemukan", new JwtResponse(
            userDetails.getId(),
            userDetails.getUsername(),
            jwt,
            userDetails.getID_aplikasi(),
            userDetails.getID_jenis_pengguna(),
            userDetails.getID_pegawai(),
            userDetails.getNip_pegawai(),
            userDetails.getNama_pegawai(),
            userDetails.getFoto_pegawai(),
            userDetails.getTautan(),
            roles));

        return response;

        // return ResponseEntity.ok(new JwtResponse(
        //     userDetails.getId(),
        //     userDetails.getUsername(),
        //     jwt,
        //     userDetails.getID_pegawai(),
        //     userDetails.getNip_pegawai(),
        //     userDetails.getNama_pegawai(),
        //     userDetails.getFoto_pegawai(),
        //     userDetails.getTautan(),
        //     roles));
        

        
        // return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, jwtCookie.toString())
        //     .body(new UserInfoResponse(userDetails.getId(),
        //                             userDetails.getUsername(),
        //                             userDetails.getEmail(),
        //                             roles));
    }

    @PostMapping("/signup")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('ADMINISTRATOR')")
    public Response registerUser(@Valid @RequestBody UserRequest request) {
    if (userViewRepo.existsByUsername(request.getNama_pengguna())) {
        return new Response(HttpStatus.FORBIDDEN.value(), "username telah digunakan", null);
    }
    User user = new User(request.getID_perusahaan(),
                        request.getID_aplikasi(),
                        request.getID_jenis_pengguna(),
                        request.getID_pegawai(),
                        request.getNama_pengguna(),
                        encoder.encode(request.getKata_sandi()),
                        request.getIp_registrasi(),
                        request.getID_pengguna());

                        userRepo.save(user);
        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data user berhasil disimpan");
        response.setData(null);
        return response;
    }

    @PutMapping("/{id}")
    // @PreAuthorize("hasAuthority('DEVELOPER')")
    public Response changePassword(@PathVariable("id") String id, @RequestBody UserRequest request) {
        User user = userRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data user tidak ditemukan");
        });
        user.setKata_sandi(encoder.encode(request.getKata_sandi()));
        userRepo.save(user);
        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data user berhasil disimpan");
        response.setData(null);
        return response;
    }

    // @PostMapping("/signout")
    // public ResponseEntity<?> logoutUser() {
    //     ResponseCookie cookie = jwtUtils.getCleanJwtCookie();
    //     return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, cookie.toString())
    //         .body(new MessageResponse("anda telah keluar dari aplikasi"));
    // }
}
