package com.example.bml489;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Ders {
    @Id
    @GeneratedValue
    private Integer id ;
    private String dersAdi;
    @OneToMany(mappedBy = "ders")
    private List<DersInstance> acilanInstance;
    //private List<Kaynak> kaynaklar;
    @ManyToOne
    private Ogretmen ogretmen;
}
