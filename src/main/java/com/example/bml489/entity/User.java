package com.example.bml489.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@Entity
@Table(name = "user_table")
public class User implements UserDetails {
    @Id
    @GeneratedValue
    private int id;
    private String adSoyad;
    private String username;
    private String password;
    private String profil;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<UserRole> roles;

    @Override
    @Transient
    public Collection<UserRole> getAuthorities() {
        List<UserRole> userRoles = this.getRoles();
        return userRoles;
    }


    @Override
    @Transient
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    @Transient
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    @Transient
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    @Transient
    public boolean isEnabled() {
        return true;
    }


}
