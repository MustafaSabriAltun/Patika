package tekSayıToplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k,total=0;
		
		do {
			System.out.println("Bir sayı giriniz");
			k= input.nextInt();
			if (k%4==0) {
				total+=k;
//cif ve 4 e tam bölünenlerin toplanmasını isteniyordu. zaten 4 e bölünenlerin hepsi 
// çif olduğu için sadece 4 e tam bolunenlerı topladım.
			}
		} while (k%2==0);
System.err.println("Toplam : " + total);
	}

}
