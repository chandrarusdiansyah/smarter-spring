package com.sentinel.smarter.modules.smartproc.implamentations;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.sentinel.smarter.models.Division;
import com.sentinel.smarter.models.WorkPlace;
import com.sentinel.smarter.modules.smartproc.models.Contract;
import com.sentinel.smarter.modules.smartproc.models.Partner;
import com.sentinel.smarter.modules.smartproc.models.reference.ContractMethodRef;
import com.sentinel.smarter.modules.smartproc.models.reference.PaymentProofRef;
import com.sentinel.smarter.modules.smartproc.models.reference.RealizationTypeRef;
import com.sentinel.smarter.modules.smartproc.models.view.ContractContractTypeView;
import com.sentinel.smarter.modules.smartproc.models.view.ContractValueWorkPlaceView;
import com.sentinel.smarter.modules.smartproc.models.view.ContractView;
import com.sentinel.smarter.modules.smartproc.models.view.ContractWorkPlaceView;
import com.sentinel.smarter.modules.smartproc.payloads.request.ContractRequest;
import com.sentinel.smarter.modules.smartproc.repositories.ContractRepo;
import com.sentinel.smarter.modules.smartproc.repositories.PartnerRepo;
import com.sentinel.smarter.modules.smartproc.repositories.reference.ContractMethodRefRepo;
import com.sentinel.smarter.modules.smartproc.repositories.reference.PaymentProofRefRepo;
import com.sentinel.smarter.modules.smartproc.repositories.reference.RealizationTypeRefRepo;
import com.sentinel.smarter.modules.smartproc.repositories.view.ContractContractTypeViewRepo;
import com.sentinel.smarter.modules.smartproc.repositories.view.ContractValueWorkPlaceViewRepo;
import com.sentinel.smarter.modules.smartproc.repositories.view.ContractViewRepo;
import com.sentinel.smarter.modules.smartproc.repositories.view.ContractWorkPlaceViewRepo;
import com.sentinel.smarter.modules.smartproc.services.ContractService;
import com.sentinel.smarter.payloads.response.Response;
import com.sentinel.smarter.repositories.DivisionRepo;
import com.sentinel.smarter.repositories.WorkPlaceRepo;

@Service
public class ContractImpl implements ContractService {
    private ModelMap modelMap = new ModelMap();

    @Autowired
    private ContractViewRepo contractViewRepo;
    @Autowired
    private ContractContractTypeViewRepo contractContractTypeViewRepo;
    @Autowired
    private ContractWorkPlaceViewRepo contractWorkPlaceViewRepo;
    @Autowired
    private ContractValueWorkPlaceViewRepo contractValueWorkPlaceViewRepo;
    @Autowired
    private WorkPlaceRepo workPlaceRepo;
    @Autowired
    private DivisionRepo divisionRepo;
    @Autowired
    private ContractMethodRefRepo contractMethodRefRepo;
    @Autowired
    private PartnerRepo partnerRepo;
    @Autowired
    private PaymentProofRefRepo paymentProofRefRepo;
    @Autowired
    private RealizationTypeRefRepo realizationTypeRefRepo;
    @Autowired
    private ContractRepo contractRepo;

    // view

    @Override
    public Response findContractByIDCompany(String id_perusahaan){
        List<ContractView> contractViews = contractViewRepo.findContractByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data kontrak ditemukan", contractViews);
        return response;
    }  

    @Override
    public Response findContractByIDContractType(String id_perusahaan, String id_jenis_kontrak){
        List<ContractView> contractViews = contractViewRepo.findContractByIDContractType(id_perusahaan, id_jenis_kontrak);
        Response response = new Response(HttpStatus.OK.value(),"data kontrak ditemukan", contractViews);
        return response;
    }  

    @Override
    public Response findContractContractTypeViewByIDCompany(String id_perusahaan){
        List<ContractContractTypeView> contractContractTypeViews = contractContractTypeViewRepo.findContractContractTypeViewByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data kontrak ditemukan", contractContractTypeViews);
        return response;
    }  

    @Override
    public Response findContractWorkPlaceViewByIDCompany(String id_perusahaan){
        List<ContractWorkPlaceView> contractWorkPlaceViews = contractWorkPlaceViewRepo.findContractWorkPlaceViewByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data kontrak ditemukan", contractWorkPlaceViews);
        return response;
    } 

    @Override
    public Response findContractValueWorkPlaceViewByIDCompany(String id_perusahaan){
        List<ContractValueWorkPlaceView> contractValueWorkPlaceViews = contractValueWorkPlaceViewRepo.findContractValueWorkPlaceViewByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data kontrak ditemukan", contractValueWorkPlaceViews);
        return response;
    } 

