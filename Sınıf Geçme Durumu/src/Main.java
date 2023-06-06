import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String[] dersIsimleri= {"Matematik", "Fizik", "Türkçe", "Kimya", "Müzik"};
		List<Integer>notlar=new ArrayList<Integer>();
		int dersSay=0, toplam=0;
		double ort;
		Scanner in = new Scanner(System.in);
		for (String ders: dersIsimleri) {
			System.out.println(ders +" notunu giriniz: ");
			notlar.add(in.nextInt()); 
		}
		for (int not : notlar) {
			if (not<=100 && not>=0){
				toplam+=not;
				dersSay++;
			}
		}
		ort=(double)toplam/(double)dersSay;
		System.out.println((ort>=50)? "Tebrikler :)\n" + ort + " ortalamaya GEÇTİNİZ." :  "Üzgünüm :(\n" + ort + " ortalamaya KALDINIZ!" );

	}

}
