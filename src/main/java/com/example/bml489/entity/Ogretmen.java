package com.example.bml489.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@DiscriminatorValue(value="ogretmen")
public class Ogretmen extends User{

    private String sicilNo;


        //private List<Ders> verdigiDersler;
}
