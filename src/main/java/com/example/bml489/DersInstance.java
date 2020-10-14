package com.example.bml489;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class DersInstance {
    private Ders ders;
    private String donem;
    private Ogretmen verenOgretmen;
    private List<Ogrenci> alanOgrenciler;
}
