import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int sayi;
		ArrayList<Integer> sayilar = new ArrayList<Integer>();
		Scanner in = new Scanner (System.in);
		System.out.println("Kaç adet sayıyı sıralamak istiyorsunuz?");
		sayi=in.nextInt();
		for(int i=1;i<=sayi;i++) {
			System.out.println(i +". Sayıyı Giriniz");
			sayilar.add(in.nextInt());
		};
		Collections.sort(sayilar);
		for(int i=0;i<sayilar.size()-1;i++) {
			System.out.print(sayilar.get(i) + " < ");
		}
		System.out.print(sayilar.get(sayilar.size()-1));
}
}