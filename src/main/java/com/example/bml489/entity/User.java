package com.example.bml489.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Data
@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type",discriminatorType= DiscriminatorType.STRING)
@Table(name = "user_table")
public class User implements UserDetails {
    @Id
    @GeneratedValue
    private int id;
    private String adSoyad;
    private String kullaniciAdi;
    private String sifre;
    private String profil;

    @Override
    @Transient
    public Collection<? extends GrantedAuthority> getAuthorities() {

        GrantedAuthority ga = new GrantedAuthority() {
            @Override
            public String getAuthority() {
                return "ROLE_USER";
            }
        };

        Collection<GrantedAuthority> gac = new ArrayList<>();
        gac.add(ga);
        return gac;
    }

    @Override
    @Transient
    public String getPassword() {
        return this.sifre;
    }

    @Override
    @Transient
    public String getUsername() {
        return this.kullaniciAdi;
    }

    @Override
    @Transient
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    @Transient
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    @Transient
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    @Transient
    public boolean isEnabled() {
        return false;
    }
}
