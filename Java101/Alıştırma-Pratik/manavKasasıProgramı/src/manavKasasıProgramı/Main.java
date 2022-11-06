package manavKasasıProgramı;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		float armut = 2.14f, elma = 3.67f, domates = 1.11f, muz = 0.95f, patlıcan = 5.00f, toplam = 0;

		System.out.print("ARMUT Kaç kilo ?  :");
		toplam += inp.nextFloat() * armut;
		System.out.print("ELMA Kaç kilo ?  :");
		toplam += inp.nextFloat() * elma;
		System.out.print("DOMATES Kaç kilo ?  :");
		toplam += inp.nextFloat() * domates;
		System.out.print("MUZ Kaç kilo ?  :");
		toplam += inp.nextFloat() * muz;
		System.out.print("Patlıcan Kaç kilo ?  :");
		toplam += inp.nextFloat() * patlıcan;

		System.out.print("Toplam tutar : " + toplam + " TL");

	}

}
