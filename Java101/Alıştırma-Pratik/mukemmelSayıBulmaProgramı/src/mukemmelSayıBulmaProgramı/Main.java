package mukemmelSayıBulmaProgramı;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 6 --> 1,2,3
		// 28 --> 1,2,4,7,14
		int number = 0;
		int total = 0;
		System.out.println("Bir sayı giriniz.");
		number = input.nextInt();
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;
			}
		}

		if (total == number) {
			System.out.println("Mükemmel sayı değildir");
		} else {
			System.out.println("Mükemmel sayı değildir");
		}

	}

}
