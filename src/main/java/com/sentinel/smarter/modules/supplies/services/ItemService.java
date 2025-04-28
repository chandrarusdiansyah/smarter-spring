package com.sentinel.smarter.modules.supplies.services;

import com.sentinel.smarter.modules.supplies.payloads.request.ItemRequest;
import com.sentinel.smarter.payloads.response.Response;

public interface ItemService {
    //view
    Response findItemViewByIDCompany(String id_perusahaan);
    Response findItemItemTypeViewByIDCompany(String id_perusahaan);
    //reference
    Response findReferenceByIDCompany(String id_perusahaan);
    //control
    Response getItemByID(String id);
    Response addItem(ItemRequest request);
    Response updateItemByID(String id, ItemRequest request);
}
