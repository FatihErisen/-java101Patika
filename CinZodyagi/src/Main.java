import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Girin: ");
        int dogumYili = scanner.nextInt();

        String[] zodyak = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz",
                           "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};
        int indeks = dogumYili % 12;
        String burc = zodyak[indeks];

        System.out.println("Çin Zodyağı Burcunuz: " + burc);


    }
}
