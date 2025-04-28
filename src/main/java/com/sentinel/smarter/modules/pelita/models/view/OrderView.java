package com.sentinel.smarter.modules.pelita.models.view;

import org.hibernate.annotations.Immutable;
import jakarta.persistence.*; 

@Entity@Table(name="pesan")
@Immutable
public class OrderView {
    @Id
    private Long ID;
    private String TANGGAL;
    private String NOMOR;
    private String KODE_SATUAN_KERJA;
    private String NAMA_SATUAN_KERJA;
    private String LOKASI_SATUAN_KERJA;
    private String NAMA_JENIS_TAMU;
    private String NAMA_TAMU;
    private String INSTANSI_TAMU;
    private String TGL_MASUK;
    private String TGL_KELUAR;
    private String KEGIATAN;
    private Long PESERTA;
    private String KETERANGAN;
    private String NAMA_PEGAWAI;

    public Long getID() {
        return ID;
    }

    public String getTanggal() {
        return TANGGAL;
    }

    public String getNomor() {
        return NOMOR;
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

    public String getNama_jenis_tamu() {
        return NAMA_JENIS_TAMU;
    }

    public String getNama_tamu() {
        return NAMA_TAMU;
    }

    public String getInstansi_tamu() {
        return INSTANSI_TAMU;
    }

    public String getTgl_masuk() {
        return TGL_MASUK;
    }

    public String getTgl_keluar() {
        return TGL_KELUAR;
    }

    public String getKegiatan() {
        return KEGIATAN;
    }

    public Long getPeserta() {
        return PESERTA;
    }

    public String getKeterangan() {
        return KETERANGAN;
    }

    public String getNama_pegawai() {
        return NAMA_PEGAWAI;
    }
}
