package com.example.bml489.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name="type",discriminatorType= DiscriminatorType.STRING)
@Table(name = "user_table")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String adSoyad;
    private String kullaniciAdi;
    private String sifre;
    private String profil;
}
