package com.sentinel.smarter.modules.pelita.models.view;

import org.hibernate.annotations.Immutable;
import jakarta.persistence.*;

@Entity
@Table(name="pesan_sarana")
@Immutable
public class OrderMeansView {
    @Id
    private Long ID;
    private String NAMA_JENIS_TAMU;
    private String NAMA_TAMU;
    private String INSTANSI_TAMU;
    private String KODE_SARANA;
    private String NAMA_SARANA;
    private String TANGGAL;
    private String DARI_JAM;
    private String SAMPAI_JAM;

    public Long getID() {
        return ID;
    }

    public String getNama_jenis_tamu() {
        return NAMA_JENIS_TAMU;
    }

    public String getNama_tamu() {
        return NAMA_TAMU;
    }

    public String getInstansi_tamu() {
        return INSTANSI_TAMU;
    }

    public String getKode_sarana() {
        return KODE_SARANA;
    }

    public String getNama_sarana() {
        return NAMA_SARANA;
    }

    public String getTanggal() {
        return TANGGAL;
    }

    public String getDari_jam() {
        return DARI_JAM;
    }

    public String getSampai_jam() {
        return SAMPAI_JAM;
    }
}
