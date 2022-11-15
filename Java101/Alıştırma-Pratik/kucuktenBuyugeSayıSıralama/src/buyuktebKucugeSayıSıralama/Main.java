package buyuktebKucugeSayıSıralama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c;
		System.out.println("Bir sayı giriniz : ");
		a = input.nextInt();
		System.out.println("Bir sayı giriniz : ");
		b = input.nextInt();
		System.out.println("Bir sayı giriniz : ");
		c = input.nextInt();

		if (a<b && a<c) {
			System.out.print(" "+a);
		}else if (b < a && b < c) {
			System.out.print(" "+b);
		} else if (c < b && c < a) {
			System.out.print(" "+c);
		}
		if (a > b && a < c || a > c && a < b) {
			System.out.print(" "+a);
		} else if (b > a && b < c || b > c && b < a) {
			System.out.print(" "+b);
		} else if (c > b && c < a || c > a && c < b) {
			System.out.print(" "+c);
		}
		if (a > b && a > c) {
			System.out.print(" "+a);
		} else if (b > a && b > c) {
			System.out.print(" "+b);
		} else if (c > b && c > a) {
			System.out.print(" "+c);
		}
	
		
	}

}
