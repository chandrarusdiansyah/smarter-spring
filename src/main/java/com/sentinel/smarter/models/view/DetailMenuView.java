package com.sentinel.smarter.models.view;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name="menu_detail")
@Immutable
public class DetailMenuView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private Long ID_JENIS_PENGGUNA;
    private Long ID_MENU_UTAMA;
    private String NAMA;
    private String IKON;
    private String TAUTAN;
    private String SUB_DETAIL;

    public Long getID() {
        return ID;
    }

    public Long getID_jenis_pengguna() {
        return ID_JENIS_PENGGUNA;
    }

    public Long getID_menu_utama() {
        return ID_MENU_UTAMA;
    }
 
    public String getNama() {
        return NAMA;
    }

    public String getIkon() {
        return IKON;
    }

    public String getTautan() {
        return TAUTAN;
    }

    public String getSub_detail() {
        return SUB_DETAIL;
    }
}
