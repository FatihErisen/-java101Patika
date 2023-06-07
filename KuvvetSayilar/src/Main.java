import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int sayi, i=1, j=1;
		ArrayList<Integer> dortler = new ArrayList<Integer>();
		ArrayList<Integer> besler = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		sayi=in.nextInt();
		while(i<sayi) {
			dortler.add(i);
			i*=4;
		}
		while(j<sayi) {
			besler.add(j);
			j*=5;
		}
		System.out.println(sayi + " sayısından küçük olan 4'ün kuvvetleri: ");
		for(int el : dortler)
			System.out.print(el + ", ");
		
		System.out.println("\n\n" +sayi + " sayısından küçük olan 5'in kuvvetleri: \n");
		for(int el : besler)
			System.out.print(el + ", ");
	}

}
