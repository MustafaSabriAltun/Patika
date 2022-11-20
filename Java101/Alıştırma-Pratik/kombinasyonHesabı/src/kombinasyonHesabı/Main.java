package kombinasyonHesabı;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,r, totalN=1,totalR=1,nR,totalNR=1,kombinasyon=0;
		System.out.println("Bir n giriniz");
		n= input.nextInt();
		System.out.println("Bir r giriniz");
		r= input.nextInt();
		
		for (int i = 1; i <=n; i++) {
			totalN*=i;
		}
		for (int i = 1; i <=r; i++) {
			totalR*=i;
		}
		nR=n-r;
		for (int i = 1; i <=nR; i++) {
			totalNR*=i;
		}
		System.out.println(totalN);
		System.out.println(totalR);
		System.out.println(totalNR);
		System.out.println("*********************************");
		kombinasyon=totalN/(totalR*totalNR);
//Kombinasyon formülü
//C(n,r) = n! / (r! * (n-r)!)
		System.out.println(kombinasyon);
	}

}
