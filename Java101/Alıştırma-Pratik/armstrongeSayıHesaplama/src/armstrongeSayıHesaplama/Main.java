package armstrongeSayıHesaplama;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sayı, tempSayı, basamakCount = 1, toplam = 1, sonuc = 0, kalan = 0;
		System.out.println("bir sayı giriniz.");
		sayı = input.nextInt();
		tempSayı = sayı;

		while (tempSayı / 10 != 0) {
			tempSayı /= 10;
			basamakCount++;
			//System.out.println(basamakCount);
		}

		tempSayı = sayı;

		while (tempSayı != 0) {
			kalan = tempSayı % 10;
	toplam = 1;// bunu yapmazsak 0 olan bi basamak olduğunda carpma ıslemınde yutan eleman
						// oluyor.
			for (int i = 1; i <= basamakCount; i++) {
				toplam *= kalan;

			}
			sonuc += toplam;
			tempSayı /= 10;
		}
		
		if (sayı==sonuc) {
			System.out.println(sayı +" sayısı Armstronge sayısıdır.");
		}else {
			System.err.println(sayı +" sayısı Armstronge sayısı DEĞİLDİR:.");
		}
		
	}

}
