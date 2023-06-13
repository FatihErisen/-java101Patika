import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sayi, adet, mak, min;
		Scanner in = new Scanner(System.in);
		System.out.println("Kaç tane sayı gireceksiniz? (En az 2 girmelisiniz)");
		adet=in.nextInt();
		System.out.println("1. Sayıyı giriniz: ");
		sayi=in.nextInt();
		mak=sayi;
		min=sayi;
		for(int i=2; i<=adet;i++) {
			System.out.println(i+ ". Sayıyı giriniz: ");
			sayi=in.nextInt();
			if(sayi>mak)
				mak=sayi;
			if(sayi<min)
				min=sayi;
		}
		System.out.println("En büyük sayı:" + mak 
				+ "\nEn küçük sayı:" + min);

	}

}
