package ebobEkok;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int sayı1, sayı2,bSayı=0,ebob=0,ekok,i=1;
		System.out.println("Sayı1 giriniz");
		sayı1=input.nextInt();
		
		System.out.println("Sayı2 giriniz");
		sayı2=input.nextInt();
		if (sayı1<sayı2) {
			bSayı=sayı2;
			sayı2=sayı1;
		}else {
			bSayı+=sayı1;
		}
		while (i<=sayı2) {
			if (sayı2% i== 0 && bSayı%i==0 ) {
				//System.out.println(i);
				ebob=i;
			}
			i++;
		}
		System.out.println("EBOB : "+ebob );
		
		
		ekok = (bSayı*sayı2)/ebob;
		System.out.println("EKOK : "+ekok);
		
	}

}
