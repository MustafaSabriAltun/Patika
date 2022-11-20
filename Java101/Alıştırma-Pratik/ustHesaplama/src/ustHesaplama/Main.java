package ustHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,k,totalN=1,totalK=1;
		
		System.out.println("hangi sayının");
		n=input.nextInt();
		System.out.println("Kaçıncı kuvveti");
		k=input.nextInt();
		
		for (int i = 1; i <=k; i++) {
			System.out.print(n+"'in "+i +". kuvveti. ");
			
			totalN*=n;
			System.out.println(totalN);
		}
	}

}
