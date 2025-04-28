package com.sentinel.smarter.modules.presence.controllers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.web.bind.annotation.*;

import com.sentinel.smarter.models.enumerator.JasperEnum;
import com.sentinel.smarter.modules.presence.models.view.PresenceView;
import com.sentinel.smarter.modules.presence.payloads.request.PresenceRequest;
import com.sentinel.smarter.modules.presence.repositories.view.PresenceViewRepo;
import com.sentinel.smarter.modules.presence.services.PresenceService;
import com.sentinel.smarter.payloads.response.Response;
import com.sentinel.smarter.services.JasperGenerator;
import com.sentinel.smarter.utilities.PathUtility;

import lombok.extern.slf4j.Slf4j;
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource;

@Slf4j
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/presence/NYrsoXd5iA")
public class PresenceControl {
    final static DateTimeFormatter CUSTOM_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    @Autowired
    private JasperGenerator jasperGenerator;
    @Autowired
    private PresenceService presenceService;
    @Autowired
    private PresenceViewRepo presenceViewRepo;
     

    // private static Logger logger = LoggerFactory.getLogger(PresenceControl.class);

    //view

    @PostMapping("/v1")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PRESENCE')")
    public ResponseEntity<?> findPresenceByQuery(@RequestBody Map<String, String> request) {
        try {
            
            String condition = "ID_PERUSAHAAN = '"+ request.get("id_perusahaan").toString()+ "' AND (TANGGAL BETWEEN '" + request.get("tgl1").toString() + "' AND '" +  request.get("tgl2").toString()  +"')";

            JSONArray arrSatuanKerja = new JSONArray(request.get("id_satuan_kerja"));
            if (arrSatuanKerja.length()>0){
                condition += " AND (";
                for(int i = 0; i < arrSatuanKerja.length(); i++){
                    condition += "ID_SATUAN_KERJA="+arrSatuanKerja.getJSONObject(i).getString("value") + " OR ";
                }
                condition = condition.substring(0,condition.length()-4);
                condition += ")";
            }

            JSONArray arrJenisKerja = new JSONArray(request.get("id_jenis_kerja"));
            if(arrJenisKerja.length()>0){
                condition += " AND (";
                for(int i = 0; i < arrJenisKerja.length(); i++){
                    condition += "ID_JENIS_KERJA="+arrJenisKerja.getJSONObject(i).getString("value") + " OR ";
                }
                condition = condition.substring(0,condition.length()-4);
                condition += ")";
            }

            JSONArray arrStatusPresensi = new JSONArray(request.get("id_status_presensi"));
            if(arrStatusPresensi.length()>0){
                condition += " AND (";
                for(int i = 0; i < arrStatusPresensi.length(); i++){
                    condition += "ID_STATUS_PRESENSI="+arrStatusPresensi.getJSONObject(i).getString("value") + " OR ";
                }
                condition = condition.substring(0,condition.length()-4);
                condition += ")";
            }

            JSONArray arrPegawai = new JSONArray(request.get("id_pegawai"));
            if(arrPegawai.length()>0){
                condition += " AND (";
                for(int i = 0; i < arrPegawai.length(); i++){
                    condition += "ID_PEGAWAI="+arrPegawai.getJSONObject(i).getString("value") + " OR ";
                }
                condition = condition.substring(0,condition.length()-4);
                condition += ")";
            }

            Response response = presenceService.findPresenceByQuery("SELECT ID, ID_PEGAWAI, NIK_PEGAWAI, NAMA_PEGAWAI, KODE_SATUAN_KERJA, NAMA_SATUAN_KERJA, LOKASI_SATUAN_KERJA, NAMA_JENIS_KERJA, TANGGAL, NAMA_JENIS_PRESENSI, NAMA_STATUS_PRESENSI, JAM_MASUK, MASUK_LATITUDE, MASUK_LONGITUDE, MASUK_FOTO, JAM_KELUAR, KELUAR_LATITUDE, KELUAR_LONGITUDE, KELUAR_FOTO FROM lan_dbprc.presensi WHERE " + condition);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //reference

    @GetMapping("/reference/{id_perusahaan}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PRESENCE')")
    public ResponseEntity<?> findReferenceByIDCompany(@PathVariable("id_perusahaan") String id_perusahaan) {
        try {
            Response response = presenceService.findReferenceByIDCompany(id_perusahaan);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    //control

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PRESENCE')")
    public ResponseEntity<?> getPresencetByID(@PathVariable("id") String id) {
        try {
            Response response = presenceService.getPresencetByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }     
    }

    @PostMapping
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PRESENCE')")
    public ResponseEntity<?> addPresence (@RequestBody PresenceRequest request){
        try {
            Response response = presenceService.addPresence(request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        } 
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PRESENCE')")
    public ResponseEntity<?> updatePresenceByID(@PathVariable("id") String id, @RequestBody PresenceRequest request) {
        try {
            Response response = presenceService.updatePresenceByID(id, request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PRESENCE')")
    public ResponseEntity<?> deleteOrdertByID(@PathVariable("id") String id) {
        try {
            Response response = presenceService.deletePresenceByID(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        } 
    }

    //android

    @GetMapping("/android/v1/{id}")
    public ResponseEntity<?> findPresenceByIDEmployeeContract(@PathVariable("id") String id) {
        try {
            Response response = presenceService.findPresenceByIDEmployeeContract(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/android/v2/{id}")
    public ResponseEntity<?> findPresenceTodayByIDEmployeeContract(@PathVariable("id") String id) {
        try {
            Response response = presenceService.findPresenceTodayByIDEmployeeContract(id);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @PostMapping("/android/post")
    public ResponseEntity<?> addPresenceIn (@RequestBody PresenceRequest request){
        try {
            // logger.info(request.getID_perusahaan());
            Response response = presenceService.addPresenceIn(request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        } 
    }

    @PutMapping("/android/put/{id}")
    public ResponseEntity<?> addPresenceOut(@PathVariable("id") String id, @RequestBody PresenceRequest request) {
        try {
            // logger.info(request.getJam_keluar());
            Response response = presenceService.addPresenceOut(id, request);
            return ResponseEntity.status(response.getStatus()).body(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @PostMapping("/android/photo")
    public ResponseEntity<?> fileUpload(@RequestBody Map<String, String> request){
        // logger.info(request.get("is_foto"));

        byte[] data = Base64.getDecoder().decode(request.get("is_foto").replace("\n", ""));
        File file = new File(PathUtility.SMARTER_IMAGE_REAL_PATH + "presence/" + request.get("nama"));

        try (OutputStream outputStream = new FileOutputStream(file)) {
            outputStream.write(data);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data presensi berhasil disimpan");
        response.setData(null);
        return ResponseEntity.status(response.getStatus()).body(response);
    }

    //Report

    @PostMapping("/print")
    @PreAuthorize("hasAuthority('DEVELOPER') or hasAuthority('PRESENCE')")
    public ResponseEntity<?> print(@RequestBody Map<String, String> request) {
        try {
            log.error(request.toString());
            JasperEnum jasperEnum = JasperEnum.valueOf(request.get("fileType"));

            Map<String,Object> param = new HashMap<>();
            param.put("real_path", PathUtility.SMARTER_JASPER_REAL_PATH);
            param.put("photo_path", PathUtility.SMARTER_IMAGE_REAL_PATH+"presence/");
            param.put("tgl1", request.get("tgl1").toString());
            param.put("tgl2", request.get("tgl2").toString());

            String condition = "ID_PERUSAHAAN = '"+ request.get("id_perusahaan").toString()+ "' AND (TANGGAL BETWEEN '" + request.get("tgl1").toString() + "' AND '" +  request.get("tgl2").toString()  +"')";

            JSONArray arrSatuanKerja = new JSONArray(request.get("id_satuan_kerja"));
            if (arrSatuanKerja.length()>0){
                condition += " AND (";
                for(int i = 0; i < arrSatuanKerja.length(); i++){
                    condition += "ID_SATUAN_KERJA="+arrSatuanKerja.getJSONObject(i).getString("value") + " OR ";
                }
                condition = condition.substring(0,condition.length()-4);
                condition += ")";
            }

            JSONArray arrJenisKerja = new JSONArray(request.get("id_jenis_kerja"));
            if(arrJenisKerja.length()>0){
                condition += " AND (";
                for(int i = 0; i < arrJenisKerja.length(); i++){
                    condition += "ID_JENIS_KERJA="+arrJenisKerja.getJSONObject(i).getString("value") + " OR ";
                }
                condition = condition.substring(0,condition.length()-4);
                condition += ")";
            }

            JSONArray arrStatusPresensi = new JSONArray(request.get("id_status_presensi"));
            if(arrStatusPresensi.length()>0){
                condition += " AND (";
                for(int i = 0; i < arrStatusPresensi.length(); i++){
                    condition += "ID_STATUS_PRESENSI="+arrStatusPresensi.getJSONObject(i).getString("value") + " OR ";
                }
                condition = condition.substring(0,condition.length()-4);
                condition += ")";
            }

            JSONArray arrPegawai = new JSONArray(request.get("id_pegawai"));
            if(arrPegawai.length()>0){
                condition += " AND (";
                for(int i = 0; i < arrPegawai.length(); i++){
                    condition += "ID_PEGAWAI="+arrPegawai.getJSONObject(i).getString("value") + " OR ";
                }
                condition = condition.substring(0,condition.length()-4);
                condition += ")";
            }

            List<PresenceView> presenceViews = presenceViewRepo.findPresenceByQuery("SELECT ID, ID_PEGAWAI, NIK_PEGAWAI, NAMA_PEGAWAI, KODE_SATUAN_KERJA, NAMA_SATUAN_KERJA, LOKASI_SATUAN_KERJA, NAMA_JENIS_KERJA, TANGGAL, NAMA_JENIS_PRESENSI, NAMA_STATUS_PRESENSI, JAM_MASUK, MASUK_LATITUDE, MASUK_LONGITUDE, MASUK_FOTO, JAM_KELUAR, KELUAR_LATITUDE, KELUAR_LONGITUDE, KELUAR_FOTO FROM lan_dbprc.presensi WHERE " + condition);

            List<Map<String,?>> maps = new ArrayList<Map<String, ?>> (); 
            for (int i = 0; i < presenceViews.size(); i++) {
                Map<String,Object> map = new HashMap<String, Object>();
                map.put("TANGGAL", presenceViews.get(i).getTanggal().toString());
                map.put("KODE_SATUAN_KERJA", presenceViews.get(i).getKode_satuan_kerja());
                map.put("NAMA_SATUAN_KERJA", presenceViews.get(i).getNama_satuan_kerja());
                map.put("LOKASI_SATUAN_KERJA", presenceViews.get(i).getLokasi_satuan_kerja());
                map.put("NIK_PEGAWAI", presenceViews.get(i).getNik_pegawai());
                map.put("NAMA_PEGAWAI", presenceViews.get(i).getNama_pegawai());
                map.put("NAMA_STATUS_PRESENSI", presenceViews.get(i).getNama_status_presensi());
                map.put("NAMA_JENIS_KERJA", presenceViews.get(i).getNama_jenis_kerja());
                map.put("JAM_MASUK", presenceViews.get(i).getJam_masuk().toString());
                map.put("JAM_KELUAR", presenceViews.get(i).getJam_keluar().toString());
                map.put("MASUK_FOTO", presenceViews.get(i).getMasuk_foto());
                map.put("KELUAR_FOTO", presenceViews.get(i).getKeluar_foto());
                maps.add(map);
            }
            log.error(maps.toString());
            JRMapCollectionDataSource  dataSource = new JRMapCollectionDataSource(maps);
            byte[] bytes = jasperGenerator.generateReport(jasperEnum,"presence/Presence.jrxml", param, dataSource);
            ByteArrayResource resource = new ByteArrayResource(bytes);

            LocalDateTime ldt = LocalDateTime.now();
            String fileName = "Presence_Report" + "_" + ldt.format(CUSTOM_FORMATTER) + ".pdf";
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
