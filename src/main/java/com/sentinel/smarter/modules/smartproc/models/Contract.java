package com.sentinel.smarter.modules.smartproc.models;

import jakarta.persistence.*; 

@Entity @Table(name="tbl_kontrak")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String ID_PERUSAHAAN;
    private Long ID_JENIS_KONTRAK;
    private Long ID_SATUAN_KERJA;
    private Long ID_DIVISI;
    private String KODE;

    private String NAMA;

    private Long ID_METODE_KONTRAK;
    private Long ID_REKANAN;
    private Long NILAI_ANGGARAN;
    private Long NILAI_HPS;
    private Long NILAI_RAB;

    private Long NILAI_KONTRAK;
    private Long NILAI_REALISASI;
    private Long ID_BUKTI_BAYAR;
    private Long NILAI_ADENDUM;
    private Long NILAI_KONTRAK_AKHIR;

    private Long ID_JENIS_REALISASI;
    private String NOMOR_KONTRAK;
    private String TGL_KONTRAK;
    private String TGL_REALISASI;
    private String NOMOR_ADENDUM;

    private String TGL_ADENDUM;
    private String TERCATAT_LPSE;
    private String TGL_AWAL;
    private String TGL_AKHIR;
    private Double PROGRES;

    private String PDN;

    private Double NILAI_TKDN;
    private Double NILAI_TKDN_SELESAI;
    private String PENILAIAN;
    private String KENDALA;
    private String SELESAI;

    private String TAUTAN;
    private Long ID_PENGGUNA;

    public Contract() {
  
    }
 
    public Contract(String ID_PERUSAHAAN, Long ID_JENIS_KONTRAK, Long ID_SATUAN_KERJA, Long ID_DIVISI, String KODE,
        String NAMA,
        Long ID_METODE_KONTRAK, Long ID_REKANAN, Long NILAI_ANGGARAN, Long NILAI_HPS, Long NILAI_RAB,
        Long NILAI_KONTRAK, Long NILAI_REALISASI, Long ID_BUKTI_BAYAR, Long NILAI_ADENDUM, Long NILAI_KONTRAK_AKHIR,
        Long ID_JENIS_REALISASI, String NOMOR_KONTRAK, String TGL_KONTRAK, String TGL_REALISASI, String NOMOR_ADENDUM,
        String TGL_ADENDUM, String TERCATAT_LPSE, String TGL_AWAL, String TGL_AKHIR, Double PROGRES,
        String PDN, 
        Double NILAI_TKDN, Double NILAI_TKDN_SELESAI, String PENILAIAN, String KENDALA, String SELESAI, 
        String TAUTAN, Long ID_PENGGUNA) {

        this.ID_PERUSAHAAN = ID_PERUSAHAAN;
        this.ID_JENIS_KONTRAK = ID_JENIS_KONTRAK;
        this.ID_SATUAN_KERJA = ID_SATUAN_KERJA;
        this.ID_DIVISI = ID_DIVISI;
        this.KODE = KODE;

        this.NAMA = NAMA;

        this.ID_METODE_KONTRAK = ID_METODE_KONTRAK;
        this.ID_REKANAN = ID_REKANAN;
        this.NILAI_ANGGARAN = NILAI_ANGGARAN;
        this.NILAI_HPS = NILAI_HPS;
        this.NILAI_RAB = NILAI_RAB;

        this.NILAI_KONTRAK = NILAI_KONTRAK;
        this.NILAI_REALISASI = NILAI_REALISASI;
        this.ID_BUKTI_BAYAR = ID_BUKTI_BAYAR;
        this.NILAI_ADENDUM = NILAI_ADENDUM;
        this.NILAI_KONTRAK_AKHIR = NILAI_KONTRAK_AKHIR;

        this.ID_JENIS_REALISASI = ID_JENIS_REALISASI;
        this.NOMOR_KONTRAK = NOMOR_KONTRAK;
        this.TGL_KONTRAK = TGL_KONTRAK;
        this.TGL_REALISASI = TGL_REALISASI;
        this.NOMOR_ADENDUM = NOMOR_ADENDUM;

        this.TGL_ADENDUM = TGL_ADENDUM;
        this.TERCATAT_LPSE = TERCATAT_LPSE;
        this.TGL_AWAL = TGL_AWAL;
        this.TGL_AKHIR = TGL_AKHIR;
        this.PROGRES = PROGRES;

        this.PDN = PDN;

        this.NILAI_TKDN = NILAI_TKDN;
        this.NILAI_TKDN_SELESAI = NILAI_TKDN_SELESAI;
        this.PENILAIAN = PENILAIAN;
        this.KENDALA = KENDALA;
        this.SELESAI = SELESAI;

        this.TAUTAN = TAUTAN;
        this.ID_PENGGUNA = ID_PENGGUNA;
    } 

    public String getID_perusahaan() {
        return ID_PERUSAHAAN;
    }

    public void setID_perusahaan(String id_perusahaan) {
        this.ID_PERUSAHAAN = id_perusahaan;
    }

    public Long getID_jenis_kontrak() {
        return ID_JENIS_KONTRAK;
    }

    public void setID_jenis_kontrak(Long id_jenis_kontrak) {
        this.ID_JENIS_KONTRAK = id_jenis_kontrak;
    }

    public Long getID_satuan_kerja() {
        return ID_SATUAN_KERJA;
    }

    public void setID_satuan_kerja(Long id_satuan_kerja) {
        this.ID_SATUAN_KERJA = id_satuan_kerja;
    }

    public Long getID_divisi() {
        return ID_DIVISI;
    }

    public void setID_divisi(Long id_divisi) {
        this.ID_DIVISI = id_divisi;
    }

    public String getKode() {
        return KODE;
    }

    public void setKode(String kode) {
        this.KODE = kode;
    }


    public String getNama() {
        return NAMA;
    }

    public void setNama(String nama) {
        this.NAMA = nama;
    }


    public Long getID_metode_kontrak() {
        return ID_METODE_KONTRAK;
    }

    public void setID_metode_kontrak(Long id_metode_kontrak) {
        this.ID_METODE_KONTRAK = id_metode_kontrak;
    }

    public Long getID_rekanan() {
        return ID_REKANAN;
    }

    public void setID_rekanan(Long id_rekanan) {
        this.ID_REKANAN = id_rekanan;
    }

    public Long getNilai_anggaran() {
        return NILAI_ANGGARAN;
    }

    public void setNilai_anggaran(Long nilai_anggaran) {
        this.NILAI_ANGGARAN = nilai_anggaran;
    }

    public Long getNilai_hps() {
        return NILAI_HPS;
    }

    public void setNilai_hps(Long nilai_hps) {
        this.NILAI_HPS = nilai_hps;
    }

    public Long getNilai_rab() {
        return NILAI_RAB;
    }

    public void setNilai_rab(Long nilai_rab) {
        this.NILAI_RAB = nilai_rab;
    }


    public Long getNilai_kontrak() {
        return NILAI_KONTRAK;
    }

    public void setNilai_kontrak(Long nilai_kontrak) {
        this.NILAI_KONTRAK = nilai_kontrak;
    }

    public Long getNilai_realisasi() {
        return NILAI_REALISASI;
    }

    public void setNilai_realisasi(Long nilai_realisasi) {
        this.NILAI_REALISASI = nilai_realisasi;
    }

    public Long getID_bukti_bayar() {
        return ID_BUKTI_BAYAR;
    }

    public void setID_bukti_bayar(Long id_bukti_bayar) {
        this.ID_BUKTI_BAYAR = id_bukti_bayar;
    }

    public Long getNilai_adendum() {
        return NILAI_ADENDUM;
    }

    public void setNilai_adendum(Long nilai_adendum) {
        this.NILAI_ADENDUM = nilai_adendum;
    }

    public Long getNilai_kontrak_akhir() {
        return NILAI_KONTRAK_AKHIR;
    }

    public void setNilai_kontrak_akhir(Long nilai_kontrak_akhir) {
        this.NILAI_KONTRAK_AKHIR = nilai_kontrak_akhir;
    }


    public Long getID_jenis_realisasi() {
        return ID_JENIS_REALISASI;
    }

    public void setID_jenis_realisasi(Long id_jenis_realisasi) {
        this.ID_JENIS_REALISASI = id_jenis_realisasi;
    }

    public String getNomor_kontrak() {
        return NOMOR_KONTRAK;
    }

    public void setNomor_kontrak(String nomor_kontrak) {
        this.NOMOR_KONTRAK = nomor_kontrak;
    }

    public String getTgl_kontrak() {
        return TGL_KONTRAK;
    }

    public void setTgl_kontrak(String tgl_kontrak) {
        this.TGL_KONTRAK = tgl_kontrak;
    }

    public String getTgl_realisasi() {
        return TGL_REALISASI;
    }

    public void setTgl_realisasi(String tgl_realisasi) {
        this.TGL_REALISASI = tgl_realisasi;
    }

    public String getNomor_adendum() {
        return NOMOR_ADENDUM;
    }

    public void setNomor_adendum(String nomor_adendum) {
        this.NOMOR_ADENDUM = nomor_adendum;
    }


    public String getTgl_adendum() {
        return TGL_ADENDUM;
    }

    public void setTgl_adendum(String tgl_adendum) {
        this.TGL_ADENDUM = tgl_adendum;
    }

    public String getTercatat_lpse() {
        return TERCATAT_LPSE;
    }

    public void setTercatat_lpse(String tercatat_lpse) {
        this.TERCATAT_LPSE = tercatat_lpse;
    }

    public String getTgl_awal() {
        return TGL_AWAL;
    }

    public void setTgl_awal(String tgl_awal) {
        this.TGL_AWAL = tgl_awal;
    }

    public String getTgl_akhir() {
        return TGL_AKHIR;
    }

    public void setTgl_akhir(String tgl_akhir) {
        this.TGL_AKHIR = tgl_akhir;
    }

    public Double getProgres() {
        return PROGRES;
    }

    public void setProgres(Double progres) {
        this.PROGRES = progres;
    }


    public String getPdn() {
        return PDN;
    }

    public void setPdn(String pdn) {
        this.PDN = pdn;
    }


    public Double getNilai_tkdn() {
        return NILAI_TKDN;
    }

    public void setNilai_tkdn(Double nilai_tkdn) {
        this.NILAI_TKDN = nilai_tkdn;
    }

    public Double getNilai_tkdn_selesai() {
        return NILAI_TKDN_SELESAI;
    }

    public void setNilai_tkdn_selesai(Double nilai_tkdn_selesai) {
        this.NILAI_TKDN_SELESAI = nilai_tkdn_selesai;
    }

    public String getPenilaian() {
        return PENILAIAN;
    }

    public void setPenilaian(String penilaian) {
        this.PENILAIAN = penilaian;
    }
    
    public String getKendala() {
        return KENDALA;
    }

    public void setKendala(String kendala) {
        this.KENDALA = kendala;
    }

    public String getSelesai() {
        return SELESAI;
    }

    public void setSelesai(String selesai) {
        this.SELESAI = selesai;
    }


    public String getTautan() {
        return TAUTAN;
    }

    public void setTautan(String tautan) {
        this.TAUTAN = tautan;
    }

    public Long getID_pengguna() {
        return ID_PENGGUNA;
    }

    public void setID_pengguna(Long id_pengguna) {
        this.ID_PENGGUNA = id_pengguna;
    }
}
