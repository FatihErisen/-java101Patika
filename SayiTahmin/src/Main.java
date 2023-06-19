import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int luckyNum, selectedNum, right=5 ;
		boolean isWin=false;
		Random rnd = new Random();
		luckyNum=rnd.nextInt(100);
		System.out.println(luckyNum);
		Scanner in = new Scanner(System.in);
		while(right>0) {
			if(right>1) {
				right--;
				System.out.println("Lütfen tahmininizi giriniz (0 - 100): ");
				selectedNum=in.nextInt();
				if(selectedNum==luckyNum) {
					isWin=true;
					break;
				}else if(selectedNum>luckyNum) {
					System.out.println("\nŞanslı sayı tahmininizden küçük!"
							+"\n"+right+" hakkınız kaldı. \nTekrar deneyiniz.\n");
				}else {
					System.out.println("\nŞanslı sayı tahmininizden büyük!"
							+"\n"+right+" hakkınız kaldı. \nTekrar deneyiniz.\n");
				}
			}else {
				System.out.println("Lütfen tahmininizi giriniz (0 - 100): ");
				selectedNum=in.nextInt();
				if(selectedNum==luckyNum) {
					isWin=true;
					break;
				}else {
					break;
				}
			}			
			
			
		}
		if(isWin) {
			System.out.println("Tebrikler! \nDoğru tahminde bulunduzun ve oyunu kazandınız.");
		}else {
			System.out.println("Üzgünüm, kaybettiniz.");
		}

	}

}
