package com.sentinel.smarter.modules.smartproc.payloads.request;

public class ContractRequest {
    private String id_perusahaan;
    private Long id_jenis_kontrak;
    private Long id_satuan_kerja;
    private Long id_divisi;
    private String kode;

    private String nama;

    private Long id_metode_kontrak;
    private Long id_rekanan;
    private Long nilai_anggaran;
    private Long nilai_hps;
    private Long nilai_rab;

    private Long nilai_kontrak;
    private Long nilai_realisasi;
    private Long id_bukti_bayar;
    private Long nilai_adendum;
    private Long nilai_kontrak_akhir;

    private Long id_jenis_realisasi;
    private String nomor_kontrak;
    private String tgl_kontrak;
    private String tgl_realisasi;
    private String nomor_adendum;

    private String tgl_adendum;
    private String tercatat_lpse;
    private String tgl_awal;
    private String tgl_akhir;
    private Double progres;

    private String pdn;

    private Double nilai_tkdn;
    private Double nilai_tkdn_selesai;
    private String penilaian;
    private String kendala;
    private String selesai;

    private String tautan;
    private Long id_pengguna;

    public ContractRequest(String id_perusahaan, Long id_jenis_kontrak, Long id_satuan_kerja, Long id_divisi, String kode,
        String nama,
        Long id_metode_kontrak, Long id_rekanan, Long nilai_anggaran, Long nilai_hps, Long nilai_rab,
        Long nilai_kontrak, Long nilai_realisasi, Long id_bukti_bayar, Long nilai_adendum, Long nilai_kontrak_akhir,
        Long id_jenis_realisasi, String nomor_kontrak, String tgl_kontrak, String tgl_realisasi, String nomor_adendum,
        String tgl_adendum, String tercatat_lpse, String tgl_awal, String tgl_akhir, Double progres,
        String pdn,
        Double nilai_tkdn, Double nilai_tkdn_selesai, String penilaian, String kendala, String selesai, 
        String tautan, Long id_pengguna) {

        this.id_perusahaan = id_perusahaan;
        this.id_jenis_kontrak = id_jenis_kontrak;
        this.id_satuan_kerja = id_satuan_kerja;
        this.id_divisi = id_divisi;
        this.nama = nama;

        this.kode = kode;

        this.id_metode_kontrak = id_metode_kontrak;
        this.id_rekanan = id_rekanan;
        this.nilai_anggaran = nilai_anggaran;
        this.nilai_hps = nilai_hps;
        this.nilai_rab = nilai_rab;

        this.nilai_kontrak = nilai_kontrak;
        this.nilai_realisasi = nilai_realisasi;
        this.id_bukti_bayar = id_bukti_bayar;
        this.nilai_adendum = nilai_adendum;
        this.nilai_kontrak_akhir = nilai_kontrak_akhir;

        this.id_jenis_realisasi = id_jenis_realisasi;
        this.nomor_kontrak = nomor_kontrak;
        this.tgl_kontrak = tgl_kontrak;
        this.tgl_realisasi = tgl_realisasi;
        this.nomor_adendum = nomor_adendum;

        this.tgl_adendum = tgl_adendum;
        this.tercatat_lpse = tercatat_lpse;
        this.tgl_awal = tgl_awal;
        this.tgl_akhir = tgl_akhir;
        this.progres = progres;

        this.pdn = pdn;

        this.nilai_tkdn = nilai_tkdn;
        this.nilai_tkdn_selesai = nilai_tkdn_selesai;
        this.penilaian = penilaian;
        this.kendala = kendala;
        this.selesai = selesai;

        this.tautan = tautan;
        this.id_pengguna = id_pengguna;
    } 

    public String getID_perusahaan() {
        return id_perusahaan;
    }

    public void setID_perusahaan(String id_perusahaan) {
        this.id_perusahaan = id_perusahaan;
    }

    public Long getID_jenis_kontrak() {
        return id_jenis_kontrak;
    }

    public void setID_jenis_kontrak(Long id_jenis_kontrak) {
        this.id_jenis_kontrak = id_jenis_kontrak;
    }

    public Long getID_satuan_kerja() {
        return id_satuan_kerja;
    }

    public void setID_satuan_kerja(Long id_satuan_kerja) {
        this.id_satuan_kerja = id_satuan_kerja;
    }

    public Long getID_divisi() {
        return id_divisi;
    }

