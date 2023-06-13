import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int terimSayisi;
		Scanner in = new Scanner(System.in);
		System.out.println("Kaç terim yazalım? ");
		terimSayisi=in.nextInt();

		for(int i=1;i<=terimSayisi;i++) {
			System.out.print(fibo(i)+" ");
		}

	}

	private static int fibo(int i) {
		if (i==1 || i==2)
			return 1;
		else
			return (fibo(i-1)+fibo(i-2));
	}

}
