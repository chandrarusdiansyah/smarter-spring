package com.sentinel.smarter.modules.pelita.implementations;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.sentinel.smarter.modules.pelita.models.Order;
import com.sentinel.smarter.modules.pelita.models.view.OrderCalendarMonthView;
import com.sentinel.smarter.modules.pelita.models.view.InfrastructureCalendarWeekView;
import com.sentinel.smarter.modules.pelita.models.view.MeansCalendarWeekView;
import com.sentinel.smarter.modules.pelita.models.view.OrderView;
import com.sentinel.smarter.modules.pelita.payloads.request.OrderRequest;
import com.sentinel.smarter.modules.pelita.repositories.OrderRepo;
import com.sentinel.smarter.modules.pelita.repositories.view.OrderCalendarMonthViewRepo;
import com.sentinel.smarter.modules.pelita.repositories.view.InfrastructureCalendarWeekViewRepo;
import com.sentinel.smarter.modules.pelita.repositories.view.MeansCalendarWeekViewRepo;
import com.sentinel.smarter.modules.pelita.repositories.view.OrderViewRepo;
import com.sentinel.smarter.modules.pelita.services.OrderService;
import com.sentinel.smarter.payloads.response.Response;

@Service
public class OrderImpl implements OrderService {
    @Autowired
    private OrderViewRepo orderViewRepo;
    @Autowired
    private OrderCalendarMonthViewRepo orderCalendarMonthViewRepo;
    @Autowired
    private InfrastructureCalendarWeekViewRepo infrastructureCalendarWeekViewRepo;
    @Autowired
    private MeansCalendarWeekViewRepo meansCalendarWeekViewRepo;
    @Autowired
    private OrderRepo orderRepo;

    //view

    @Override
    public Response findOrderViewByIDCompany(String id_perusahaan){
        List<OrderView> orderViews = orderViewRepo.findOrderViewByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data booking ditemukan", orderViews);
        return response;
    }

    @Override
    public Response findOrderCalendarMonthViewByIDCompany(String id_perusahaan){
        List<OrderCalendarMonthView> orderCalendarMonthViews = orderCalendarMonthViewRepo.findOrderCalendarMonthViewByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data booking ditemukan", orderCalendarMonthViews);
        return response;
    }

    @Override
    public Response findInfrastructureCalendarWeekViewByIDCompany(String id_perusahaan){
        List<InfrastructureCalendarWeekView> infrastructureCalendarWeekViews = infrastructureCalendarWeekViewRepo.findInfrastructureCalendarWeekViewByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data booking ditemukan", infrastructureCalendarWeekViews);
        return response;
    }

    @Override
    public Response findInfrastructureCalendarWeekViewByIDInfrastructure(String id_perusahaan, String id_prasarana){
        List<InfrastructureCalendarWeekView> infrastructureCalendarWeekViews = infrastructureCalendarWeekViewRepo.findInfrastructureCalendarWeekViewByIDInfrastructure(id_perusahaan, id_prasarana);
        Response response = new Response(HttpStatus.OK.value(),"data booking ditemukan", infrastructureCalendarWeekViews);
        return response;
    }


    @Override
    public Response findMeansCalendarWeekViewByIDCompany(String id_perusahaan){
        List<MeansCalendarWeekView> meansCalendarWeekViews = meansCalendarWeekViewRepo.findMeansCalendarWeekViewByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data booking ditemukan", meansCalendarWeekViews);
        return response;
    }

    @Override
    public Response findMeansCalendarWeekViewByIDMeans(String id_perusahaan, String id_prasarana){
        List<MeansCalendarWeekView> meansCalendarWeekViews = meansCalendarWeekViewRepo.findMeansCalendarWeekViewByIDMeans(id_perusahaan, id_prasarana);
        Response response = new Response(HttpStatus.OK.value(),"data booking ditemukan", meansCalendarWeekViews);
        return response;
    }

    @Override
    public Response findOrderCalendarMonthViewByIDWorkPlace(String id_perusahaan, String id_satuan_kerja){
        List<OrderCalendarMonthView> orderCalendarMonthViews = orderCalendarMonthViewRepo.findOrderCalendarMonthViewByIDWorkPlace(id_perusahaan, id_satuan_kerja);
        Response response = new Response(HttpStatus.OK.value(),"data booking ditemukan", orderCalendarMonthViews);
        return response;
    }

    @Override
    public Response findInfrastructureCalendarWeekViewByIDWorkPlace(String id_perusahaan, String id_satuan_kerja){
        List<InfrastructureCalendarWeekView> infrastructureCalendarWeekViews = infrastructureCalendarWeekViewRepo.findInfrastructureCalendarWeekViewByIDWorkPlace(id_perusahaan, id_satuan_kerja);
        Response response = new Response(HttpStatus.OK.value(),"data booking ditemukan", infrastructureCalendarWeekViews);
        return response;
    }


    //control

    @Override
    public Response getOrderByID(String id){
        Order order = orderRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data booking tidak ditemukan");
        });
        return new Response(HttpStatus.OK.value(), "data booking ditemukan", order);
    }

    @Override
    public Response addOrder(OrderRequest request){
        Order order = new Order();

        order.setID_perusahaan(request.getID_perusahaan());
        order.setTanggal(request.getTanggal());
        order.setID_satuan_kerja(request.getID_satuan_kerja());
        order.setID_tamu(request.getID_tamu());
        order.setTgl_masuk(request.getTgl_masuk());
        order.setTgl_keluar(request.getTgl_keluar());
        order.setKegiatan(request.getKegiatan());
        order.setPeserta(request.getPeserta());
        order.setKeterangan(request.getKeterangan());
        order.setID_pengguna(request.getID_pengguna());

        orderRepo.save(order);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data booking berhasil disimpan");
        response.setData(null);

        return response;
    }

    @Override
    public Response updateOrderByID(String id, OrderRequest request){
        Order order = orderRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data booking tidak ditemukan");
        });

        order.setID_perusahaan(request.getID_perusahaan());
        order.setTanggal(request.getTanggal());
        order.setID_satuan_kerja(request.getID_satuan_kerja());
        order.setID_tamu(request.getID_tamu());
        order.setTgl_masuk(request.getTgl_masuk());
        order.setTgl_keluar(request.getTgl_keluar());
        order.setKegiatan(request.getKegiatan());
        order.setPeserta(request.getPeserta());
        order.setKeterangan(request.getKeterangan());
        order.setID_pengguna(request.getID_pengguna());

        orderRepo.save(order);

        return new Response(HttpStatus.OK.value(), "data booking berhasil disimpan", null);
    }

    @Override
    public Response deleteOrderByID(String id){
        orderRepo.deleteById(id);
        return new Response(HttpStatus.OK.value(), "data booking berhasil dihapus", null);
    }

}
