package com.sentinel.smarter.models;

import jakarta.persistence.*; 
import com.sentinel.smarter.models.enumerator.AccessEnum;

@Entity
@Table(name="tbl_jenis_pengguna")
public class UserType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String ID_PERUSAHAAN;
    private String KODE;
    @Enumerated(EnumType.STRING)
    private AccessEnum NAMA;

    public UserType() {

    }

    public UserType(String ID_PERUSAHAAN, String KODE, AccessEnum NAMA, Long ID_PENGGUNA) {
        this.ID_PERUSAHAAN = ID_PERUSAHAAN;
        this.KODE = KODE;
        this.NAMA = NAMA;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getID_perusahaan() {
        return ID_PERUSAHAAN;
    }

    public void setID_perusahaan(String id_perusahaan) {
        this.ID_PERUSAHAAN = id_perusahaan;
    }

    public String getKode() {
        return KODE;
    }

    public void setKode(String kode) {
        this.KODE = kode;
    }

    public AccessEnum getNama() {
        return NAMA;
    }
    
    public void setNama(AccessEnum nama) {
        this.NAMA = nama;
    }
}
