package kdvHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
// www.patika.dev
		System.out.print("Kdv hesaplamak istediğiniz tutar:");
		int tutar = scan.nextInt();
		float kdvTutarı = tutar < 1000 ? (tutar / 100) * 18 : (tutar / 100) * 8;
		float kdvDahilTutar = tutar + kdvTutarı;
		System.out.println("Kdv miktarı :" + kdvTutarı);
		System.out.println("Kdv dahil tutar : " + kdvDahilTutar);
		/*
		 * Ödev Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000
		 * TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı
		 * yazınız.
		 */
	}

}
