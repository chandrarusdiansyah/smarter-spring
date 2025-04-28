package com.sentinel.smarter.implamentations;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.sentinel.smarter.models.Division;
import com.sentinel.smarter.models.Employee;
import com.sentinel.smarter.models.Position;
import com.sentinel.smarter.models.WorkPlace;
import com.sentinel.smarter.models.WorkUnit;
import com.sentinel.smarter.models.reference.EducationRef;
import com.sentinel.smarter.models.reference.GradeRef;
import com.sentinel.smarter.models.view.EmployeeView;
import com.sentinel.smarter.payloads.request.EmployeeRequest;
import com.sentinel.smarter.payloads.response.Response;
import com.sentinel.smarter.repositories.DivisionRepo;
import com.sentinel.smarter.repositories.EmployeeRepo;
import com.sentinel.smarter.repositories.PositionRepo;
import com.sentinel.smarter.repositories.WorkPlaceRepo;
import com.sentinel.smarter.repositories.WorkUnitRepo;
import com.sentinel.smarter.repositories.reference.EducationRefRepo;
import com.sentinel.smarter.repositories.reference.GradeReferRepo;
import com.sentinel.smarter.repositories.view.EmployeeViewRepo;
import com.sentinel.smarter.services.EmployeeService;

@Service
public class EmployeeImpl implements EmployeeService {

    private ModelMap modelMap = new ModelMap();

    @Autowired
    private EmployeeViewRepo employeeViewRepo;
    @Autowired
    private WorkPlaceRepo workPlaceRepo;
    @Autowired
    private DivisionRepo divisionRepo;
    @Autowired
    private EducationRefRepo educationRefRepo;
    @Autowired
    private GradeReferRepo gradeReferRepo;
    @Autowired
    private PositionRepo positionRepo;
    @Autowired
    private WorkUnitRepo workUnitRepo;
    @Autowired
    private EmployeeRepo employeeRepo;

    //view

    @Override
    public Response findEmployeeViewByIDCompany(String id_perusahaan){
        List<EmployeeView> employeeViews = employeeViewRepo.findEmployeeViewByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data pegawai ditemukan", employeeViews);
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
        List<EducationRef> educationRefs = educationRefRepo.findEducationByIDCompany(id_perusahaan);
        modelMap.put("education", educationRefs);
        List<GradeRef> gradeRefs = gradeReferRepo.findGradeByIDCompany(id_perusahaan);
        modelMap.put("grade", gradeRefs);
        List<Position> positions = positionRepo.findPositionByIDCompany(id_perusahaan);
        modelMap.put("position", positions);
        List<WorkUnit> workUnits = workUnitRepo.findWorkUnitByIDCompany(id_perusahaan);
        modelMap.put("workunit", workUnits);
        Response response = new Response(HttpStatus.OK.value(),"data referensi ditemukan", modelMap);
        return response;
    }

    //control

    @Override
    public Response getEmployeeByID(String id){
        Employee employee = employeeRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data pegawai tidak ditemukan");
        });
        return new Response(HttpStatus.OK.value(), "data pegawai ditemukan", employee);
    }

     @Override
    public Response addEmployee(EmployeeRequest request){
        Employee employee = new Employee();

        employee.setID_perusahaan(request.getID_perusahaan());
        employee.setNip(request.getNip());
        employee.setNama(request.getNama());
        employee.setID_satuan_kerja(request.getID_satuan_kerja());
        employee.setID_divisi(request.getID_divisi());
        employee.setID_pendidikan(request.getID_pendidikan());
        employee.setID_golongan(request.getID_golongan());
        employee.setID_jabatan(request.getID_jabatan());
        employee.setID_unit_kerja(request.getID_unit_kerja());
        employee.setID_pengguna(request.getID_pengguna());

        employeeRepo.save(employee);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data pegawai berhasil disimpan");
        response.setData(null);

        return response;
    }

    @Override
    public Response updateEmployeeByID(String id, EmployeeRequest request){
        Employee employee = employeeRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data pegawai tidak ditemukan");
        });
        
        employee.setID_perusahaan(request.getID_perusahaan());
        employee.setNip(request.getNip());
        employee.setNama(request.getNama());
        employee.setID_satuan_kerja(request.getID_satuan_kerja());
        employee.setID_divisi(request.getID_divisi());
        employee.setID_pendidikan(request.getID_pendidikan());
        employee.setID_golongan(request.getID_golongan());
        employee.setID_jabatan(request.getID_jabatan());
        employee.setID_unit_kerja(request.getID_unit_kerja());
        employee.setID_pengguna(request.getID_pengguna());

        employeeRepo.save(employee);

        return new Response(HttpStatus.OK.value(), "data pegawai berhasil disimpan", null);
    }
}
