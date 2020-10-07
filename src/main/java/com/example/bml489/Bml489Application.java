package com.example.bml489;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


interface HesapIslem {
	public void paraCek(double miktar) throws Exception;
	public void paraYatir(double miktar);
}

@Data
@AllArgsConstructor
@NoArgsConstructor
abstract class Hesap implements HesapIslem{
	private double bakiye;

	@Override
	public void paraYatir(double miktar) {
		System.out.println("Hesap");
		this.bakiye = this.bakiye+miktar;
	}
}

@Data
class TicariHesap extends Hesap{
	private double krediMiktari;

	@Override
	public void paraCek(double miktar) throws Exception {
		if(miktar > this.getBakiye() + this.getKrediMiktari() ){
			throw  new Exception("Bakiye yetersiz");
		}
		this.setBakiye(this.getBakiye() - miktar);
	}

	@Override
	public void paraYatir(double miktar) {
		this.setBakiye(this.getBakiye() + miktar);
	}


}


@Data
class KrediHesap extends Hesap{

	private double krediFaizOrani;

	private double krediMiktari;

	@Override
	public void paraCek(double miktar) throws Exception {

			if(miktar > this.getBakiye()){
				throw  new Exception("Bakiye yetersiz");
			}
			this.setBakiye(this.getBakiye() - miktar);
		}

	@Override
	public void paraYatir(double miktar) {
		this.setBakiye(this.getBakiye() + miktar);
	}
}


@Data
class BireyselHesap extends Hesap{

	@Override
	public void paraCek(double miktar) throws Exception {
		if(miktar > this.getBakiye()){
			throw  new Exception("Bakiye yetersiz");
		}
		this.setBakiye(this.getBakiye() - miktar);
		}

	@Override
	public void paraYatir(double miktar) {
		System.out.println("bireysel");
		this.setBakiye(this.getBakiye() + miktar);
	}
}

@Data
class Banka{

	private List<Hesap> hesaplar;

	public Banka(){
		this.hesaplar = new ArrayList<>();
	}

	public void havale(Hesap h1,Hesap h2,double miktar) throws Exception {
		System.out.println("ilk fonksiyon");
		h1.paraCek(miktar);
		h2.paraYatir(miktar);
	}

	public void havale(TicariHesap h1,Hesap h2,double miktar) throws Exception {
		System.out.println("ikinci fonksiyon");
		h1.paraCek(miktar);
		h2.paraYatir(miktar);
	}

	public void havale(TicariHesap h1,BireyselHesap h2,double miktar) throws Exception {
		System.out.println("ucuncu fonksiyon");
		h1.paraCek(miktar);
		h2.paraYatir(miktar);
	}

}

@SpringBootApplication
public class Bml489Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Bml489Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Hesap h1 = new BireyselHesap();
		h1.setBakiye(100.0);
		h1.paraYatir(100);

		TicariHesap h2 = new TicariHesap();
		h2.setBakiye(1000.0);
		h2.setKrediMiktari(1000.0);

		Banka banka = new Banka();
		banka.getHesaplar().add(h1);
		banka.getHesaplar().add(h2);

		banka.havale(h2,h1,1500);

		System.out.println(h1.getBakiye());
		System.out.println(h2.getBakiye());


	}
}
