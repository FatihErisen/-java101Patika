import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int n, r, sonuc=1;
		Scanner in = new Scanner(System.in);
		System.out.println("Üssü alınacak sayıyı giriniz: ");
		n=in.nextInt();
		System.out.println("Üssü giriniz: ");
		r=in.nextInt();
		for(int i=1;i<=r;i++) {
			sonuc*=n;
		}
		System.out.println(n+"'in " + r+". kuvveti: " + sonuc);
			
	}

}