    @Override
    public Response findContractNotFinished(String id_perusahaan){
        List<ContractView> contractViews = contractViewRepo.findContractNotFinished(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data kontrak ditemukan", contractViews);
        return response;
    }  

    //reference

    @Override
    public Response findReferenceByIDCompany(String id_perusahaan){
        modelMap.clear();
        List<WorkPlace> workPlaces = workPlaceRepo.findWorkPlaceByIDCompany(id_perusahaan);
        modelMap.put("workplace", workPlaces);
        List<Division> divisions = divisionRepo.findDivisionByIDCompany(id_perusahaan);
        modelMap.put("division", divisions);
        List<ContractMethodRef> contractMethodRefs = contractMethodRefRepo.findContractMethodReferenceByIDCompany(id_perusahaan);
        modelMap.put("contractmethod", contractMethodRefs);
        List<Partner> partners = partnerRepo.findPartnerByIDCompany(id_perusahaan);
        modelMap.put("partner", partners);
        List<PaymentProofRef> paymentProofRefs = paymentProofRefRepo.findPaymentProofReferenceByIDCompany(id_perusahaan);
        modelMap.put("paymentproof", paymentProofRefs);
        List<RealizationTypeRef> realizationTypeRefs = realizationTypeRefRepo.findRealizationTypeReferenceByIDCompany(id_perusahaan);
        modelMap.put("realizationtype", realizationTypeRefs);
        Response response = new Response(HttpStatus.OK.value(),"data referensi ditemukan", modelMap);
        return response;
    }

    //control

    @Override
    public Response getContractByID(String id){
        Contract contract = contractRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data kontrak tidak ditemukan");
        });
        return new Response(HttpStatus.OK.value(), "data kontrak ditemukan", contract);
    }

    @Override
    public Response addContract(ContractRequest request){
        Contract contract = new Contract();

        contract.setID_perusahaan(request.getID_perusahaan());
        contract.setID_jenis_kontrak(request.getID_jenis_kontrak());
        contract.setID_satuan_kerja(request.getID_satuan_kerja());
        contract.setID_divisi(request.getID_divisi());
        contract.setKode(request.getKode());
        
        contract.setNama(request.getNama());

        contract.setID_metode_kontrak(request.getID_metode_kontrak());
        contract.setID_rekanan(request.getID_rekanan());
        contract.setNilai_anggaran(request.getNilai_anggaran());
        contract.setNilai_hps(request.getNilai_hps());
        contract.setNilai_rab(request.getNilai_rab());

        contract.setNilai_kontrak(request.getNilai_kontrak());
        contract.setNilai_realisasi(request.getNilai_realisasi());
        contract.setID_bukti_bayar(request.getID_bukti_bayar());
        contract.setNilai_adendum(request.getNilai_adendum());
        contract.setNilai_kontrak_akhir(request.getNilai_kontrak_akhir());

        contract.setID_jenis_realisasi(request.getID_jenis_realisasi());
        contract.setNomor_kontrak(request.getNomor_kontrak());
        contract.setTgl_kontrak(request.getTgl_kontrak());
        contract.setTgl_realisasi(request.getTgl_realisasi());
        contract.setNomor_adendum(request.getNomor_adendum());

        contract.setTgl_adendum(request.getTgl_adendum());
        contract.setTercatat_lpse(request.getTercatat_lpse());
        contract.setTgl_awal(request.getTgl_awal());
        contract.setTgl_akhir(request.getTgl_akhir());
        contract.setProgres(request.getProgres());

        contract.setPdn(request.getPdn());

        contract.setNilai_tkdn(request.getNilai_tkdn());
        contract.setNilai_tkdn_selesai(request.getNilai_tkdn_selesai());
        contract.setPenilaian(request.getPenilaian());
        contract.setKendala(request.getKendala());
        contract.setSelesai(request.getSelesai());

        contract.setTautan(request.getTautan());
        contract.setID_pengguna(request.getID_pengguna());

        contractRepo.save(contract);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data kontrak berhasil disimpan");
        response.setData(null);

        return response;
    }

    @Override
    public Response updateContractByID(String id, ContractRequest request){
        Contract contract = contractRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data kontrak tidak ditemukan");
        });
        
        contract.setID_perusahaan(request.getID_perusahaan());
        contract.setID_jenis_kontrak(request.getID_jenis_kontrak());
        contract.setID_satuan_kerja(request.getID_satuan_kerja());
        contract.setID_divisi(request.getID_divisi());
        contract.setKode(request.getKode());

        contract.setNama(request.getNama());

        contract.setID_metode_kontrak(request.getID_metode_kontrak());
        contract.setID_rekanan(request.getID_rekanan());
        contract.setNilai_anggaran(request.getNilai_anggaran());
        contract.setNilai_hps(request.getNilai_hps());
        contract.setNilai_rab(request.getNilai_rab());

        contract.setNilai_kontrak(request.getNilai_kontrak());
        contract.setNilai_realisasi(request.getNilai_realisasi());
        contract.setID_bukti_bayar(request.getID_bukti_bayar());
        contract.setNilai_adendum(request.getNilai_adendum());
        contract.setNilai_kontrak_akhir(request.getNilai_kontrak_akhir());

        contract.setID_jenis_realisasi(request.getID_jenis_realisasi());
        contract.setNomor_kontrak(request.getNomor_kontrak());
        contract.setTgl_kontrak(request.getTgl_kontrak());
        contract.setTgl_realisasi(request.getTgl_realisasi());
        contract.setNomor_adendum(request.getNomor_adendum());

        contract.setTgl_adendum(request.getTgl_adendum());
        contract.setTercatat_lpse(request.getTercatat_lpse());
        contract.setTgl_awal(request.getTgl_awal());
        contract.setTgl_akhir(request.getTgl_akhir());
        contract.setProgres(request.getProgres());

        contract.setPdn(request.getPdn());

        contract.setNilai_tkdn(request.getNilai_tkdn());
        contract.setNilai_tkdn_selesai(request.getNilai_tkdn_selesai());
        contract.setPenilaian(request.getPenilaian());
        contract.setKendala(request.getKendala());
        contract.setSelesai(request.getSelesai());

        contract.setTautan(request.getTautan());
        contract.setID_pengguna(request.getID_pengguna());

        contractRepo.save(contract);

        return new Response(HttpStatus.OK.value(), "data kontrak berhasil disimpan", null);
    }

}
