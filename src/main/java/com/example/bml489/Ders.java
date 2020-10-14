package com.example.bml489;

import lombok.Data;

import java.util.List;

@Data
public class Ders {
    private String dersAdi;
    private List<Kaynak> kaynaklar;
    private Ogretmen ogretmen;
}
