import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        desen(sayi,sayi,sayi);
    }
	private static void desen(int s, int ilkSayi, int birOncekiSayi) {
		System.out.print(s + " ");
		if(s>0 && s<=birOncekiSayi) {
			desen(s-5,ilkSayi,s);
		}else {
			if(ilkSayi==s) {
				System.out.print(" ");
			}else {
				desen(s+5,ilkSayi,s);
			}
		}
		
	}
}
