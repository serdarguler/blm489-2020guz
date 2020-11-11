package com.example.bml489.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
//@DiscriminatorValue(value="ogrenci")
public class Ogrenci extends User {

    private String adSoyad;
    private String tckimlikNo;
    private String ogrenciNo;

    @ManyToMany(mappedBy = "alanOgrenciler")
    private List<DersInstance> aldigiDersler;
}
