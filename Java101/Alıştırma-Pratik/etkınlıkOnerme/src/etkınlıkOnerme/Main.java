package etkınlıkOnerme;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int heat=0;
		System.out.println("Sıcaklık giriniz.");
		heat = input.nextInt();
		if (heat < 5) {
			System.out.println("Bu sıcaklıkta kayak yapabilirsin.");
		} else if (heat >= 5 && heat < 15) {
			System.out.println("Bu sıcaklıkta sinemaya gidebilirsin.");
		} else if (heat >= 15 && heat < 25) {
			System.out.println("Bu sıcaklıkta piknik yapmaya gidebilirsin.");
		} else if (heat >= 25) {
			System.out.println("Bu sıcaklıkta yüzmeye gidebilirsin.");
		}

		
	}

}
