package com.sentinel.smarter.modules.pelita.services;

import com.sentinel.smarter.modules.pelita.payloads.request.OrderInfrastructureRequest;
import com.sentinel.smarter.payloads.response.Response;

public interface OrderInfrastructureService {
    //view
    Response findOrderInfrastructureViewByIDOrder(String id_pesan);
    Response findOrderInfrastructureViewBySingeDate(String id_perusahaan, String tanggal);
    //control
    Response addOrderInfrastructure(OrderInfrastructureRequest request);
    Response deleteOrderInfrastructureByID(String id);
}
