package com.example.bml489;

import com.example.bml489.entity.Ogrenci;
import com.example.bml489.entity.User;
import com.example.bml489.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class Bml489Application implements CommandLineRunner {

	@Autowired
	private DersPersistence dersPersistence;

	@Autowired
	private DersInstancePersistence dersInstancePersistence;

	@Autowired
	private UserPersistence userPersistence;

	@Autowired
	private OgretmenPersistence ogretmenPersistence;

	public static void main(String[] args) {
		SpringApplication.run(Bml489Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

		User find = userPersistence.findByUsername("hatice.yildiz");
		try {
			if (find == null) {
				User o = new User();
				o.setAdSoyad("Hatice Yıldız");
				o.setUsername("hatice.yildiz");
				o.setPassword(bCryptPasswordEncoder.encode("hatice123"));
				userPersistence.save(o);
			}
		}catch (Exception e){

		}


		/*Ders d = new Ders();
		d.setDersAdi("Object Oriented");
		dersPersistence.save(d);

		Ogretmen ogrt = new Ogretmen();
		ogrt.setAdSoyad("serdar güler");
		ogrt.setSicilNo("2247");
		ogretmenPersistence.save(ogrt);

		Ogretmen update_ogrt = ogretmenPersistence.findById(63).get();
		update_ogrt.setSicilNo("123");
		ogretmenPersistence.save(update_ogrt);






		DersInstance di = new DersInstance();
		di.setDers(d);
		di.setVerenOgretmen(ogrt);

		Ogrenci o = new Ogrenci();
		o.setAdSoyad("Hatice Yıldız");
		o.setTckimlikNo("123123");

		ogrenciPersistence.save(o);
		List<Ogrenci> alanOgrenciler = new ArrayList<>();
		alanOgrenciler.add(o);

		di.setAlanOgrenciler(alanOgrenciler);
		dersInstancePersistence.save(di);

		List<Ogretmen> result = ogretmenPersistence.sicileGoreBul("2247");
		for(
				Ogretmen r : result
		){
			System.out.println(r);
		}

		 */

	}
}
