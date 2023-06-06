package pkt;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String userName,password;
		Scanner in = new Scanner(System.in);
		System.out.println("Kullanıcı Adınızı Giriniz:");
		userName= in.next();
		System.out.println("Şifrenizi Giriniz:");
		password = in.next();
		if (userName.equals("patika") && password.equals("java123"))
			System.out.println("Giriş başarılı. Sayfaya yönlendiriliyorsunuz...");
		else {
			String answer,newPassword;
			System.out.println("Kullanıcı adı veya şifre hatalı.\nŞifrenizi sıfırlamak ister misiniz?(Y/N)");
			answer=in.next();
			if (answer.equals("Y")||answer.equals("y")) {
				System.out.println("Yeni Şifrenizi Giriniz:");
				newPassword=in.next();
				if (newPassword.equals("java123")||newPassword.equals(password))
					System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
				else
					System.out.println("Yeni şifre oluşturma başarılı.");
			}
			else
				System.out.println("Şifre değiştirmek istemediniz. Tekrar giriş yapmayı deneyiniz!");
				
		}
		
	}

}
