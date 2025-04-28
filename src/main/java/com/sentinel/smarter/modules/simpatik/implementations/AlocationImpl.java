package com.sentinel.smarter.modules.simpatik.implementations;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.sentinel.smarter.models.WorkPlace;
import com.sentinel.smarter.modules.simpatik.models.Alocation;
import com.sentinel.smarter.modules.simpatik.models.reference.CertificateTypeRef;
import com.sentinel.smarter.modules.simpatik.models.reference.DocumentTypeRef;
import com.sentinel.smarter.modules.simpatik.models.reference.AssetConditionRef;
import com.sentinel.smarter.modules.simpatik.models.reference.AssetRef;
import com.sentinel.smarter.modules.simpatik.models.reference.OwnershipRef;
import com.sentinel.smarter.modules.simpatik.models.reference.SbsnStatusRef;
import com.sentinel.smarter.modules.simpatik.models.reference.StatusOfUseRef;
import com.sentinel.smarter.modules.simpatik.models.reference.AssetUomRef;
import com.sentinel.smarter.modules.simpatik.models.view.AlocationView;
import com.sentinel.smarter.modules.simpatik.models.view.AlocationWorkPlaceView;
import com.sentinel.smarter.modules.simpatik.payloads.request.AlocationRequest;
import com.sentinel.smarter.modules.simpatik.repositories.AlocationRepo;
import com.sentinel.smarter.modules.simpatik.repositories.reference.CertificateTypeRefRepo;
import com.sentinel.smarter.modules.simpatik.repositories.reference.DocumentTypeRefRepo;
import com.sentinel.smarter.modules.simpatik.repositories.reference.AssetConditionRefRepo;
import com.sentinel.smarter.modules.simpatik.repositories.reference.AssetRefRepo;
import com.sentinel.smarter.modules.simpatik.repositories.reference.OwnershipRefRepo;
import com.sentinel.smarter.modules.simpatik.repositories.reference.SbsnStatusRefRepo;
import com.sentinel.smarter.modules.simpatik.repositories.reference.StatusOfuseRefRepo;
import com.sentinel.smarter.modules.simpatik.repositories.reference.AssetUomRefRepo;
import com.sentinel.smarter.modules.simpatik.repositories.view.AlocationViewRepo;
import com.sentinel.smarter.modules.simpatik.repositories.view.AlocationWorkPlaceViewRepo;
import com.sentinel.smarter.modules.simpatik.services.AlocationService;
import com.sentinel.smarter.payloads.response.Response;
import com.sentinel.smarter.repositories.WorkPlaceRepo;

@Service
public class AlocationImpl implements AlocationService {
        
    private ModelMap modelMap = new ModelMap();

    @Autowired
    private AlocationViewRepo alocationViewRepo;
    @Autowired
    private AlocationWorkPlaceViewRepo alocationWorkPlaceViewRepo;
    @Autowired
    private WorkPlaceRepo workPlaceRepo;
    @Autowired
    private AssetRefRepo assetRefRepo;
    @Autowired
    private AssetConditionRefRepo assetConditionRefRepo;
    @Autowired
    private DocumentTypeRefRepo documentTypeRefRepo;
    @Autowired
    private OwnershipRefRepo ownershipRefRepo;
    @Autowired
    private CertificateTypeRefRepo certificateTypeRefRepo;
    @Autowired
    private AssetUomRefRepo assetUomRefRepo;
    @Autowired
    private StatusOfuseRefRepo statusOfuseRefRepo;
    @Autowired
    private SbsnStatusRefRepo sbsnStatusRefRepo;
    @Autowired 
    private AlocationRepo alocationRepo;

    //view
    
    @Override
    public Response findAclocationViewByIDCompany(String id_perusahaan){
        List<AlocationView> alocationViews = alocationViewRepo.findAclocationViewByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data alokasi ditemukan", alocationViews);
        return response;
    }

