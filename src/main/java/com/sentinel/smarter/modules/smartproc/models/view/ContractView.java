package com.sentinel.smarter.modules.smartproc.models.view;

import org.hibernate.annotations.Immutable;
import jakarta.persistence.*; 

@Entity@Table(name="kontrak")
@Immutable
public class ContractView {
    @Id
    private Long ID;
    private String NAMA_JENIS_KONTRAK;
    private String TGL_KONTRAK;
    private String NOMOR_KONTRAK;
    private String NAMA_SATUAN_KERJA;
    private String NAMA_DIVISI;
    private String KODE;
    private String NAMA;
    private String NAMA_METODE_KONTRAK;
    private String NAMA_REKANAN;
    private String ALAMAT_REKANAN;
    private String NAMA_BUKTI_BAYAR;
    private String NAMA_JENIS_REALISASI;
    private String TGL_REALISASI;
    private String TGL_AWAL;
    private String TGL_AKHIR;
    private Double PROGRES;
    private String PDN;
    private String SELESAI;
    private String TAUTAN;
    private String NAMA_PEGAWAI;

    public Long getID() {
        return ID;
    }

    public String getNama_jenis_kontrak() {
        return NAMA_JENIS_KONTRAK;
    } 

    public String getTgl_kontrak() {
        return TGL_KONTRAK;
    } 

    public String getNomor_kontrak() {
        return NOMOR_KONTRAK;
    } 

    public String getNama_satuan_kerja() {
        return NAMA_SATUAN_KERJA;
    } 

    public String getNama_divisi() {
        return NAMA_DIVISI;
    } 

    public String getKode() {
        return KODE;
    }  

    public String getNama() {
        return NAMA;
    }  

    public String getNama_metode_kontrak() {
        return NAMA_METODE_KONTRAK;
    }  

    public String getNama_rekanan() {
        return NAMA_REKANAN;
    }

    public String getAlamat_rekanan() {
        return ALAMAT_REKANAN;
    }

    public String getNama_bukti_bayar() {
        return NAMA_BUKTI_BAYAR;
    }

    public String getNama_jenis_realisasi() {
        return NAMA_JENIS_REALISASI;
    }

    public String getTgl_realisasi() {
        return TGL_REALISASI;
    }

    public String getTgl_awal() {
        return TGL_AWAL;
    }

    public String getTgl_akhir() {
        return TGL_AKHIR;
    }

    public Double getProgres() {
        return PROGRES;
    }

    public String getPdn() {
        return PDN;
    }

    public String getSelesai() {
        return SELESAI;
    }

    public String getTautan() {
        return TAUTAN;
    }

    public String getNama_pegawai() {
        return NAMA_PEGAWAI;
    }
}
