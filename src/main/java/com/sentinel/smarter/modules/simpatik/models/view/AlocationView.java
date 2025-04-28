package com.sentinel.smarter.modules.simpatik.models.view;

import org.hibernate.annotations.Immutable;
import jakarta.persistence.*; 

@Entity@Table(name="alokasi")
@Immutable
public class AlocationView {
    @Id
    private Long ID;
    private String KODE_SATUAN_KERJA;
    private String NAMA_SATUAN_KERJA;
    private String LOKASI_SATUAN_KERJA;
    private String KODE_BARANG;
    private String NAMA_BARANG;
    private String NUP;
    private String MERK;
    private String TIPE;
    private String NAMA_KEPEMILIKAN;
    private String NAMA_STATUS_GUNA;
    private String NO_BPKB;
    private String NO_POLISI;
    private String ALAMAT;
    private String KABUPATEN_KOTA;
    private String PROVINSI;
    private Long ID_KONDISI_BARANG;
    private String NAMA_KONDISI_BARANG;

    public Long getID() {
        return ID;
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

    public String getKode_barang() {
        return KODE_BARANG;
    }

    public String getNama_barang() {
        return NAMA_BARANG;
    }

    public String getNup() {
        return NUP;
    }

    public String getMerk() {
        return MERK;
    }

    public String getTipe() {
        return TIPE;
    }

    public String getNama_kepemilikan() {
        return NAMA_KEPEMILIKAN;
    }

    public String getNama_status_guna() {
        return NAMA_STATUS_GUNA;
    }

    public String getNo_bpkb() {
        return NO_BPKB;
    }

    public String getNo_polisi() {
        return NO_POLISI;
    }

    public String getAlamat() {
        return ALAMAT;
    }

    public String getKabupaten_kota() {
        return KABUPATEN_KOTA;
    }

    public String getProvinsi() {
        return PROVINSI;
    }

    public Long getID_kondisi_barang() {
        return ID_KONDISI_BARANG;
    }

    public String getNama_kondisi_barang() {
        return NAMA_KONDISI_BARANG;
    }
}
