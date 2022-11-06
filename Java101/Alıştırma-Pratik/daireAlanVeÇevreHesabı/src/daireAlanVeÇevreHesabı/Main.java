package daireAlanVeÇevreHesabı;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, r, alan, cevre;
		System.out.print("Yarıçap giriniz :");
		r = scan.nextFloat();
		/*
		 * alan= Math.PI*r*r; 
		 * System.out.println("Dairenin alanı : " + alan);
		 * cevre= 2* Math.PI*r;
		 * System.out.println("Dairenin çevresi : " + cevre);
		 */

		System.out.print("Merkez açısını giriniz :");
		a = scan.nextFloat();

		System.out.println((Math.PI * (r * r) * a) / 360);
	}

}
