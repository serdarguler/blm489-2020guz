package com.example.bml489;

import lombok.Data;

import java.util.List;

@Data
public class Ogretmen extends User{
        private List<Ders> verdigiDersler;
}
