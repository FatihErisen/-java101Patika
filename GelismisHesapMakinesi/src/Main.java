import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("\nLütfen bir işlem seçiniz :\n");
            select = in.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modAlma();
                    break;
                case 8:
                    alanVeCevre();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }
    static void plus() {
        Scanner in = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = in.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner in = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = in.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = in.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void times() {
    	Scanner in = new Scanner(System.in);
        int number, result = 1, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = in.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner in = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = in.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = in.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner in = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = in.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = in.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner in = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = in.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }
    static void alanVeCevre() {
        Scanner in = new Scanner(System.in);
        System.out.print("Kısa kenarı giriniz :");
        int kisa = in.nextInt();
        System.out.print("Uzun kenarı giriniz :");
        int uzun = in.nextInt();
        int cevre = 2*(kisa+uzun);
        int alan = kisa*uzun;

        System.out.println("Çevre : " + cevre);
        System.out.println("Alan : " + alan);
    }
    static void modAlma() {
        Scanner in = new Scanner(System.in);
        System.out.print("Modu alınacak sayıyı giriniz :");
        int sayi = in.nextInt();
        System.out.print("Modu giriniz :");
        int mod = in.nextInt();
        System.out.println("Sonuç : " + sayi%mod);
    }

}