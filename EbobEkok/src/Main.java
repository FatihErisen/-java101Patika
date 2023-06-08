import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        int ebob = ebobBul(sayi1, sayi2);
        int ekok = ekokBul(sayi1, sayi2);

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }

    public static int ebobBul(int sayi1, int sayi2) {
        while (sayi1 != sayi2) {
            if (sayi1 > sayi2)
                sayi1 -= sayi2;
            else
                sayi2 -= sayi1;
        }
        return sayi1;
    }

    public static int ekokBul(int sayi1, int sayi2) {
        int ekok = (sayi1 * sayi2) / ebobBul(sayi1, sayi2);
        return ekok;
    }
}