    public void setID_divisi(Long id_divisi) {
        this.id_divisi = id_divisi;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    public Long getID_metode_kontrak() {
        return id_metode_kontrak;
    }

    public void setID_metode_kontrak(Long id_metode_kontrak) {
        this.id_metode_kontrak = id_metode_kontrak;
    }

    public Long getID_rekanan() {
        return id_rekanan;
    }

    public void setID_rekanan(Long id_rekanan) {
        this.id_rekanan = id_rekanan;
    }

    public Long getNilai_anggaran() {
        return nilai_anggaran;
    }

    public void setNilai_anggaran(Long nilai_anggaran) {
        this.nilai_anggaran = nilai_anggaran;
    }

    public Long getNilai_hps() {
        return nilai_hps;
    }

    public void setNilai_hps(Long nilai_hps) {
        this.nilai_hps = nilai_hps;
    }

    public Long getNilai_rab() {
        return nilai_rab;
    }

    public void setNilai_rab(Long nilai_rab) {
        this.nilai_rab = nilai_rab;
    }


    public Long getNilai_kontrak() {
        return nilai_kontrak;
    }

    public void setNilai_kontrak(Long nilai_kontrak) {
        this.nilai_kontrak = nilai_kontrak;
    }

    public Long getNilai_realisasi() {
        return nilai_realisasi;
    }

    public void setNilai_realisasi(Long nilai_realisasi) {
        this.nilai_realisasi = nilai_realisasi;
    }

    public Long getID_bukti_bayar() {
        return id_bukti_bayar;
    }

    public void setID_bukti_bayar(Long id_bukti_bayar) {
        this.id_bukti_bayar = id_bukti_bayar;
    }

    public Long getNilai_adendum() {
        return nilai_adendum;
    }

    public void setNilai_adendum(Long nilai_adendum) {
        this.nilai_adendum = nilai_adendum;
    }

    public Long getNilai_kontrak_akhir() {
        return nilai_kontrak_akhir;
    }

    public void setNilai_kontrak_akhir(Long nilai_kontrak_akhir) {
        this.nilai_kontrak_akhir = nilai_kontrak_akhir;
    }

    public Long getID_jenis_realisasi() {
        return id_jenis_realisasi;
    }

    public void setID_jenis_realisasi(Long id_jenis_realisasi) {
        this.id_jenis_realisasi = id_jenis_realisasi;
    }

    public String getNomor_kontrak() {
        return nomor_kontrak;
    }

    public void setNomor_kontrak(String nomor_kontrak) {
        this.nomor_kontrak = nomor_kontrak;
    }

    public String getTgl_kontrak() {
        return tgl_kontrak;
    }

    public void setTgl_kontrak(String tgl_kontrak) {
        this.tgl_kontrak = tgl_kontrak;
    }

    public String getTgl_realisasi() {
        return tgl_realisasi;
    }

    public void setTgl_realisasi(String tgl_realisasi) {
        this.tgl_realisasi = tgl_realisasi;
    }

    public String getNomor_adendum() {
        return nomor_adendum;
    }

    public void setNomor_adendum(String nomor_adendum) {
        this.nomor_adendum = nomor_adendum;
    }


    public String getTgl_adendum() {
        return tgl_adendum;
    }

    public void setTgl_adendum(String tgl_adendum) {
        this.tgl_adendum = tgl_adendum;
    }

    public String getTercatat_lpse() {
        return tercatat_lpse;
    }

    public void setTercatat_lpse(String tercatat_lpse) {
        this.tercatat_lpse = tercatat_lpse;
    }

    public String getTgl_awal() {
        return tgl_awal;
    }

    public void setTgl_awal(String tgl_awal) {
        this.tgl_awal = tgl_awal;
    }

    public String getTgl_akhir() {
        return tgl_akhir;
    }

    public void setTgl_akhir(String tgl_akhir) {
        this.tgl_akhir = tgl_akhir;
    }

    public Double getProgres() {
        return progres;
    }

    public void setProgres(Double progres) {
        this.progres = progres;
    }


    public String getPdn() {
        return pdn;
    }

    public void setPdn(String pdn) {
        this.pdn = pdn;
    }


    public Double getNilai_tkdn() {
        return nilai_tkdn;
    }

    public void setNilai_tkdn(Double nilai_tkdn) {
        this.nilai_tkdn = nilai_tkdn;
    }

    public Double getNilai_tkdn_selesai() {
        return nilai_tkdn_selesai;
    }

    public void setNilai_tkdn_selesai(Double nilai_tkdn_selesai) {
        this.nilai_tkdn_selesai = nilai_tkdn_selesai;
    }

    public String getPenilaian() {
        return penilaian;
    }

    public void setPenilaian(String penilaian) {
        this.penilaian = penilaian;
    }
    
    public String getKendala() {
        return kendala;
    }

    public void setKendala(String kendala) {
        this.kendala = kendala;
    }

    public String getSelesai() {
        return selesai;
    }

    public void setSelesai(String selesai) {
        this.selesai = selesai;
    }


    public String getTautan() {
        return tautan;
    }

    public void setTautan(String tautan) {
        this.tautan = tautan;
    }

    public Long getID_pengguna() {
        return id_pengguna;
    }

    public void setID_pengguna(Long id_pengguna) {
        this.id_pengguna = id_pengguna;
    }

}
