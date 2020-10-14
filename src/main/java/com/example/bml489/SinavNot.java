package com.example.bml489;

import lombok.Data;

import java.util.Date;

@Data
public class SinavNot {
    private Sinav sinav;
    private Ogrenci sinaviOlan;
    private int not;
    private Ders ders;
    private Date sinavTarihi;
}
