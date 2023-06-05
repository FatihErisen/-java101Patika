package pkt;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int s1,s2,secim;
		Scanner in = new Scanner(System.in);
		System.out.println("Birinci Sayıyı Giriniz:");
		s1= in.nextInt();
		System.out.println("İkinci Sayıyı Giriniz:");
		s2 = in.nextInt();
		System.out.println("İşlemi Seçiniz: \n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
		secim= in.nextInt();
		switch (secim) { 
		case 1: 
			System.out.println("Girdiğiniz sayıların toplamı : " + (s1+s2));
			break;
		case 2: 
			System.out.println("Girdiğiniz sayıların farkı : " + (s1-s2));
			break;
		case 3: 
			System.out.println("Girdiğiniz sayıların çarpımı : " + (s1*s2));
			break;
		case 4: 
			System.out.println(s2 != 0 ? "Birinci sayının ikinci sayıya bölümü: " + ((double)s1/(double)s2) : "Sıfıra bölüm tanımsızdır.");
			break;
		default: System.out.println("Hatalı Seçim Yaptınız!") ;
		};
		
	}

}
