package pkt;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int km;
		double perKm=2.2, total, calculate, startPrice=10;
		Scanner in= new Scanner(System.in);
		
		//Kullanıcıdan gidilen mesafe alınıyor
		System.out.print("Mesafeyi kilometre olarak giriniz. : ");
		km = in.nextInt();
		calculate=km*perKm+startPrice;
		total = (calculate <20) ? 20 : calculate;
		
		System.out.print("Ödenecek Tutar : " + total);

	}

}
