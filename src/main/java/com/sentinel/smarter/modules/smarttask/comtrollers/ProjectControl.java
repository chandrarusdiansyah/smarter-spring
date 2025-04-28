package com.sentinel.smarter.modules.smarttask.comtrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.sentinel.smarter.modules.smarttask.payloads.request.ProjectRequest;
import com.sentinel.smarter.modules.smarttask.services.ProjectService;
import com.sentinel.smarter.payloads.response.Response;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/smarttask/hsTqxSDsZk")
public class ProjectControl {
    @Autowired
    private ProjectService projectService;

    //list
    
    @GetMapping("/v1/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTTASK')")
    public ResponseEntity<?> findProjectByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = projectService.findProjectByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //control

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTTASK')")
    public ResponseEntity<?> getProjectByID(@PathVariable("id") String id) {
        try {
            Response response = projectService.getProjectByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }     
    }

    @PostMapping
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTTASK')")
    public ResponseEntity<?> addProject (@RequestBody ProjectRequest request){
        try {
            Response response = projectService.addProject(request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        } 
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTTASK')")
    public ResponseEntity<?> updateProjectByID(@PathVariable("id") String id, @RequestBody ProjectRequest request) {
        try {
            Response response = projectService.updateProjectByID(id, request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
