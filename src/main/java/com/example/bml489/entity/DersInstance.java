package com.example.bml489.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class DersInstance {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JsonBackReference(value = "ders")
    private Ders ders;

    private String donem;

    @ManyToOne
    @JsonBackReference(value = "ogretmen")
    private Ogretmen verenOgretmen;
    //private List<Ogrenci> alanOgrenciler;
    private String tip;

    @ManyToMany
    @JsonBackReference(value = "ogrenci")
    private List<Ogrenci> alanOgrenciler;
}
