package harmonikSeri;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double n;
		System.out.println("N sayısını gırınız");
		n= input.nextDouble();
		double result=0;
		
		for (double i = 1; i <=n ; i++) {
			result+= (1.0/i);
		}
		System.out.println(result);
	}

}
