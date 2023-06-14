import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		num=in.nextInt();
		if (isPalindom(num)) {
			System.out.println(num + " sayısı bir palindomdur.");
		}else
			System.out.println(num + " sayısı bir palindom DEĞİLDİR.");
		
	}

	private static boolean isPalindom(int num) {
		if (num==reverseNum(num))
			return true;
		else
			return false;
	}

	private static int reverseNum(int num) {
		int reversedNum = 0;

        while (num != 0) {
            int k = num % 10;
            reversedNum = reversedNum * 10 + k;
            num = num / 10;
        }

        return reversedNum;
	}
}