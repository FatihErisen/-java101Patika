import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armutFiyati = 2.14;
        double elmaFiyati = 3.67;
        double domatesFiyati = 1.11;
        double muzFiyati = 0.95;
        double patlicanFiyati = 5.00;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut kaç kilogram? : ");
        double armutKilo = scanner.nextDouble();

        System.out.print("Elma kaç kilogram? : ");
        double elmaKilo = scanner.nextDouble();

        System.out.print("Domates kaç kilogram? : ");
        double domatesKilo = scanner.nextDouble();

        System.out.print("Muz kaç kilogram? : ");
        double muzKilo = scanner.nextDouble();

        System.out.print("Patlıcan kaç kilogram? : ");
        double patlicanKilo = scanner.nextDouble();

        scanner.close();

        double toplamTutar = (armutFiyati * armutKilo) + (elmaFiyati * elmaKilo) +
                (domatesFiyati * domatesKilo) + (muzFiyati * muzKilo) + (patlicanFiyati * patlicanKilo);

        System.out.println("Toplam Tutar: " + toplamTutar + " TL");
    }
}
