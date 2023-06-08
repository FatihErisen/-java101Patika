import java.util.Scanner;
public class Main {
	private static int bakiye=2000;
	public static void main(String[] args) {
		int kalanDeneme=3,secim = 1, tutar=0;
		String kullaniciAdi,sifre;
		Scanner in = new Scanner(System.in);
		System.out.println("\t*********************************\n"
				+  "\t*   Patika Bank'a Hoşgeldiniz   *\n"
				+  "\t*********************************\n");
		while(kalanDeneme>0) {
			System.out.println("Kalan deneme hakkınız: " + kalanDeneme
					+  "\nLütfen kullanıcı adınızı giriniz:");
			kullaniciAdi=in.next();
			System.out.println("Lütfen şifrenizi giriniz:");
			sifre=in.next();
			if(kullaniciAdi.equals("patika")&&sifre.equals("dev123")){
				System.out.println("\nBilgiler doğru...");
				islemler(secim, tutar);
				break;
				}
			else {
				if(kalanDeneme!=1) {
					System.out.println("Girdiğiniz bilgiler yanlış! Tekrar deneyiniz.");
					kalanDeneme--;
				}
				else {
					System.out.println("Hesabınız bloke olmuştur. Müşteri temsilcinize danışınız!");
					kalanDeneme=0;
				}
			}
			
		}
		
		

	}

	private static void islemler( int secim, int tutar) {
		Scanner in = new Scanner(System.in);
		while(secim!=0) {
			System.out.println("\nLütfen yapmak istediğiniz işlemi seçiniz!\n"
					+ "1- Bakiye Görüntüle\n"
					+ "2- Para Çek\n"
					+ "3- Para Yatır\n"
					+ "4- Çıkış\n");
			secim=in.nextInt();
			switch(secim) {
			case 1:
				System.out.println("Bakiyeniz: " + bakiye);
				break;
			case 2:
				System.out.println("Çekmek istediğiniz tutarı giriniz:  ");
				tutar=in.nextInt();
				paraCek(tutar);
				break;
			case 3:
				System.out.println("Yatırmak istediğiniz tutarı giriniz:  ");
				tutar=in.nextInt();
				paraYatir(tutar);
				break;
			case 4:
				System.out.println("Patika Bank ATM'sini kullandığınız için teşekkürler."
						+ "\nTekrar görüşmek dileğiyle"
						+ "\nHoşçakalın...");
				secim=0;
				break;
			default: System.out.println("Hatalı seçim yaptınız! Tekrar deneyiniz. \n");
			}
		};
		
	}

	private static void paraYatir(int tutar) {
		if(tutar<0)
			System.out.println("Negatif tutar yatıramazsınız."
					+ "\nTekrar deneyiniz.");
		else if (tutar>10000)
			System.out.println("10.000'den fazla tutar yatıramazsınız."
					+ "\nTekrar deneyiniz.");
		else {
			bakiye+=tutar;
			System.out.println("\n" +tutar+ " tutarında yatırma işlemi gerçekleşmiştir"
					+ "\nİşlem sonrası yeni bakiyeniz: " + bakiye);
		}
		
	}

	private static void paraCek(int tutar) {
		if(tutar<0)
			System.out.println("Negatif tutar çekemezsiniz."
					+ "\nTekrar deneyiniz.");
		else if (tutar>bakiye)
			System.out.println("Bakiyeniz " + bakiye +" olup, bundan fazla tutar çekemezsiniz."
					+ "\nTekrar deneyiniz.");
		else {
			bakiye-=tutar;
			System.out.println("\n" +tutar+ " tutarında para çekme işlemi gerçekleşmiştir"
					+ "\nİşlem sonrası yeni bakiyeniz: " + bakiye);
		}
		
	}


}
