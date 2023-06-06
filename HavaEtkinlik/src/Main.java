import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sicaklik; 
        Scanner in = new Scanner(System.in);
        System.out.println("Sıcaklık Değerini Giriniz:");
        sicaklik=in.nextInt();
        if (sicaklik < 5) {
            System.out.println("Kayak yapmayı öneririm.");
        } else if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.println("Sinemaya gitmeyi öneririm.");
        } else if (sicaklik > 15 && sicaklik <= 25) {
            System.out.println("Piknik yapmayı öneririm.");
        } else {
            System.out.println("Yüzmeye gitmeyi öneririm.");
        }
    }
}
