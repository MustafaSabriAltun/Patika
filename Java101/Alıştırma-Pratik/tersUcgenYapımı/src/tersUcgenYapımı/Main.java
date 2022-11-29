package tersUcgenYapımı;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("bir sayı giriniz");
		n= input.nextInt();
		
		
		for (int i = n; i>=0; i--) {//***
			for (int j = 0; j<(n-i) ; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k<=(2*i-1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
