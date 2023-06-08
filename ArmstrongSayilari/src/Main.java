import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int sayi,basamakSayisi,hesapDegeri,basamakToplami;
		Scanner in = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		sayi=in.nextInt();
		basamakSayisi=basamakSayisiBul(sayi);
		hesapDegeri=Hesap(sayi, basamakSayisi);
		basamakToplami=BasamakTopla(sayi);
		
		if(sayi==hesapDegeri)
			System.out.println("\n"+sayi+" sayısının basamaklarının toplamı= " + basamakToplami
					+ "\n\nAyrıca " + sayi + " sayısı bir Armstrong sayısıdır :)");
		else
			System.out.println("\n"+sayi+" sayısının basamaklarının toplamı= " + basamakToplami
					+ "\n\nAyrıca " +sayi+" sayısı bir Armstrong sayısı DEĞİLDİR;)");
		
	}
	private static int BasamakTopla(int sayi) {
		int top=0;
		while(sayi!=0) {
			top+=sayi%10;
			sayi/=10;
		}
		return top;
	}
	private static int Hesap(int sayi,int basamak) {
		int toplam=0;
		while(sayi>0) {
			toplam+=Math.pow((sayi%10), basamak);
			sayi/=10;
		}
		return toplam;
	}
	static int basamakSayisiBul(int a) {
		int basamak=0;
		while(a!=0) {
			basamak++;
			a/=10;
		}
		return basamak;
	}
	
	
}
