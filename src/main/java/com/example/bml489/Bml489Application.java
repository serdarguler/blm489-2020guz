package com.example.bml489;

import com.example.bml489.persistence.DersInstancePersistence;
import com.example.bml489.persistence.DersPersistence;
import com.example.bml489.persistence.OgrenciPersistence;
import com.example.bml489.persistence.OgretmenPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class Bml489Application implements CommandLineRunner {

	@Autowired
	private DersPersistence dersPersistence;

	@Autowired
	private DersInstancePersistence dersInstancePersistence;

	@Autowired
	private OgrenciPersistence ogrenciPersistence;

	@Autowired
	private OgretmenPersistence ogretmenPersistence;

	public static void main(String[] args) {
		SpringApplication.run(Bml489Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Ders d = new Ders();
		d.setDersAdi("Object Oriented");
		dersPersistence.save(d);

		Ogretmen ogrt = new Ogretmen();
		ogrt.setAdSoyad("serdar güler");
		ogretmenPersistence.save(ogrt);

		DersInstance di = new DersInstance();
		di.setDers(d);
		di.setVerenOgretmen(ogrt);

		Ogrenci o = new Ogrenci();
		o.setAdSoyad("Hatice Yıldız");

		ogrenciPersistence.save(o);
		List<Ogrenci> alanOgrenciler = new ArrayList<>();
		alanOgrenciler.add(o);

		di.setAlanOgrenciler(alanOgrenciler);
		dersInstancePersistence.save(di);


	}
}
