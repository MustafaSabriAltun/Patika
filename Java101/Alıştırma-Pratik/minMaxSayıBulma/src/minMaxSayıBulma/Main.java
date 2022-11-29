package minMaxSayıBulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n,max=0,min=0,number=0;
		System.out.println("Kaç tane sayı gireceksiniz");
		n= input.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println(i+ ". Sayı giriniz");
			number=input.nextInt();
			
			if (i==1) {
				max= number;
				min= number;
			}
		if (number>max) {
			max=number;
		}else if (number<min) {
			min=number;
		}

		}
		System.out.println("Min : "+ min +  "\nMax : "+ max);
		

	}

}
