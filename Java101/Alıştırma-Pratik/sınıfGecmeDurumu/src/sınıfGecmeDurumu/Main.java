package sınıfGecmeDurumu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Double mat, fızık, turkce, kımya, muzık, ort;
		System.out.println("Matematik Notunuzu Giriniz : ");
		mat = input.nextDouble();
		if (mat < 0 || mat > 100) {
			mat = 0.0;
		}
		System.out.println("Fizik Notunuzu Giriniz : ");
		fızık = input.nextDouble();
		if (fızık < 0 || fızık > 100) {
			fızık = 0.0;
		}
		System.out.println("Türkçe Notunuzu Giriniz : ");
		turkce = input.nextDouble();
		if (turkce < 0 || turkce > 100) {
			turkce = 0.0;
		}
		System.out.println("Kimya Notunuzu Giriniz : ");
		kımya = input.nextDouble();
		if (kımya < 0 || kımya > 100) {
			kımya = 0.0;
		}
		System.out.println("Müzik Notunuzu Giriniz : ");
		muzık = input.nextDouble();
		if (muzık < 0 || muzık > 100) {
			muzık = 0.0;
		}
		ort = (mat + fızık + turkce + kımya + muzık) / 5;
		if (ort > 55) {
			System.out.println("Tebrikler sınıfı geçtiniz, ortalamanız: " + ort);
		} else {
			System.out.println("Maalesef ortalamanız sebebiyle kaldınız, ortalamanız: " + ort);
		}

	}

}
