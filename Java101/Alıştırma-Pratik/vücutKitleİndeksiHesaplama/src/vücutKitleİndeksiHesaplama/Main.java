package vücutKitleİndeksiHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		float boy,kilo,vucutKitleİndeksi;
		System.out.println("Uygulamamız boy için METRE, kilo için KİLOGRAM ölçeklerini kullanmaktadır.");
		System.out.println("******************************");
		System.out.println("------------------------------");
		
		System.out.println("Boyunuzu giriniz : ");
		boy=inp.nextFloat();
		System.out.println("kilonuzu giriniz : ");
		kilo=inp.nextFloat();
		vucutKitleİndeksi= (float) (kilo/(Math.pow(boy, 2))) ;
		
		
		System.out.println("Vücut kitle İndeksiniz : " + vucutKitleİndeksi);
		
		System.out.println(vucutKitleİndeksi<18.5? "Düşük Kilolu":"******");
		System.out.println((vucutKitleİndeksi>18.5 && vucutKitleİndeksi<24.9) ? "Normal Kilolu":"******");
		System.out.println((vucutKitleİndeksi>24.9 && vucutKitleİndeksi<29.9) ? "Fazla Kilolu":"******");
		System.out.println((vucutKitleİndeksi>30) ? "Obez":"******");
	}
	

}
