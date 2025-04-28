package com.sentinel.smarter.modules.presence.models.view;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;

import org.hibernate.annotations.Immutable;

@Entity
@Table(name="presensi")
@Immutable
public class PresenceView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private int ID_PEGAWAI;
    private String NIK_PEGAWAI;
    private String NAMA_PEGAWAI;
    private String KODE_SATUAN_KERJA;
    private String NAMA_SATUAN_KERJA;
    private String LOKASI_SATUAN_KERJA;
    private String NAMA_JENIS_KERJA;
    private Date TANGGAL;
    private String NAMA_JENIS_PRESENSI;
    private String NAMA_STATUS_PRESENSI;
    private Time JAM_MASUK;
    private Double MASUK_LATITUDE;
    private Double MASUK_LONGITUDE;
    private String MASUK_FOTO;
    private Time JAM_KELUAR;
    private Double KELUAR_LATITUDE;
    private Double KELUAR_LONGITUDE;
    private String KELUAR_FOTO;

    public PresenceView(int ID, int ID_PEGAWAI, String NIK_PEGAWAI, String NAMA_PEGAWAI, String KODE_SATUAN_KERJA, String NAMA_SATUAN_KERJA, String LOKASI_SATUAN_KERJA, String NAMA_JENIS_KERJA, Date TANGGAL, String NAMA_JENIS_PRESENSI, String NAMA_STATUS_PRESENSI, Time JAM_MASUK, Double MASUK_LATITUDE, Double MASUK_LONGITUDE, String MASUK_FOTO, Time JAM_KELUAR, Double KELUAR_LATITUDE, Double KELUAR_LONGITUDE, String KELUAR_FOTO) { 
        this.ID = ID; 
        this.ID_PEGAWAI = ID_PEGAWAI;
        this.NIK_PEGAWAI = NIK_PEGAWAI;
        this.NAMA_PEGAWAI = NAMA_PEGAWAI;
        this.KODE_SATUAN_KERJA = KODE_SATUAN_KERJA;
        this.NAMA_SATUAN_KERJA = NAMA_SATUAN_KERJA;
        this.LOKASI_SATUAN_KERJA = LOKASI_SATUAN_KERJA;
        this.NAMA_JENIS_KERJA = NAMA_JENIS_KERJA;
        this.TANGGAL = TANGGAL;
        this.NAMA_JENIS_PRESENSI = NAMA_JENIS_PRESENSI;
        this.NAMA_STATUS_PRESENSI = NAMA_STATUS_PRESENSI;
        this.JAM_MASUK = JAM_MASUK;
        this.MASUK_LATITUDE = MASUK_LATITUDE;
        this.MASUK_LONGITUDE = MASUK_LONGITUDE;
        this.MASUK_FOTO = MASUK_FOTO;
        this.JAM_KELUAR = JAM_KELUAR;
        this.KELUAR_LATITUDE = KELUAR_LATITUDE;
        this.KELUAR_LONGITUDE = KELUAR_LONGITUDE;
        this.KELUAR_FOTO = KELUAR_FOTO;
    }


    public int getID() {
        return ID;
    }

    public int getID_pegawai() {
        return ID_PEGAWAI;
    }

    public String getNik_pegawai() {
        return NIK_PEGAWAI;
    }

    public String getNama_pegawai() {
        return NAMA_PEGAWAI;
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

    public String getNama_jenis_kerja() {
        return NAMA_JENIS_KERJA;
    }

    public Date getTanggal() {
        return TANGGAL;
    }

    public String getNama_jenis_presensi() {
        return NAMA_JENIS_PRESENSI;
    }

    public String getNama_status_presensi() {
        return NAMA_STATUS_PRESENSI;
    }

    public Time getJam_masuk() {
        return JAM_MASUK;
    }

    public Double getMasuk_latitude() {
        return MASUK_LATITUDE;
    }

    public Double getMasuk_longitude() {
        return MASUK_LONGITUDE;
    }

    public String getMasuk_foto() {
        return MASUK_FOTO;
    }

    public Time getJam_keluar() {
        return JAM_KELUAR;
    }

    public Double getKeluar_latitude() {
        return KELUAR_LATITUDE;
    }

    public Double getKeluar_longitude() {
        return KELUAR_LONGITUDE;
    }

    public String getKeluar_foto() {
        return KELUAR_FOTO;
    }
}
