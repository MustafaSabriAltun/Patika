package burcBulmaProgramı;

import java.time.Month;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

//		String month, horoscope = " ";
//		int day, monthInt = 0;
//		System.out.println("Doğduğunuz ayı giriniz :");
//		month = input.next();
//		System.out.println("Ayın kaçında doğdunuz ?");
//		day = input.nextInt();
//		boolean isError = false; // bunu hocanın vıdeosunu ızledıgımde ogrendım sonrasında kullanacagım.

//		switch (month) {
//		case "ocak":
//			
//			if (day <= 21) {
//				System.out.println("Burcunuz OĞLAK");
//			} else {
//				System.out.println("Burcunuz KOVA");
//			}
//			break;
//		case "şubat":
//			if (day < 19) {
//				System.out.println("Burcunuz KOVA");
//			} else {
//				System.out.println("Burcunuz BALIK");
//			}
//			break;
//		case "mart":
//			if (day < 21) {
//				System.out.println("Burcunuz BALIK");
//			} else {
//				System.out.println("Burcunuz KOÇ");
//			}
//			break;
//		case "nisan":
//			if (day < 21) {
//				System.out.println("Burcunuz KOÇ");
//			} else {
//				System.out.println("Burcunuz BOĞA");
//			}
//			break;
//		case "mayıs":
//			if (day < 21) {
//				System.out.println("Burcunuz BOĞA");
//			} else {
//				System.out.println("Burcunuz İKİZLER");
//			}
//			break;
//		case "haziran":
//			if (day < 21) {
//				System.out.println("Burcunuz İKİZLER");
//			} else {
//				System.out.println("Burcunuz YENGEÇ");
//			}
//			break;
//		case "temmuz":
//			if (day < 21) {
//				System.out.println("Burcunuz YENGEÇ");
//			} else {
//				System.out.println("Burcunuz ASLAN");
//			}
//			break;
//		case "ağustos":
//			if (day < 21) {
//				System.out.println("Burcunuz ASLAN");
//			} else {
//				System.out.println("Burcunuz BAŞAK");
//			}
//			break;
//		case "eylül":
//			if (day < 21) {
//				System.out.println("Burcunuz Başak");
//			} else {
//				System.out.println("Burcunuz TERAZİ");
//			}
//			break;
//		case "ekim":
//			if (day < 21) {
//				System.out.println("Burcunuz TERAZİ");
//			} else {
//				System.out.println("Burcunuz AKREP");
//			}
//			break;
//		case "kasım":
//			if (day < 21) {
//				System.out.println("Burcunuz AKREP");
//			} else {
//				System.out.println("Burcunuz YAY");
//			}
//			break;
//		case "aralık":
//			if (day < 21) {
//				System.out.println("Burcunuz YAY");
//			} else {
//				System.out.println("Burcunuz OĞLAK");
//			}
//			break;
//
//		default:
//			break;
//		}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
		String month, horoscope = " ";
		int day, monthInt = 0;
		System.out.println("Kaçıncı ayda doğdunuz ?");
		monthInt = input.nextInt();
		System.out.println("Ayın kaçında doğdunuz ?");
		day = input.nextInt();
		boolean isError = false; // bunu hocanın vıdeosunu ızledıgımde ogrendım sonrasında kullanacagım.
		if (monthInt <= 12 && monthInt >= 1) {
			if (monthInt == 1) {
				if (day >= 1 && day < 31) {
					if (day <= 21) {
						horoscope = "OĞLAK";
					} else {
						horoscope = "KOVA";
					}
				} else {
					isError = true;
				}
			}

			if (monthInt == 2) {
				if (day >= 1 && day < 28) {
					if (day <= 19) {
						horoscope = "KOVA";
					} else {
						horoscope = "BALIK";
					}
				} else {
					isError = true;
				}
			}

			if (monthInt == 3) {
				if (day >= 1 && day < 31) {
					if (day <= 20) {
						horoscope = "BALIK";
					} else {
						horoscope = "KOÇ";
					}
				} else {
					isError = true;
				}
			}

			if (monthInt == 4) {
				if (day >= 1 && day < 30) {
					if (day <= 20) {
						horoscope = "KOÇ";
					} else {
						horoscope = "BOĞA";
					}
				} else {
					isError = true;
				}
			}

			if (monthInt == 5) {
				if (day >= 1 && day < 31) {
					if (day <= 21) {
						horoscope = "BOĞA";
					} else {
						horoscope = "İKİZLER";
					}
				} else {
					isError = true;
				}
			}

			if (monthInt == 6) {
				if (day >= 1 && day < 30) {
					if (day <= 22) {
						horoscope = "İKİZLER";
					} else {
						horoscope = "YENGEÇ";
					}
				} else {
					isError = true;
				}
			}

			if (monthInt == 7) {
				if (day >= 1 && day < 31) {
					if (day <= 22) {
						horoscope = "YENGEÇ";
					} else {
						horoscope = "ASLAN";
					}
				} else {
					isError = true;
				}
			}

			if (monthInt == 8) {
				if (day >= 1 && day < 30) {
					if (day <= 22) {
						horoscope = "ASLAN";
					} else {
						horoscope = "BAŞAK";
					}
				} else {
					isError = true;
				}
			}

			if (monthInt == 9) {
				if (day >= 1 && day < 31) {
					if (day <= 22) {
						horoscope = "BAŞAK";
					} else {
						horoscope = "TERAZİ";
					}
				} else {
					isError = true;
				}
			}

			if (monthInt == 10) {
				if (day >= 1 && day < 30) {
					if (day <= 22) {
						horoscope = "TERAZİ";
					} else {
						horoscope = "AKREP";
					}
				} else {
					isError = true;
				}
			}

			if (monthInt == 11) {
				if (day >= 1 && day < 31) {
					if (day <= 21) {
						horoscope = "AKREP";
					} else {
						horoscope = "YAY";
					}
				} else {
					isError = true;
				}
			}

			if (monthInt == 12) {
				if (day >= 1 && day < 30) {
					if (day <= 21) {
						horoscope = "YAY";
					} else {
						horoscope = "OĞLAK";
					}
				} else {
					isError = true;
				}
			}

		} else {
			isError = true;
		}

		if (isError) {
			System.out.println("Hatalı bir tarih girdiniz lütfen tekrar deneyin");
		} else {
			System.out.println("Burcunuz : " + horoscope);
		}

	}

}
