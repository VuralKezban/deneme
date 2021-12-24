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
			System.out.print("*Kitabýn adýný yazýnýz: ");
			String kitapAdý = scan.next();
			System.out.print("*Yazarýn adýný yazýnýz: ");
			String yazarAdý = scan.next();
			System.out.print("*Kitabýn fiyatýný giriniz: ");
			double fiyat = scan.nextDouble();
			System.out.print("Kitap eklemek için 1, önceki menüye dönmek için 2 girin");
			sec = scan.nextInt();
			kitaplar.add(new Kitap(sayac, kitapAdý, yazarAdý, fiyat));
			sayac++;
		} while (sec != 2);

		return kitaplar;
	}

	public void kitapNoGoruntule(ArrayList<Kitap> kitaplar) {
		System.out.print("Görüntülemek istediðiniz kitap numarasýný girin: \n");
		int num = scan.nextInt();
		for (Kitap k : kitaplar) {
			if (k.count == num) {
				System.out.println();
				System.out.println(k.count + " nolu kitap: " + k.kitapAdý);
			}
		}

	}

	public void yazarGoruntule(ArrayList<Kitap> kitaplar) {
		System.out.print("Görüntülemek istediðiniz kitaplarýn yazar adýný girin: \n");
		String yzr = scan.next();
		for (Kitap k : kitaplar) {
			if (yzr.equalsIgnoreCase(k.yazarAdý)) {
				System.out.println();
				System.out.println(k.yazarAdý + "'nýn kitaplarý: " + k.kitapAdý);
				System.out.println();
			}
		}
	}

	public void kitapSil(ArrayList<Kitap> kitaplar) {

		System.out.print("Silmek istediðin kitap numarasýný gir: ");
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
			System.out.println("Numara: " + k.count + " Kitap Adý: " + k.kitapAdý + " Yazar Adý : " + k.yazarAdý
					+ " Fiyat :" + k.fiyat);
		}
	}

}
