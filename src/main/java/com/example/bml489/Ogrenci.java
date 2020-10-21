package com.example.bml489;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@Entity
public class Ogrenci extends User {
    @Id
    @GeneratedValue
    private Integer id;
    private String adSoyad;
    private String tckimlikNo;

    @ManyToMany(mappedBy = "alanOgrenciler")
    private List<DersInstance> aldigiDersler;
}
