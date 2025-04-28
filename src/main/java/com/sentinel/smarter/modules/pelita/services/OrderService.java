package com.sentinel.smarter.modules.pelita.services;

import com.sentinel.smarter.modules.pelita.payloads.request.OrderRequest;
import com.sentinel.smarter.payloads.response.Response;

public interface OrderService {
    //view
    Response findOrderViewByIDCompany(String id_perusahaan);
    Response findOrderCalendarMonthViewByIDCompany(String id_perusahaan);
    Response findInfrastructureCalendarWeekViewByIDCompany(String id_perusahaan);
    Response findInfrastructureCalendarWeekViewByIDInfrastructure(String id_perusahaan, String id_prasarana);
    Response findMeansCalendarWeekViewByIDCompany(String id_perusahaan);
    Response findMeansCalendarWeekViewByIDMeans(String id_perusahaan, String id_sarana);
    Response findOrderCalendarMonthViewByIDWorkPlace(String id_perusahaan, String id_satuan_kerja);
    Response findInfrastructureCalendarWeekViewByIDWorkPlace(String id_perusahaan, String id_satuan_kerja);
    //control
    Response getOrderByID(String id);
    Response addOrder(OrderRequest request);
    Response updateOrderByID(String id, OrderRequest request);
    Response deleteOrderByID(String id);
}
