package com.sentinel.smarter.implamentations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.sentinel.smarter.models.view.DetailMenuView;
import com.sentinel.smarter.models.view.MainMenuView;
import com.sentinel.smarter.models.view.SubDetailMenuView;
import com.sentinel.smarter.payloads.response.Response;
import com.sentinel.smarter.repositories.view.MenuViewRepo;
import com.sentinel.smarter.services.MenuService;

@Service
public class MenuImpl implements MenuService {

    private ModelMap modelMap = new ModelMap();

    @Autowired
    private MenuViewRepo menuViewRepo;

    @Override
    public Response findMenuByIDUserType(String id_jenis_pengguna) {
        modelMap.clear();
        List<MainMenuView> mainMenuViews = menuViewRepo.findMainMenuByIDUserType(id_jenis_pengguna);
        modelMap.put("main", mainMenuViews);
        List<DetailMenuView> detailMenuViews = menuViewRepo.findDetailMenuByIDUserType(id_jenis_pengguna);
        modelMap.put("detail", detailMenuViews);
        List<SubDetailMenuView> subDetailMenuViews = menuViewRepo.findSubDetailMenuByIDUserType(id_jenis_pengguna);
        modelMap.put("sub_detail", subDetailMenuViews);
        Response response = new Response(HttpStatus.OK.value(),"data menu ditemukan", modelMap);
        return response;
    }
    
}
