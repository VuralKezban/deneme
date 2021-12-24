package ProjeKitap;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		menu();
	}

	private static void menu() {
		Scanner scan = new Scanner(System.in);
		Kitaplar kk = new Kitaplar();
		ArrayList<Kitap> k = null;
		int sayac = 1000;
		boolean cikilsinMi = false;
		while (!cikilsinMi) {

			System.out.println("****Kitap Ekleme Programý****\nLütfen yapmak istediðiniz iþlemi seçiniz.");
			System.out.print(
					"*1.Kitap ekleme*\n*2.Kitap numarasý ile kitap arama* \n*3.Yazar ismi ile kitap arama* \n*4.Numara ile kitap silme *\n*5.Tüm kitaplarý listele* \n*6.Çýkýþ *\nSeçiminiz: ");
			int secim = scan.nextInt();
			switch (secim) {
			case 1:
				k=kk.kitapEkle();
				break;

			case 2:
				kk.kitapNoGoruntule(k);
				break;
			case 3:

				kk.yazarGoruntule(k);
				break;
			case 4:

				kk.kitapSil(k);
				break;
			case 5:
				kk.kitapListele(k);
				break;
			case 6:
				cikilsinMi = true;
				break;
			}
		}

	}
}
