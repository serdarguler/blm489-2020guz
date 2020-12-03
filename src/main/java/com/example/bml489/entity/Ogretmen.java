package com.example.bml489.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Ogretmen {
    @Id
    @GeneratedValue
    private int id;

    private String sicilNo;


        //private List<Ders> verdigiDersler;
}
