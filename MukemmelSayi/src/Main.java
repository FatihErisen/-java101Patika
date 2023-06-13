import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sayi,bolenTop=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		sayi=in.nextInt();
		for(int i=1; i<sayi;i++) {
			if(sayi%i==0)
				bolenTop+=i;
		}
		if(bolenTop==sayi)
			System.out.println(sayi+ " Mükemmel sayıdır");
		else
			System.out.println(sayi+ " Mükemmel sayı değildir.");

	}

}
