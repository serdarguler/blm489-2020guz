package com.example.bml489;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class Bml489Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Bml489Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Ders d = new Ders();
		d.setDersAdi("Object Oriented");
		Ogrenci o = new Ogrenci();
		o.setAdSoyad("Hatice Yıldız");
		Ogretmen ogrt = new Ogretmen();
		ogrt.setAdSoyad("serdar güler");
		List<Ogrenci> alanOgrenciler = new ArrayList<>();
		alanOgrenciler.add(o);
		DersInstance di = DersInstance.builder().ders(d).donem("2020-2021 Güz").verenOgretmen(ogrt).alanOgrenciler(alanOgrenciler).build();
	}
}
