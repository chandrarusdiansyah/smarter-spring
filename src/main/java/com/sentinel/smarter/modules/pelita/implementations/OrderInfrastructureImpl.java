package com.sentinel.smarter.modules.pelita.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.sentinel.smarter.modules.pelita.models.OrderInfrastructure;
import com.sentinel.smarter.modules.pelita.models.view.OrderInfrastructureView;
import com.sentinel.smarter.modules.pelita.payloads.request.OrderInfrastructureRequest;
import com.sentinel.smarter.modules.pelita.repositories.OrderInfrastructureRepo;
import com.sentinel.smarter.modules.pelita.repositories.view.OrderInfrastructureViewRepo;
import com.sentinel.smarter.modules.pelita.services.OrderInfrastructureService;
import com.sentinel.smarter.payloads.response.Response;

@Service
public class OrderInfrastructureImpl implements OrderInfrastructureService {
    @Autowired
    private OrderInfrastructureViewRepo orderInfrastructureViewRepo;
    @Autowired
    private OrderInfrastructureRepo orderInfrastructureRepo;

    //view

    @Override
    public Response findOrderInfrastructureViewByIDOrder(String id_pesan){
        List<OrderInfrastructureView> orderInfrastructureViews = orderInfrastructureViewRepo.findOrderInfrastructureViewByIDOrder(id_pesan);
        Response response = new Response(HttpStatus.OK.value(),"data booking ditemukan", orderInfrastructureViews);
        return response;
    }

    @Override
    public Response findOrderInfrastructureViewBySingeDate(String id_perusahaan, String tanggal){
        List<OrderInfrastructureView> orderInfrastructureViews = orderInfrastructureViewRepo.findOrderInfrastructureViewBySingeDate(id_perusahaan, tanggal);
        Response response = new Response(HttpStatus.OK.value(),"data booking ditemukan", orderInfrastructureViews);
        return response;
    }

    //control

    @Override
    public Response addOrderInfrastructure(OrderInfrastructureRequest request){
        OrderInfrastructure orderInfrastructure = new OrderInfrastructure();

        orderInfrastructure.setID_perusahaan(request.getID_perusahaan());
        orderInfrastructure.setID_pesan(request.getID_pesan());
        orderInfrastructure.setID_prasarana(request.getID_prasarana());
        orderInfrastructure.setTanggal(request.getTanggal());
        orderInfrastructure.setDari_jam(request.getDari_jam());
        orderInfrastructure.setSampai_jam(request.getSampai_jam());
        orderInfrastructure.setID_pengguna(request.getID_pengguna());

        orderInfrastructureRepo.save(orderInfrastructure);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data booking berhasil disimpan");
        response.setData(null);

        return response;
    }

    @Override
    public Response deleteOrderInfrastructureByID(String id){
        orderInfrastructureRepo.deleteById(id);
        return new Response(HttpStatus.OK.value(), "data booking berhasil dihapus", null);
    }
}
