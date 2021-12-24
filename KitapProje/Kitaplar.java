package ProjeKitap;

import java.util.ArrayList;
import java.util.Scanner;

public class Kitaplar {
	ArrayList<Kitap> kitaplar = new ArrayList<>();
	Scanner scan = new Scanner(System.in);

	public ArrayList<Kitap> kitapEkle() {

		int sayac = 1000;
		int sec;
		do {
			System.out.println("***Kitap Ekleme*** ");
			System.out.print("*Kitab�n ad�n� yaz�n�z: ");
			String kitapAd� = scan.next();
			System.out.print("*Yazar�n ad�n� yaz�n�z: ");
			String yazarAd� = scan.next();
			System.out.print("*Kitab�n fiyat�n� giriniz: ");
			double fiyat = scan.nextDouble();
			System.out.print("Kitap eklemek i�in 1, �nceki men�ye d�nmek i�in 2 girin");
			sec = scan.nextInt();
			kitaplar.add(new Kitap(sayac, kitapAd�, yazarAd�, fiyat));
			sayac++;
		} while (sec != 2);

		return kitaplar;
	}

	public void kitapNoGoruntule(ArrayList<Kitap> kitaplar) {
		System.out.print("G�r�nt�lemek istedi�iniz kitap numaras�n� girin: \n");
		int num = scan.nextInt();
		for (Kitap k : kitaplar) {
			if (k.count == num) {
				System.out.println();
				System.out.println(k.count + " nolu kitap: " + k.kitapAd�);
			}
		}

	}

	public void yazarGoruntule(ArrayList<Kitap> kitaplar) {
		System.out.print("G�r�nt�lemek istedi�iniz kitaplar�n yazar ad�n� girin: \n");
		String yzr = scan.next();
		for (Kitap k : kitaplar) {
			if (yzr.equalsIgnoreCase(k.yazarAd�)) {
				System.out.println();
				System.out.println(k.yazarAd� + "'n�n kitaplar�: " + k.kitapAd�);
				System.out.println();
			}
		}
	}

	public void kitapSil(ArrayList<Kitap> kitaplar) {

		System.out.print("Silmek istedi�in kitap numaras�n� gir: ");
		int silNo = scan.nextInt();
		for (Kitap k : kitaplar) {
			if (silNo == k.count) {
				kitaplar.remove(k);

			}
		}
	}

	public void kitapListele(ArrayList<Kitap> kitaplar) {
		for (Kitap k : kitaplar) {
			System.out.println("\n***Kitap Listesi***");
			System.out.println("Numara: " + k.count + " Kitap Ad�: " + k.kitapAd� + " Yazar Ad� : " + k.yazarAd�
					+ " Fiyat :" + k.fiyat);
		}
	}

}
