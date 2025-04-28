package com.sentinel.smarter.modules.pelita.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.sentinel.smarter.models.enumerator.JasperEnum;
import com.sentinel.smarter.modules.pelita.models.view.OrderInfrastructureView;
import com.sentinel.smarter.modules.pelita.models.view.OrderView;
import com.sentinel.smarter.modules.pelita.payloads.request.OrderRequest;
import com.sentinel.smarter.modules.pelita.repositories.view.OrderInfrastructureViewRepo;
import com.sentinel.smarter.modules.pelita.repositories.view.OrderViewRepo;
import com.sentinel.smarter.modules.pelita.services.OrderService;
import com.sentinel.smarter.payloads.response.Response;
import com.sentinel.smarter.services.JasperGenerator;
import com.sentinel.smarter.utilities.PathUtility;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource;

@Slf4j
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/pelita/PMcFRg6P40")
@RequiredArgsConstructor
public class OrderControl {

    final static DateTimeFormatter CUSTOM_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private OrderService orderService;
    @Autowired
    private JasperGenerator jasperGenerator;
    @Autowired
    private OrderViewRepo orderViewRepo;
    @Autowired
    private OrderInfrastructureViewRepo orderInfrastructureViewRepo;

    //view

    @GetMapping("/v1/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> findOrderViewByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = orderService.findOrderViewByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v2/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> findOrderCalendarMonthViewByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = orderService.findOrderCalendarMonthViewByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v3/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> findInfrastructureCalendarWeekViewByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = orderService.findInfrastructureCalendarWeekViewByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v4/{id_perusahaan}/{id_prasarana}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> findInfrastructureCalendarWeekViewByIDInfrastructure(@PathVariable("id_perusahaan") String id_perusahaan, @PathVariable("id_prasarana") String id_prasarana) {
        try {
            Response response = orderService.findInfrastructureCalendarWeekViewByIDInfrastructure(id_perusahaan, id_prasarana);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v5/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> findMeansCalendarWeekViewByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = orderService.findMeansCalendarWeekViewByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v6/{id_perusahaan}/{id_sarana}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> findMeansCalendarWeekViewByIDMeans(@PathVariable("id_perusahaan") String id_perusahaan, @PathVariable("id_sarana") String id_sarana) {
        try {
            Response response = orderService.findMeansCalendarWeekViewByIDMeans(id_perusahaan, id_sarana);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v7/{id_perusahaan}/{id_satuan_kerja}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> findOrderCalendarMonthViewByIDWorkPlace(@PathVariable("id_perusahaan") String id_perusahaan, @PathVariable("id_satuan_kerja") String id_satuan_kerja) {
        try {
            Response response = orderService.findOrderCalendarMonthViewByIDWorkPlace(id_perusahaan, id_satuan_kerja);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/v8/{id_perusahaan}/{id_satuan_kerja}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> findInfrastructureCalendarWeekViewByIDWorkPlace(@PathVariable("id_perusahaan") String id_perusahaan, @PathVariable("id_satuan_kerja") String id_satuan_kerja) {
        try {
            Response response = orderService.findInfrastructureCalendarWeekViewByIDWorkPlace(id_perusahaan, id_satuan_kerja);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //control

     @GetMapping("/{id}")
     @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
     public ResponseEntity<?> getOrderByID(@PathVariable("id") String id) {
         try {
             Response response = orderService.getOrderByID(id);
             return ResponseEntity.status(response.getStatus()).body(response);
         } catch (Exception e) {
             return ResponseEntity.internalServerError().body(e.getMessage());
         }     
     }

    @PostMapping
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> addOrder (@RequestBody OrderRequest request){
        try {
            Response response = orderService.addOrder(request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        } 
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> updateOrderByID(@PathVariable("id") String id, @RequestBody OrderRequest request) {
        try {
            Response response = orderService.updateOrderByID(id, request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> deleteOrdertByID(@PathVariable("id") String id) {
        try {
            Response response = orderService.deleteOrderByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }     
    }

    //Report

    @GetMapping("/print")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PELITA') or hasAuthority('PELITA_USER')")
    public ResponseEntity<?> print(@RequestParam("bookingID") String id, @RequestParam("fileType") String tipe) {
      try {
        
        JasperEnum jasperEnum = JasperEnum.valueOf(tipe);

        OrderView orderView = orderViewRepo.findOrderViewByID(id);

        Map<String,Object> param = new HashMap<>();
        param.put("real_path", PathUtility.SMARTER_JASPER_REAL_PATH);
        param.put("nomor", orderView.getNomor());
        param.put("tanggal", orderView.getTanggal());
        param.put("nama_jenis_tamu", orderView.getNama_jenis_tamu());
        param.put("nama_tamu", orderView.getNama_tamu());
        param.put("instansi_tamu", orderView.getInstansi_tamu());
        param.put("tgl_masuk", orderView.getTgl_masuk());
        param.put("tgl_keluar", orderView.getTgl_keluar());
        param.put("peserta", String.valueOf(orderView.getPeserta()));
        param.put("kegiatan", orderView.getKegiatan());

        List<OrderInfrastructureView> orderInfrastructureViews = orderInfrastructureViewRepo.findOrderInfrastructureViewByIDOrder(id);
        List<Map<String,?>> maps = new ArrayList<Map<String, ?>> (); 

        for (int i = 0; i < orderInfrastructureViews.size(); i++) {
            Map<String,Object> map = new HashMap<String, Object>();
            map.put("TANGGAL", orderInfrastructureViews.get(i).getTanggal());
            map.put("KODE_PRASARANA", orderInfrastructureViews.get(i).getKode_prasarana());
            map.put("NAMA_PRASARANA", orderInfrastructureViews.get(i).getNama_prasarana());
            map.put("DARI_JAM", orderInfrastructureViews.get(i).getDari_jam());
            map.put("SAMPAI_JAM", orderInfrastructureViews.get(i).getSampai_jam());
            maps.add(map);
        }

        JRMapCollectionDataSource  dataSource = new JRMapCollectionDataSource(maps);

        byte[] bytes = jasperGenerator.generateReport(jasperEnum,"pelita/Booking.jrxml", param, dataSource);
        ByteArrayResource resource = new ByteArrayResource(bytes);

        LocalDateTime ldt = LocalDateTime.now();

        String fileName = orderView.getNomor() + "_" + ldt.format(CUSTOM_FORMATTER) + ".pdf";
        return ResponseEntity.ok()
            .header("Content-Disposition", "attachment; filename=\"" + fileName + "\"")
            .contentLength(resource.contentLength())
            .contentType(MediaType.APPLICATION_OCTET_STREAM)
            .body(resource);

      } catch (Exception e) {
        log.error(e.getMessage());
        return ResponseEntity.internalServerError().body(e.getMessage());
      }
    }
}
