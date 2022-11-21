package atmProjesi;

import java.util.Scanner;

public class Main {
// sadece switch kullanarak  yapılmaya çalışılmıştır.
// just was used switch block.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String password;
		int right = 3, select, balance = 1500, price, ok;

		while (right > 0) {
			System.out.println("Şifrenizi giriniz :");
			password = input.nextLine();
			switch (password) {
			case "dev123":
				System.out.println("Tebrikler giriş yaptınız");
				System.out.println("****-----*****----*****-----*****----****");
				do {
					System.out.println("1-Para yatırma\n" + "2-Para Çekme\n"
							+ "3-Bakiye Sorgula\n" + "4-Çıkış Yap\n");
					select = input.nextInt();
					switch (select) {
					case 1:
						System.out.println("Yatırılacak miktrı giriniz :");
						price = input.nextInt();
						balance += price;

						break;
					case 2:
						System.out.println("Çekilecek miktrı giriniz :");
						price = input.nextInt();
						ok = price > balance ? 1 : 2;
						switch (ok) {
						case 1:
							System.out.println("Yetersiz bakiye. İşleminiz gerçekleşmedi");
							break;

						case 2:
							System.out.println("işleminiz gerçekleşiyor.");
							balance -= price;
							break;

						default:
							break;
						}
						;

						break;
					case 3:
						System.out.println("kalan bakiyeniz :" + balance);

						break;
					case 4:
						System.out.println("Çıkış yapılıyor. Görüşmek üzere.");
						break;

					default:
						System.out.println();
						break;
					}
				} while (select != 4);
				break;

			default:
				--right;
				System.out
						.println("Eksik veya hatalı tuşlama yaptınız.\n" + " Blokeden önceki deneme hakkınız " + right);
				break;
			}
			break;
		}

	}

}
