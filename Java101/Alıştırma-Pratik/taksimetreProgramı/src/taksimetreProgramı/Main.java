package taksimetreProgramı;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float kmBasıUcret,toplam,gidilenYol,acılısUcreti;
		
		System.out.println("Kaç km gidildi ?");
		gidilenYol= scan.nextFloat();
		acılısUcreti=10f;
		kmBasıUcret=2.20f;
		toplam= gidilenYol*kmBasıUcret+acılısUcreti;
		
		
		
		System.out.println(toplam<20?" 20 TL ödemelisiniz": toplam + " TL ödemelisiniz");
		
		
	}

}
