import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		double boy,kilo;
		double endeks;
		Scanner in=new Scanner(System.in);
		System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz: ");
		boy=in.nextDouble();
		System.out.println("Lütfen kilonuzu giriniz: ");
		kilo=in.nextDouble();
		endeks=kilo/(boy*boy);
		System.out.println("Vücut Kitle İndeksiniz: "
				+ endeks);
	}
}
