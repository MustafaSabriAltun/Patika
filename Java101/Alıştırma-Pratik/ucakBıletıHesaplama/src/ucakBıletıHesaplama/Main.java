package ucakBıletıHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double price;
		int age = 0, km = 0;
		String way = "  ";
		boolean isError = false;

		System.out.println("Kaç KM yolculuk yapacaksınız ? ");
		km = input.nextInt();
		System.out.println("Kaç yaşındasınız ? ");
		age = input.nextInt();
		System.out.println("Gidiş dönüş bilet mi alacaksınız ? (evet/hayır)");
		way = input.next();
		if (km >= 1 && age >= 1 && way.equalsIgnoreCase("evet") || way.equalsIgnoreCase("hayır")) {
			price = km * 0.1;
			System.out.println("Biletinizin asıl ücreti " + price + " TL dir.");
			if (age < 12) {
				price = (price / 100) * 50;
				System.out.println("Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır."
						+ " Biletinizin  ücreti " + price + " TL dir.");
			} else if (age >= 12 && age <= 24) {
				price = (price / 100) * 90;
				System.out.println("Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır."
						+ " Biletinizin  ücreti " + price + " TL dir.");
			} else if (age > 65) {
				price = (price / 100) * 70;
				System.out.println(
						"Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.Biletinizin  ücreti "
								+ price + " TL dir.");
			}
			if (way.equalsIgnoreCase("evet")) {
				price = (price / 100) * 80;
				System.out.println(
						"Kişi \"Yolculuk Tipini\" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.Biletinizin  ücreti "
								+ price + " TL dir.");
			}

		} else {
			isError = true;
		}
		if (isError) {
			System.out.println("Hatalı Veri Girdiniz ! ");
		}

	}

}
