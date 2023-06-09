import java.util.Scanner;

public class Ucak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafe (KM): ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınız: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk Tipini Seçin (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        // Hatalı veri kontrolü
        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            scanner.close();
            return;
        }

        double birimFiyat = 0.10;
        double toplamFiyat = birimFiyat * mesafe;

        // İndirimlerin uygulanması
        if (yas < 12) {
            toplamFiyat *= 0.5; // %50 indirim
        } else if (yas >= 12 && yas <= 24) {
            toplamFiyat *= 0.9; // %10 indirim
        } else if (yas >= 65) {
            toplamFiyat *= 0.7; // %30 indirim
        }

        if (yolculukTipi == 2) {
        	toplamFiyat *=2; //Gidiş-Dönüş
            toplamFiyat *= 0.8; // %20 indirim
        }

        System.out.println("Toplam Tutar: " + toplamFiyat + " TL");

        scanner.close();
    }
}