    @Override
    public Response findAclocationViewByItemType(String id_perusahaan, String id_jenis_barang){
        List<AlocationView> alocationViews = alocationViewRepo.findAclocationViewByItemType(id_perusahaan, id_jenis_barang);
        Response response = new Response(HttpStatus.OK.value(),"data alokasi ditemukan", alocationViews);
        return response;
    }

    @Override
    public Response findAclocationWorkUnitViewByIDCompany(String id_perusahaan){
        List<AlocationWorkPlaceView> alocationWorkPlaceViews = alocationWorkPlaceViewRepo.findAclocationWorkPlaceViewByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data alokasi ditemukan", alocationWorkPlaceViews);
        return response;
    }   

    @Override
    public Response findAlocationByIDWorkUnit(String id_perusahaan, String id_jenis_barang, String id_satuan_keja){
        List<AlocationView> alocationViews = alocationViewRepo.findAlocationByIDWorkUnit(id_perusahaan, id_jenis_barang, id_satuan_keja);
        Response response = new Response(HttpStatus.OK.value(),"data alokasi ditemukan", alocationViews);
        return response;
    }  

    //reference
    
    @Override
    public Response findReferenceByIDCompany(String id_perusahaan, String id_jenis_barang){
        modelMap.clear();
        List<WorkPlace> workPlaces = workPlaceRepo.findWorkPlaceByIDCompany(id_perusahaan);
        modelMap.put("workplace", workPlaces);
        List<AssetRef> assetRefs = assetRefRepo.findItemByIDCompany(id_perusahaan , id_jenis_barang);
        modelMap.put("item", assetRefs);
        List<AssetConditionRef> assetConditionRefs = assetConditionRefRepo.findItemConditionByIDCompany(id_perusahaan);
        modelMap.put("itemcondition", assetConditionRefs);
        List<DocumentTypeRef> documentTypeRefs = documentTypeRefRepo.findDocumentTypeByIDCompany(id_perusahaan);
        modelMap.put("documenttype", documentTypeRefs);
        List<OwnershipRef> ownershipRefs = ownershipRefRepo.findOwnershipByIDCompany(id_perusahaan);
        modelMap.put("ownership", ownershipRefs);
        List<CertificateTypeRef> certificateTypeRefs = certificateTypeRefRepo.findCertificateTypeByIDCompany(id_perusahaan);
        modelMap.put("certificatetype", certificateTypeRefs);
        List<AssetUomRef> assetUomRefs = assetUomRefRepo.findUomByIDCompany(id_perusahaan);
        modelMap.put("uom", assetUomRefs);
        List<StatusOfUseRef> statusOfUseRefs = statusOfuseRefRepo.findStatusOfUseByIDCompany(id_perusahaan);
        modelMap.put("statusofuse", statusOfUseRefs);
        List<SbsnStatusRef> sbsnStatusRefs = sbsnStatusRefRepo.findSbsnStatusByIDCompany(id_perusahaan);
        modelMap.put("sbsnstatus", sbsnStatusRefs);

        Response response = new Response(HttpStatus.OK.value(),"data referensi ditemukan", modelMap);
        return response;
    }

    //control

