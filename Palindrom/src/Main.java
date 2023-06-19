import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String str, str2;
		Scanner in = new Scanner(System.in);
		System.out.println("Bir kelime giriniz: ");
		str2=in.next();
		str=str2.toLowerCase();
		if (isPalindom(str)) {
			System.out.println(str2 + " kelimesi bir palindomdur.");
		}else
			System.out.println(str2 + " kelimesi bir palindom DEĞİLDİR.");	
	}
	private static boolean isPalindom(String str) {
		if (str.equals(reverseStr(str)))
			return true;
		else
			return false;
	}
	private static String reverseStr(String str) {
		String reversedstr = "";

        for(int i=str.length()-1;i>=0;i--) {
        	reversedstr+= str.charAt(i);
        }
        return reversedstr;
	}
}