package com.example.bml489;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Data
@Entity
public class Ogretmen extends User{
        @Id
        @GeneratedValue
        private Integer id;

        //private List<Ders> verdigiDersler;
}