    @Override
    public Response getAlocationByID(String id){
        Alocation alocation = alocationRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data aset tidak ditemukan");
        });
        return new Response(HttpStatus.OK.value(), "data aset ditemukan", alocation);
    }

    @Override
    public Response addAlocation(AlocationRequest request){
        Alocation alocation = new Alocation();
        
        alocation.setID_perusahaan(request.getID_perusahaan());
        alocation.setID_satuan_kerja(request.getID_satuan_kerja());
        alocation.setID_barang(request.getID_barang());
        alocation.setNup(request.getNup()); 
        alocation.setID_kondisi_barang(request.getID_kondisi_barang()); 
        alocation.setID_jenis_dokumen(request.getID_jenis_dokumen()); 
        alocation.setID_kepemilikan(request.getID_kepemilikan()); 
        alocation.setID_jenis_sertifikat(request.getID_jenis_sertifikat()); 
        alocation.setMerk(request.getMerk()); 
        alocation.setTipe(request.getTipe()); 
        alocation.setTgl_perolehan(request.getTgl_perolehan()); 
        alocation.setTgl_awal_pakai(request.getTgl_awal_pakai()); 
        alocation.setNilai_perolehan_pertama(request.getNilai_perolehan_pertama()); 
        alocation.setNilai_mutasi(request.getNilai_mutasi()); 
        alocation.setNilai_perolehan(request.getNilai_perolehan()); 
        alocation.setNilai_penyusutan(request.getNilai_penyusutan()); 
        alocation.setNilai_buku(request.getNilai_buku()); 
        alocation.setID_satuan(request.getID_satuan()); 
        alocation.setKuantitas(request.getKuantitas()); 
        alocation.setLuas_tanah_keseluruhan(request.getLuas_tanah_keseluruhan()); 
        alocation.setLuas_tanah_untuk_bangunan(request.getLuas_tanah_untuk_bangunan()); 
        alocation.setLuas_tanah_untuk_sarana_lingkungan(request.getLuas_tanah_untuk_sarana_lingkungan()); 
        alocation.setLuas_lahan_kosong(request.getLuas_lahan_kosong()); 
        alocation.setLuas_bangunan(request.getLuas_bangunan()); 
        alocation.setLuas_dasar_bangunan(request.getLuas_dasar_bangunan()); 
        alocation.setLantai(request.getLantai()); 
        alocation.setID_status_guna(request.getID_status_guna()); 
        alocation.setNo_psp(request.getNo_psp()); 
        alocation.setTgl_psp(request.getTgl_psp()); 
        alocation.setNo_bpkb(request.getNo_bpkb()); 
        alocation.setNo_polisi(request.getNo_polisi()); 
        alocation.setPemakai(request.getPemakai()); 
        alocation.setAlamat(request.getAlamat()); 
        alocation.setRt_rw(request.getRt_rw()); 
        alocation.setKelurahan(request.getKelurahan()); 
        alocation.setKecamatan(request.getKecamatan()); 
        alocation.setKode_kabupaten_kota(request.getKode_kabupaten_kota()); 
        alocation.setKabupaten_kota(request.getKabupaten_kota()); 
        alocation.setKode_provinsi(request.getKode_provinsi()); 
        alocation.setProvinsi(request.getProvinsi()); 
        alocation.setKode_pos(request.getKode_pos()); 
        alocation.setAlamat_lain(request.getAlamat_lain()); 
        alocation.setKib(request.getKib()); 
        alocation.setSbsk(request.getSbsk()); 
        alocation.setOptimalisasi(request.getOptimalisasi()); 
        alocation.setID_status_sbsn(request.getID_status_sbsn()); 
        alocation.setNo_tiket_usul_psp(request.getNo_tiket_usul_psp()); 
        alocation.setIntra_ekstra(request.getIntra_ekstra()); 
        alocation.setBpybds(request.getBpybds()); 
        alocation.setHenti_guna(request.getHenti_guna()); 
        alocation.setKemitraan(request.getKemitraan()); 
        alocation.setHilang(request.getHilang()); 
        alocation.setDktp(request.getDktp()); 
        alocation.setUsul_rusak_berat(request.getUsul_rusak_berat()); 
        alocation.setUsul_hapus(request.getUsul_hapus());
        alocation.setSisa_umur(request.getSisa_umur());
        alocation.setSakti(request.getSakti());
        alocation.setKode_registrasi_sakti(request.getKode_registrasi_sakti());
        alocation.setFoto(request.getFoto());
        alocation.setID_pengguna(request.getID_pengguna());
  
        alocationRepo.save(alocation);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data alokasi berhasil disimpan");
        response.setData(null);

        return response;
    }

    @Override
    public Response updateAlocationByID(String id, AlocationRequest request){
        Alocation alocation = alocationRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data alokasi tidak ditemukan");
        });

        alocation.setID_perusahaan(request.getID_perusahaan());
        alocation.setID_satuan_kerja(request.getID_satuan_kerja());
        alocation.setID_barang(request.getID_barang());
        alocation.setNup(request.getNup()); 
        alocation.setID_kondisi_barang(request.getID_kondisi_barang()); 
        alocation.setID_jenis_dokumen(request.getID_jenis_dokumen()); 
        alocation.setID_kepemilikan(request.getID_kepemilikan()); 
        alocation.setID_jenis_sertifikat(request.getID_jenis_sertifikat()); 
        alocation.setMerk(request.getMerk()); 
        alocation.setTipe(request.getTipe()); 
        alocation.setTgl_perolehan(request.getTgl_perolehan()); 
        alocation.setTgl_awal_pakai(request.getTgl_awal_pakai()); 
        alocation.setNilai_perolehan_pertama(request.getNilai_perolehan_pertama()); 
        alocation.setNilai_mutasi(request.getNilai_mutasi()); 
        alocation.setNilai_perolehan(request.getNilai_perolehan()); 
        alocation.setNilai_penyusutan(request.getNilai_penyusutan()); 
        alocation.setNilai_buku(request.getNilai_buku()); 
        alocation.setID_satuan(request.getID_satuan()); 
        alocation.setKuantitas(request.getKuantitas()); 
        alocation.setLuas_tanah_keseluruhan(request.getLuas_tanah_keseluruhan()); 
        alocation.setLuas_tanah_untuk_bangunan(request.getLuas_tanah_untuk_bangunan()); 
        alocation.setLuas_tanah_untuk_sarana_lingkungan(request.getLuas_tanah_untuk_sarana_lingkungan()); 
        alocation.setLuas_lahan_kosong(request.getLuas_lahan_kosong()); 
        alocation.setLuas_bangunan(request.getLuas_bangunan()); 
        alocation.setLuas_dasar_bangunan(request.getLuas_dasar_bangunan()); 
        alocation.setLantai(request.getLantai()); 
        alocation.setID_status_guna(request.getID_status_guna()); 
        alocation.setNo_psp(request.getNo_psp()); 
        alocation.setTgl_psp(request.getTgl_psp()); 
        alocation.setNo_bpkb(request.getNo_bpkb()); 
        alocation.setNo_polisi(request.getNo_polisi()); 
        alocation.setPemakai(request.getPemakai()); 
        alocation.setAlamat(request.getAlamat()); 
        alocation.setRt_rw(request.getRt_rw()); 
        alocation.setKelurahan(request.getKelurahan()); 
        alocation.setKecamatan(request.getKecamatan()); 
        alocation.setKode_kabupaten_kota(request.getKode_kabupaten_kota()); 
        alocation.setKabupaten_kota(request.getKabupaten_kota()); 
        alocation.setKode_provinsi(request.getKode_provinsi()); 
        alocation.setProvinsi(request.getProvinsi()); 
        alocation.setKode_pos(request.getKode_pos()); 
        alocation.setAlamat_lain(request.getAlamat_lain()); 
        alocation.setKib(request.getKib()); 
        alocation.setSbsk(request.getSbsk()); 
        alocation.setOptimalisasi(request.getOptimalisasi()); 
        alocation.setID_status_sbsn(request.getID_status_sbsn()); 
        alocation.setNo_tiket_usul_psp(request.getNo_tiket_usul_psp()); 
        alocation.setIntra_ekstra(request.getIntra_ekstra()); 
        alocation.setBpybds(request.getBpybds()); 
        alocation.setHenti_guna(request.getHenti_guna()); 
        alocation.setKemitraan(request.getKemitraan()); 
        alocation.setHilang(request.getHilang()); 
        alocation.setDktp(request.getDktp()); 
        alocation.setUsul_rusak_berat(request.getUsul_rusak_berat()); 
        alocation.setUsul_hapus(request.getUsul_hapus());
        alocation.setSisa_umur(request.getSisa_umur());
        alocation.setSakti(request.getSakti());
        alocation.setKode_registrasi_sakti(request.getKode_registrasi_sakti());
        alocation.setFoto(request.getFoto());
        alocation.setID_pengguna(request.getID_pengguna());
  
        alocationRepo.save(alocation);

        return new Response(HttpStatus.OK.value(), "data alokasi berhasil disimpan", null);
    }
}
