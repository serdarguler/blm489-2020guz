package com.example.bml489.entity;

import lombok.Data;

import java.util.List;

@Data
public class Sinav {
    private String sinavAdi;
    private List<String> sorular;
    private Ders ders;
}
