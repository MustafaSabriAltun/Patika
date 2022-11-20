package ustluSayıProgramı;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k, count1=0,count2=0;
		System.out.println("Bir sayı giriniz.");
		k= input.nextInt();
		
		for (int i = 1; i <=k; i*=4) {
			System.out.println("4'ün "+count1 +".  kuvveti : " + i);
			count1++;
		}
		
		for (int i = 1; i <=k; i*=5) {
			System.out.println("5'ün "+count2 +".  kuvveti : " + i);
			count2++;
		}
	}

}
