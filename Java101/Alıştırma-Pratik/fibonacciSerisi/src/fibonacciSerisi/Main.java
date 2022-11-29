package fibonacciSerisi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = 0, total = 0, min = 0, max = 1;
		System.out.println("Kaç elemandan olusan fibonacci istersiniz ?");
		n = inp.nextInt();
		System.out.println(0);
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(max = min + max);

			} else {

				System.out.println(min = min + max);
			}

		}

	}

}
