package com.sentinel.smarter.modules.pelita.models;

import jakarta.persistence.*; 

@Entity
@Table(name="tbl_pesan_sarana")
public class OrderMeans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String ID_PERUSAHAAN;
    private Long ID_PESAN;
    private Long ID_SARANA;
    private String TANGGAL;
    private String DARI_JAM;
    private String SAMPAI_JAM;
    private Long ID_PENGGUNA;

    public OrderMeans() {
  
    }

    public OrderMeans(
        String ID_PERUSAHAAN, Long ID_PESAN, Long ID_SARANA, String TANGGAL, String DARI_JAM, String SAMPAI_JAM, Long ID_PENGGUNA) {
            this.ID_PERUSAHAAN = ID_PERUSAHAAN;
            this.ID_PESAN = ID_PESAN;
            this.ID_SARANA = ID_SARANA;
            this.TANGGAL = TANGGAL;
            this.DARI_JAM = DARI_JAM;
            this.SAMPAI_JAM = SAMPAI_JAM;
            this.ID_PENGGUNA = ID_PENGGUNA;
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

    public Long getID_pesan() {
        return ID_PESAN;
    }

    public void setID_pesan(Long id_pesan) {
        this.ID_PESAN = id_pesan;
    }

    public Long getID_sarana() {
        return ID_SARANA;
    }

    public void setID_sarana(Long id_sarana) {
        this.ID_SARANA = id_sarana;
    }

    public String getTanggal() {
        return TANGGAL;
    }

    public void setTanggal(String tanggal) {
        this.TANGGAL = tanggal;
    }

    public String getDari_jam() {
        return DARI_JAM;
    }

    public void setDari_jam(String dari_jam) {
        this.DARI_JAM = dari_jam;
    }

    public String getSampai_jam() {
        return SAMPAI_JAM;
    }

    public void setSampai_jam(String sampai_jam) {
        this.SAMPAI_JAM = sampai_jam;
    }

    public Long getID_pengguna() {
        return ID_PENGGUNA;
    }

    public void setID_pengguna(Long id_pengguna) {
        this.ID_PENGGUNA = id_pengguna;
    }
}
