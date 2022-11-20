package dongulerPratik;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double k, count = 0, total = 0, sonuc = 0;
		System.out.println("Bir sayı giriniz : ");
		k = input.nextInt();

		for (int i = 0; i <= k; i++) {
			if (i > 0) {
				if (i % 3 == 0 || i % 4 == 0) {
					count++;
					total += i;
					System.out.println(i);
				}
			}
		}
		sonuc = total / count;

		System.out.println("total: "+total);

		System.out.println("count: "+count);

		System.out.println("Sonuç : " + sonuc);

	}

}
