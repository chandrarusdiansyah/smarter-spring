package com.sentinel.smarter.services;

import com.sentinel.smarter.payloads.response.Response;

public interface MenuService {
    //view
    Response findMenuByIDUserType(String id_jenis_pengguna);
}
