import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sayi; 
		double harmonikSeri;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		sayi=in.nextInt();
		
		harmonikSeri=HarmonkiSeriBul(sayi);
		
		System.out.println(sayi + " sayısının harmonik serisinin değeri: " + harmonikSeri);

	}

	private static double HarmonkiSeriBul(int sayi) {
		double toplam=0;
		for(double i = 1; i<=sayi;i++) {
			toplam+=(1/i);
		}
		return toplam;
	}

}
