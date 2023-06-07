import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğduğunuz günü girin (1-31 arası): ");
        int gun = scanner.nextInt();
        
        System.out.print("Doğduğunuz ayı girin (1-12 arası): ");
        int ay = scanner.nextInt();
        
        String burc = hesaplaBurc(ay, gun);
        
        if (burc != null) {
            System.out.println("Burcunuz: " + burc);
        } else {
            System.out.println("Geçersiz tarih değeri girdiniz!");
        }
    }
    
    public static String hesaplaBurc(int ay, int gun) {
        if (ay == 1) {
            if (gun >= 22) {
                return "Kova";
            } else if (gun >= 1 && gun <= 21) {
                return "Oğlak";
            }
        } else if (ay == 2) {
            if (gun >= 20 && gun<29) {
                return "Balık";
            } else if (gun >= 1 && gun <= 19) {
                return "Kova";
            }
        } else if (ay == 3) {
            if (gun >= 21) {
                return "Koç";
            } else if (gun >= 1 && gun <= 20) {
                return "Balık";
            }
        } else if (ay == 4) {
            if (gun >= 21) {
                return "Boğa";
            } else if (gun >= 1 && gun <= 20) {
                return "Koç";
            }
        } else if (ay == 5) {
            if (gun >= 22) {
                return "İkizler";
            } else if (gun >= 1 && gun <= 21) {
                return "Boğa";
            }
        } else if (ay == 6) {
            if (gun >= 23) {
                return "Yengeç";
            } else if (gun >= 1 && gun <= 22) {
                return "İkizler";
            }
        } else if (ay == 7) {
            if (gun >= 23) {
                return "Aslan";
            } else if (gun >= 1 && gun <= 22) {
                return "Yengeç";
            }
        } else if (ay == 8) {
            if (gun >= 23) {
                return "Başak";
            } else if (gun >= 1 && gun <= 22) {
                return "Aslan";
            }
        } else if (ay == 9) {
            if (gun >= 23) {
                return "Terazi";
            } else if (gun >= 1 && gun <= 22) {
                return "Başak";
            }
        } else if (ay == 10) {
            if (gun >= 23) {
                return "Akrep";
            } else if (gun >= 1 && gun <= 22) {
                return "Terazi";
            }
        } else if (ay == 11) {
            if (gun >= 23) {
                return "Yay";
            } else if (gun >= 1 && gun <= 21) {
                return "Akrep";
            }
        } else if (ay == 12) {
            if (gun >= 22) {
                return "Oğlak";
            } else if (gun >= 1 && gun <= 21) {
                return "Yay";
            }
        }
        
        return null;
    }
}
