package com.sentinel.smarter.repositories.view;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sentinel.smarter.models.view.DetailMenuView;
import com.sentinel.smarter.models.view.MainMenuView;
import com.sentinel.smarter.models.view.MenuView;
import com.sentinel.smarter.models.view.SubDetailMenuView;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class MenuViewRepo {
    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
    public List<MenuView> findMenuByIDCompany(String id_perusahaan){
        Query q = em.createNativeQuery("SELECT * FROM lan_dbsmt.menu WHERE ID_PERUSAHAAN = " + id_perusahaan, MenuView.class);
        List<MenuView> menuViews = q.getResultList();
        return menuViews;
    }

    @SuppressWarnings("unchecked")
    public List<MenuView> findMenuByQuery(String sql){
        Query q = em.createNativeQuery(sql, MenuView.class);
        List<MenuView> menuViews = q.getResultList();
        return menuViews;
    }

    @SuppressWarnings("unchecked")
    public List<MainMenuView> findMainMenuByIDUserType(String id_jenis_pengguna){
        Query q = em.createNativeQuery("SELECT * FROM lan_dbsmt.menu_utama WHERE ID_JENIS_PENGGUNA = " + id_jenis_pengguna, MainMenuView.class);
        List<MainMenuView> mainMenuViews = q.getResultList();
        return mainMenuViews;
    }

    @SuppressWarnings("unchecked")
    public List<DetailMenuView> findDetailMenuByIDUserType(String id_jenis_pengguna){
        Query q = em.createNativeQuery("SELECT * FROM lan_dbsmt.menu_detail WHERE ID_JENIS_PENGGUNA = " + id_jenis_pengguna, DetailMenuView.class);
        List<DetailMenuView> detailMenuViews = q.getResultList();
        return detailMenuViews;
    }

    @SuppressWarnings("unchecked")
    public List<SubDetailMenuView> findSubDetailMenuByIDUserType(String id_jenis_pengguna){
        Query q = em.createNativeQuery("SELECT * FROM lan_dbsmt.menu_sub_detail WHERE ID_JENIS_PENGGUNA = " + id_jenis_pengguna, SubDetailMenuView.class);
        List<SubDetailMenuView> subDetailMenuViews = q.getResultList();
        return subDetailMenuViews;
    }
}
