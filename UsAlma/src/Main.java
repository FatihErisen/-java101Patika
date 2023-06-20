import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Taban değerini giriniz: ");
		int taban=in.nextInt();
		System.out.println("Üs değerini giriniz: ");
		int us=in.nextInt();
        int sonuc=usAl(taban,us);
		System.out.println(taban + " üzeri " + us + " eşittir: " + sonuc);
	}

	private static int usAl(int taban, int us) {
		if (us==0) {
			return 1;
		}else if(us>0) {
			return taban*usAl(taban,us-1);
		}else {
			return 1/(taban*usAl(taban,us+1));
		}
	}
}