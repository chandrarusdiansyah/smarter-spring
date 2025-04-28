package com.sentinel.smarter.modules.smarttask.comtrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.sentinel.smarter.modules.smarttask.payloads.request.TaskManagerRequest;
import com.sentinel.smarter.modules.smarttask.services.TaskManagerService;
import com.sentinel.smarter.payloads.response.Response;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/smarttask/ghlItYFLnB")
public class TaskManagerControl {
    @Autowired
    private TaskManagerService taskManagerService;

    //view
    
    @GetMapping("/v1/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTTASK')")
    public ResponseEntity<?> findTaskManagerViewByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = taskManagerService.findTaskManagerViewByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v2/{id_pegawai}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTTASK')")
    public ResponseEntity<?> findTaskManagerViewByIDEmployee(@PathVariable("id_pegawai") String id_pegawai) {
        try {
            Response response = taskManagerService.findTaskManagerViewByIDEmployee(id_pegawai);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v3/{id_perusahaan}/{id_tugas_status}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTTASK')")
    public ResponseEntity<?> findTaskManagerViewByIDTaskManagerStatus(@PathVariable("id_perusahaan") String id_perusahaan, @PathVariable("id_tugas_status") String id_tugas_status) {
        try {
            Response response = taskManagerService.findTaskManagerViewByIDTaskManagerStatus(id_perusahaan,id_tugas_status);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v4/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTTASK')")
    public ResponseEntity<?> findTaskManagerViewOverdue(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = taskManagerService.findTaskManagerViewOverdue(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //reference

    @GetMapping("/reference/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTTASK')")
    public ResponseEntity<?> findReferenceByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = taskManagerService.findReferenceByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //control

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTTASK')")
    public ResponseEntity<?> getTaskManagerByID(@PathVariable("id") String id) {
        try {
            Response response = taskManagerService.getTaskManagerByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }     
    }

    @PostMapping
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTTASK')")
    public ResponseEntity<?> addTaskManager (@RequestBody TaskManagerRequest request){
        try {
            Response response = taskManagerService.addTaskManager(request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        } 
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTTASK')")
    public ResponseEntity<?> updateTaskManagerByID(@PathVariable("id") String id, @RequestBody TaskManagerRequest request) {
        try {
            Response response = taskManagerService.updateTaskManagerByID(id, request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //graphic

    @GetMapping("/graph/v1/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTTASK')")
    public ResponseEntity<?> findTaskManagerStatusGraphicByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = taskManagerService.findTaskManagerStatusGraphicByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/graph/v2/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTTASK')")
    public ResponseEntity<?> findTaskManagerPriorityGraphicByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = taskManagerService.findTaskManagerPriorityGraphicByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }

    }
        
    @GetMapping("/graph/v3/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTTASK')")
    public ResponseEntity<?> findTaskManagerDivisionGraphicByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = taskManagerService.findTaskManagerDivisionGraphicByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/graph/v4/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('SMARTTASK')")
    public ResponseEntity<?> findTaskManagerWorkPlaceGraphicByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = taskManagerService.findTaskManagerWorkPlaceGraphicByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

}
