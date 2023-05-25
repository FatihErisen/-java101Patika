package pkt;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		double pi=3.14, r, angle, alan;
		Scanner in=new Scanner(System.in);
		System.out.println("Daire diliminin yarıçap uzunluğunu giriniz: ");
		r=in.nextDouble();
		System.out.println("Daire diliminin merkez açısını giriniz (en az 0, en çok 360): ");
		angle=in.nextDouble();
		alan=pi*r*r*angle/360;
		System.out.println("Daire diliminin alanı: " + alan);
	}

}
