import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int satirSayisi,sonBasamakYildiz;
		Scanner in = new Scanner(System.in);
		System.out.println("Kaç basamaklı ters üçgen yapalım? ");
		satirSayisi=in.nextInt();
		sonBasamakYildiz=2*satirSayisi-1;


		for(int i=satirSayisi;i>=1;i--) {
			for(int j=0;j<satirSayisi-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
