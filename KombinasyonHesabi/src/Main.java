import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int n, r, pay=1, payda=1;
		Scanner in = new Scanner(System.in);
		System.out.println("Kombinasyon için n değerini giriniz ( C(n,r) ): ");
		n=in.nextInt();
		System.out.println("Kombinasyon için r değerini giriniz ( 0<=r<n olmalı!!! ): ");
		r=in.nextInt();
		for(int i=n,j=1;j<=r;j++,i--) {
			pay*=i;
			payda*=j;
		}
		System.out.println("C("+n+","+r+")= "+ pay/payda);
			
	}

}
