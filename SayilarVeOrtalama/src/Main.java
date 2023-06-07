import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int sayi,i=1,elSay=0,toplam=0;
		double ort;
		ArrayList<Integer>sayilar = new ArrayList<Integer>();
		Scanner in = new Scanner (System.in);
		System.out.println("Bir sayı giriniz: ");
		sayi=in.nextInt();
		while(i<sayi) {
			if(i%3==0 && i%4==0) {
				toplam+=i;
				elSay++;
				sayilar.add(i);
			}
			i++;
		}
		ort=(double)toplam/(double)elSay;
		System.out.println("\n0 ile "+sayi+" arasındaki sayılar: ");
		for(int n:sayilar) {
			System.out.print(n + ", ");
		}
		System.out.println("\n\nBu sayıların ortalaması: " + ort);
}
}