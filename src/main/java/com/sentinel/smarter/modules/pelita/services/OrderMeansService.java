package com.sentinel.smarter.modules.pelita.services;

import com.sentinel.smarter.modules.pelita.payloads.request.OrderMeansRequest;
import com.sentinel.smarter.payloads.response.Response;

public interface OrderMeansService {
    //view
    Response findOrderMeansViewByIDOrder(String id_pesan);
    Response findOrderMeansViewBySingeDate(String id_perusahaan, String tanggal);
    //control
    Response addOrderMeans(OrderMeansRequest request);
    Response deleteOrderMeansByID(String id);
}
