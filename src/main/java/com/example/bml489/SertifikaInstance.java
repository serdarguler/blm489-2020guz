package com.example.bml489;

import lombok.Data;

import java.util.Date;

@Data
public class SertifikaInstance {
    private Sertifika sertifika;
    private SinavNot sinavNot;
    private Date gecerlilikTarihi;
    private Date aciklanmaTarihi;
}
