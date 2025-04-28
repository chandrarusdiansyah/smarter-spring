package com.sentinel.smarter.models.view;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name="menu_sub_detail")
@Immutable
public class SubDetailMenuView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private Long ID_JENIS_PENGGUNA;
    private Long ID_MENU_DETAIL;
    private String NAMA;
    private String IKON;
    private String TAUTAN;

    public Long getID() {
        return ID;
    }

    public Long getID_jenis_pengguna() {
        return ID_JENIS_PENGGUNA;
    }

    public Long getID_menu_detail() {
        return ID_MENU_DETAIL;
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
}
