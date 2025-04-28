package com.sentinel.smarter.modules.smarttask.comtrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.sentinel.smarter.modules.smarttask.payloads.request.DailyTaskRequest;
import com.sentinel.smarter.modules.smarttask.services.DailyTaskService;
import com.sentinel.smarter.payloads.response.Response;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/smarttask/MvYbHR9ug5")
public class DailyTaskControl {
    @Autowired
    private DailyTaskService dailyTaskService;

    //list
    
    @GetMapping("/v1/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTTASK')")
    public ResponseEntity<?> findDailyTaskViewByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = dailyTaskService.findDailyTaskViewByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v2/{id_pegawai}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTTASK')")
    public ResponseEntity<?> findDailyTaskViewByIDEmployee(@PathVariable("id_pegawai") String id_pegawai) {
        try {
            Response response = dailyTaskService.findDailyTaskViewByIDEmployee(id_pegawai);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }


    //control

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTTASK')")
    public ResponseEntity<?> getDailyTaskByID(@PathVariable("id") String id) {
        try {
            Response response = dailyTaskService.getDailyTaskByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }     
    }

    @PostMapping
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTTASK')")
    public ResponseEntity<?> addDailyTask (@RequestBody DailyTaskRequest request){
        try {
            Response response = dailyTaskService.addDailyTask(request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        } 
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTTASK')")
    public ResponseEntity<?> updateDailyTasktByID(@PathVariable("id") String id, @RequestBody DailyTaskRequest request) {
        try {
            Response response = dailyTaskService.updateDailyTasktByID(id, request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
