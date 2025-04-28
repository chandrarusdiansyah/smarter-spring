package com.sentinel.smarter.modules.pelita.models.view;

import org.hibernate.annotations.Immutable;
import jakarta.persistence.*; 

@Entity@Table(name="prasarana_kondisi")
@Immutable
public class InfrastructureConditionView {
    @Id
    private String KODE_SATUAN_KERJA;
    private String NAMA_SATUAN_KERJA;
    private String LOKASI_SATUAN_KERJA;
    private String NAMA_JENIS_PRASARANA;
    private Long BELUM;
    private Long BAIK;
    private Long RINGAN;
    private Long BERAT;
    private Long JUMLAH;

    public String getKode_satuan_kerja() {
        return KODE_SATUAN_KERJA;
    }

    public String getNama_satuan_kerja() {
        return NAMA_SATUAN_KERJA;
    }

    public String getLokasi_satuan_kerja() {
        return LOKASI_SATUAN_KERJA;
    }

    public String getNama_jenis_prasarana() {
        return NAMA_JENIS_PRASARANA;
    }

    public Long getBelum() {
        return BELUM;
    }

    public Long getBaik() {
        return BAIK;
    }

    public Long getRingan() {
        return RINGAN;
    }

    public Long getBerat() {
        return BERAT;
    }

    public Long getJumlah() {
        return JUMLAH;
    }
}
