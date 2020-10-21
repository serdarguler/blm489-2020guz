package com.example.bml489;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class DersInstance {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private Ders ders;

    private String donem;

    @ManyToOne
    private Ogretmen verenOgretmen;
    //private List<Ogrenci> alanOgrenciler;
    private String tip;

    @ManyToMany
    private List<Ogrenci> alanOgrenciler;
}
