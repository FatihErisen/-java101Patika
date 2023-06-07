import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sayi=0,toplam=0;
		Scanner in = new Scanner(System.in);
		while(sayi%2!=1) {
			System.out.println("Bir sayı giriniz: ");
			sayi=in.nextInt();
			if(sayi%4==0)
				toplam+=sayi;
	}
		System.out.println("Girdiğiniz sayılardan 4'ün katı olanların toplamı= " +toplam);
}
}