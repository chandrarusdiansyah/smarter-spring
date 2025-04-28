package com.sentinel.smarter.models.view;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.Immutable;

import com.sentinel.smarter.models.UserType;

import jakarta.persistence.*; 

@Entity
@Table(name="pengguna")
@Immutable
public class UserView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private Long ID_JENIS_PENGGUNA;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "pengguna", 
        joinColumns = @JoinColumn(name = "ID"),
        inverseJoinColumns = @JoinColumn(name = "ID_JENIS_PENGGUNA"))
    private Set<UserType> AKSES = new HashSet<>();
    
    private String NAMA_JENIS_PENGGUNA;
    private Long ID_APLIKASI;
    private String KODE_APLIKASI;
    private String NAMA_APLIKASI;
    private String TAUTAN_APLIKASI;
    private Long ID_PEGAWAI;
    private String NIP_PEGAWAI;
    private String NAMA_PEGAWAI;
    private String FOTO_PEGAWAI;
    private String username;
    private String email;
    private String password;

    public Long getID() {
        return ID;
    }

    public Long getID_jenis_pengguna() {
        return ID_JENIS_PENGGUNA;
    }

    public Set<UserType> getAkses() {
        return AKSES;
    }

    public String getNama_jenis_pengguna() {
        return NAMA_JENIS_PENGGUNA;
    }

    public Long getID_aplikasi() {
        return ID_APLIKASI;
    }

    public String getKode_aplikasi() {
        return KODE_APLIKASI;
    }

    public String getNama_aplikasi() {
        return NAMA_APLIKASI;
    }

    public String getTautan_aplikasi() {
        return TAUTAN_APLIKASI;
    }

    public Long getID_pegawai() {
        return ID_PEGAWAI;
    }

    public String getNip_pegawai() {
        return NIP_PEGAWAI;
    }

    public String getNama_pegawai() {
        return NAMA_PEGAWAI;
    }

    public String getFoto_pegawai() {
        return FOTO_PEGAWAI;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
