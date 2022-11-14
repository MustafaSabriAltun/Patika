package hesapMakinesi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ınput = new Scanner(System.in);
		double sonuc=0, sayı1, sayı2;
		String ıslem;
		System.out.println("bir sayı giriniz");
		sayı1=ınput.nextDouble();
		System.out.println("bir işlem giriniz");
		ıslem= ınput.next();
		System.out.println("bir sayı giriniz");
		sayı2=ınput.nextDouble();

		switch (ıslem) {
		case "+":
			sonuc=sayı1 + sayı2;
			break;
		case "-":
			sonuc=sayı1-sayı2;
			break;
		case "/":
			sonuc=sayı1/sayı2;
			break;
		case "*":
			sonuc=sayı1*sayı2;
			break;
		default:
			System.out.println("Lütfen Yapılacak işlemi giriniz.");
			break;
			}
		System.out.println("İşlemin sonucu : " + sonuc);
	}

}
