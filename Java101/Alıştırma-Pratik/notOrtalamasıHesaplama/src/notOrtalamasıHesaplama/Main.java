package notOrtalamasıHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int matematik, fizik, kimya, turkce, tarih, muzik;
		int dersSayısı;
		System.out.println("Matematik notnu giriniz :");
		matematik = scanner.nextInt();
		System.out.println("Fizik notnu giriniz :");
		fizik = scanner.nextInt();
		System.out.println("Kimya notnu giriniz :");
		kimya = scanner.nextInt();
		System.out.println("Türkçe notnu giriniz :");
		turkce = scanner.nextInt();
		System.out.println("Tarih notnu giriniz :");
		tarih = scanner.nextInt();
		System.out.println("Müzik notnu giriniz :");
		muzik = scanner.nextInt();

		System.out.println("Kaç dersin notunu girdiniz ?");
		dersSayısı = scanner.nextInt();

		int toplam = matematik + fizik + kimya + turkce + tarih + muzik;
		double ortalama = toplam / dersSayısı;

		String sonuc = ortalama > 50 ? ortalama + " Tebrikler Geçtiniz" : ortalama + " Seneye görüşürüz aslanım.";

		System.out.println(sonuc);

	}

}
