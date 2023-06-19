import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		//değişkenler ve liste tanımlanıyor
		int num, closeBigNum, closeSmallNum ;
		int[] list = {15,12,788,1,-1,-778,2,0};
		Arrays.sort(list); //dizi elemanları küçükten büyüğe sıralanıyor
		//Scanner sınıfı oluşturuluyor
		Scanner in = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		num=in.nextInt();
		//en yakın sayılar dizinin ilk elemanı olarak atanıyor
		closeBigNum=list[0];
		closeSmallNum=list[0];
		// tanımlanan yakın büyük sayıdan daha yakın olan varsa yakın büyük sayı değişiyor
		for (int i : list) {
			if(Math.abs(num-i)<Math.abs(closeBigNum-i)) {
				closeBigNum=i;
			}
		}
		// yakın büyük sayının index değeri bulunuyor
		int index = Arrays.binarySearch(list, closeBigNum);
		/*for döngüsünde kaydedilen yakın büyük sayı girilen sayıdan küçük ise
		 * döngü bize yakın küçük sayıyı vermiştir. 
		 * o yüzden kaydedilen sayı yakın küçük sayı olarak değiştiriliyor. */

		if(num==closeBigNum) {
			closeBigNum=list[index+1];
			closeSmallNum=list[index-1];
		}else if(num>closeBigNum){
		closeSmallNum=closeBigNum;
		closeBigNum=list[index+1];
			}else {
			closeSmallNum=list[index-1];
		}
		//sonuçlar ekrana yazdırılıyor.
		System.out.println("Girilen sayıdan küçük en yakın sayı : " + closeSmallNum);
		System.out.println("Girilen sayıdan büyük en yakın sayı : " + closeBigNum);
		
	}

}
