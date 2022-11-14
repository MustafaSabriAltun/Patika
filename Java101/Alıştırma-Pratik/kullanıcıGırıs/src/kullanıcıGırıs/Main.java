package kullanıcıGırıs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String userName, password,changePass,newPassword;
		
		System.out.println("Kullanıcı Adını Giriniz : ");
		userName= input.nextLine();
		System.out.println("Şifrenizi Giriniz : ");
		password= input.nextLine();
//spagetti oldu fakat böyle yapılması gerekirdi.(bu seviyede)		
		if (userName.equals("Mustafa")) {
			if (password.equals("java101")) {
				System.out.println("Hoşgeldiniz..");
			}else {
				System.out.println("Hatalı şifre girdiniz, Şifrenizi sıfırlamak istermisiniz ? (evet / hayır)");
				changePass = input.nextLine();
				 if (changePass.equalsIgnoreCase("evet")) {
					System.out.println("Yeni şifrenizi giriniz : ");
					newPassword = input.nextLine();
					if (newPassword.equals("java101")) {
						System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
					}else {
						System.out.println("Şifre oluşturuldu.");
					}
				} else {
					System.out.println("Peki hayatta başarılar...");
				}
			}
		}
		
		
		
	}

}
