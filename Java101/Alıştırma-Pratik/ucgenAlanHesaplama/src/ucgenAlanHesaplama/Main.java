package ucgenAlanHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b, c, c2, u, cevreUzunlugu, d, f, g, alan;
		/*
		 * System.out.print("A kenar uzunluğunu giriniz"); a=scan.nextDouble();
		 * System.out.print("B kenar uzunluğunu giriniz"); b=scan.nextDouble();
		 * c2=Math.pow(a, 2)+Math.pow(b, 2); c= Math.sqrt(c2);
		 * 
		 * System.out.print("C kenarının uzunluğu :" + c);
		 */
		System.out.println("--------------***********-------------*********----------*********-------");

		System.out.print("İlk kenar uzunluğunu giriniz");
		d = scan.nextDouble();
		System.out.print("İkinci kenar uzunluğunu giriniz");
		f = scan.nextDouble();
		System.out.print("Üçüncü kenar uzunluğunu giriniz");
		g = scan.nextDouble();
		u = (d + f + g) / 2;
		cevreUzunlugu = u * u;
		System.out.println("Çevre uzunluğu :" + cevreUzunlugu);

		alan = u * (u - d) * (u - f) * (u - g);

		System.out.print("Üçgenin alanı :" + alan);

	}

}
