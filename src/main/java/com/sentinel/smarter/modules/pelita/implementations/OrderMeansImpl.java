package com.sentinel.smarter.modules.pelita.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.sentinel.smarter.modules.pelita.models.OrderMeans;
import com.sentinel.smarter.modules.pelita.models.view.OrderMeansView;
import com.sentinel.smarter.modules.pelita.payloads.request.OrderMeansRequest;
import com.sentinel.smarter.modules.pelita.repositories.OrderMeansRepo;
import com.sentinel.smarter.modules.pelita.repositories.view.OrderMeansViewRepo;
import com.sentinel.smarter.modules.pelita.services.OrderMeansService;
import com.sentinel.smarter.payloads.response.Response;

@Service
public class OrderMeansImpl implements OrderMeansService {
    @Autowired
    private OrderMeansViewRepo orderMeansViewRepo;
    @Autowired
    private OrderMeansRepo orderMeansRepo;

    //view

    @Override
    public Response findOrderMeansViewByIDOrder(String id_pesan){
        List<OrderMeansView> orderMeansViews = orderMeansViewRepo.findOrderMeansViewByIDOrder(id_pesan);
        Response response = new Response(HttpStatus.OK.value(),"data booking ditemukan", orderMeansViews);
        return response;
    }

    @Override
    public Response findOrderMeansViewBySingeDate(String id_perusahaan, String tanggal){
        List<OrderMeansView> orderMeansViews = orderMeansViewRepo.findOrderMeansViewBySingeDate(id_perusahaan, tanggal);
        Response response = new Response(HttpStatus.OK.value(),"data booking ditemukan", orderMeansViews);
        return response;
    }

    //control

    @Override
    public Response addOrderMeans(OrderMeansRequest request){
        OrderMeans orderMeans = new OrderMeans();

        orderMeans.setID_perusahaan(request.getID_perusahaan());
        orderMeans.setID_pesan(request.getID_pesan());
        orderMeans.setID_sarana(request.getID_sarana());
        orderMeans.setTanggal(request.getTanggal());
        orderMeans.setDari_jam(request.getDari_jam());
        orderMeans.setSampai_jam(request.getSampai_jam());
        orderMeans.setID_pengguna(request.getID_pengguna());

        orderMeansRepo.save(orderMeans);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data booking berhasil disimpan");
        response.setData(null);

        return response;
    }

    @Override
    public Response deleteOrderMeansByID(String id){
        orderMeansRepo.deleteById(id);
        return new Response(HttpStatus.OK.value(), "data booking berhasil dihapus", null);
    }
}
