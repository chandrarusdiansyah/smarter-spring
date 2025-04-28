package com.sentinel.smarter.securities.services;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Objects;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sentinel.smarter.models.view.UserView;

public class UserDetailsImpl implements UserDetails {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String username;
    private String email;

    @JsonIgnore
    private String password;
    
    private Long id_aplikasi;
    private Long id_jenis_pengguna;
    private Long id_pegawai;
    private String nip_pegawai;
    private String nama_pegawai;
    private String foto_pegawai;
    private String tautan;

    private Collection<? extends GrantedAuthority> authorities;

    public UserDetailsImpl(Long id, String username, String email, String password, Long id_aplikasi, Long id_jenis_pengguna, Long id_pegawai, String nip_pegawai, String nama_pegawai, String foto_pegawai, String tautan,
        Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.id_aplikasi = id_aplikasi;
        this.id_jenis_pengguna = id_jenis_pengguna;
        this.id_pegawai = id_pegawai;
        this.nip_pegawai = nip_pegawai;
        this.nama_pegawai = nama_pegawai;
        this.foto_pegawai = foto_pegawai;
        this.tautan = tautan;
        this.authorities = authorities;
    }

    public static UserDetailsImpl build(UserView userView) {
        List<GrantedAuthority> authorities = userView.getAkses().stream()
            .map(role -> new SimpleGrantedAuthority(role.getNama().name()))
            .collect(Collectors.toList());
        return new UserDetailsImpl(
            userView.getID(), 
            userView.getUsername(), 
            "",
            userView.getPassword(), 
            userView.getID_aplikasi(),
            userView.getID_jenis_pengguna(),
            userView.getID_pegawai(),
            userView.getNip_pegawai(),
            userView.getNama_pegawai(),
            userView.getFoto_pegawai(),
            userView.getTautan_aplikasi(),
            authorities);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }
  
    public Long getId() {
        return id;
    }

    @Override
    public String getUsername() {
        return username;
    }
  
    public String getEmail() {
        return email;
    }
  
    @Override
    public String getPassword() {
        return password;
    }

    public Long getID_aplikasi() {
        return id_aplikasi;
    }

    public Long getID_jenis_pengguna() {
        return id_jenis_pengguna;
    }

    public Long getID_pegawai() {
        return id_pegawai;
    }

    public String getNip_pegawai() {
        return nip_pegawai;
    }

    public String getNama_pegawai() {
        return nama_pegawai;
    }

    public String getFoto_pegawai() {
        return foto_pegawai;
    }

    public String getTautan() {
        return tautan;
    }
  
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
  
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
  
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
  
    @Override
    public boolean isEnabled() {
      return true;
    }
  
    @Override
    public boolean equals(Object o) {
        if (this == o)
        return true;
        if (o == null || getClass() != o.getClass())
        return false;
        UserDetailsImpl user = (UserDetailsImpl) o;
        return Objects.equals(id, user.id);
    }
}
