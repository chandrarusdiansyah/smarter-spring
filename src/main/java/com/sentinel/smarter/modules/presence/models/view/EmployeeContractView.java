package com.sentinel.smarter.modules.presence.models.view;

import org.hibernate.annotations.Immutable;
import jakarta.persistence.*; 

@Entity@Table(name="pegawai")
@Immutable
public class EmployeeContractView {
    @Id
    private Long ID;
    private Long ID_SATUAN_KERJA;
    private String KODE_SATUAN_KERJA;
    private String NAMA_SATUAN_KERJA;
    private String LOKASI_SATUAN_KERJA;
    private Double LATITUDE_SATUAN_KERJA;
    private Double LONGITUDE_SATUAN_KERJA;
    private String NIK;
    private String NAMA;
    private String NAMA_JENIS_KELAMIN;
    private String TEMPAT_LAHIR;
    private String TANGGAL_LAHIR;
    private Long UMUR;
    private String ALAMAT;
    private String SELULER;
    private String NAMA_JENIS_KERJA;
    private String FOTO;

    public Long getID() {
        return ID;
    }

    public Long getID_satuan_kerja() {
        return ID_SATUAN_KERJA;
    }

    public String getKode_satuan_kerja() {
        return KODE_SATUAN_KERJA;
    }

    public String getNama_satuan_kerja() {
        return NAMA_SATUAN_KERJA;
    }

    public String getLokasi_satuan_kerja() {
        return LOKASI_SATUAN_KERJA;
    }

    public Double getLatitude_satuan_kerja() {
        return LATITUDE_SATUAN_KERJA;
    }

    public Double getLongitude_satuan_kerja() {
        return LONGITUDE_SATUAN_KERJA;
    }

    public String getNik() {
        return NIK;
    }

    public String getNama() {
        return NAMA;
    }

    public String getNama_jenis_kelamin() {
        return NAMA_JENIS_KELAMIN;
    }

    public String getTempat_lahir() {
        return TEMPAT_LAHIR;
    }

    public Long getUmur() {
        return UMUR;
    }

    public String getTanggal_lahir() {
        return TANGGAL_LAHIR;
    }

    public String getAlamat() {
        return ALAMAT;
    }

    public String getSeluler() {
        return SELULER;
    }

    public String getNama_jenis_kerja() {
        return NAMA_JENIS_KERJA;
    }

    public String getFoto() {
        return FOTO;
    }
}
