import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(20, 22, 20, 16, 2, 5, 8, 3, 6, 2, 9, 8, 6, 1, 4, 5, 7, 4, 3, 2, 6));
        List<Integer> duplicateEvenNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number % 2 == 0) {
                for (int j = i + 1; j < numbers.size(); j++) {
                    if (number == numbers.get(j) && !duplicateEvenNumbers.contains(number)) {
                        duplicateEvenNumbers.add(number);
                        break;
                    }
                }
            }
        }

        System.out.println("Tekrar eden çift sayılar:");
        for (int number : duplicateEvenNumbers) {
            System.out.println(number);
        }
    }
}

