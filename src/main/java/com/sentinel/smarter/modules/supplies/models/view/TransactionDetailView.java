package com.sentinel.smarter.modules.supplies.models.view;

import org.hibernate.annotations.Immutable;
import jakarta.persistence.*; 

@Entity@Table(name="transaksi_detail")
@Immutable
public class TransactionDetailView {
    @Id
    private Long ID;
    private Long ID_JENIS_TRANSAKSI;
    private Long ID_TRANSAKSI;
    private String TANGGAL_TRANSAKSI;
    private String NOMOR_TRANSAKSI;
    private Long ID_BARANG;
    private String NAMA_BARANG;
    private String NAMA_SATUAN;
    private Long HARGA;
    private Long JUMLAH;
    private Long TOTAL;
    private String KETERANGAN;

    public Long getID() {
        return ID;
    }

    public Long getID_jenis_transaksi() {
        return ID_JENIS_TRANSAKSI;
    }

    public Long getID_transaksi() {
        return ID_TRANSAKSI;
    }

    public String getTanggal_transaksi() {
        return TANGGAL_TRANSAKSI;
    }  

    public String getNomor_transaksi() {
        return NOMOR_TRANSAKSI;
    }  

    public Long getID_barang() {
        return ID_BARANG;
    }

    public String getNama_barang() {
        return NAMA_BARANG;
    }  

    public String getNama_satuan() {
        return NAMA_SATUAN;
    }  

    public Long getHarga() {
        return HARGA;
    }

    public Long getJumlah() {
        return JUMLAH;
    }

    public Long getTotal() {
        return TOTAL;
    }

    public String getKeterangan() {
        return KETERANGAN;
    }  
}
