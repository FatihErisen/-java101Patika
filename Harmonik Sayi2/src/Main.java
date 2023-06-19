public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double harmonik=0, harOrt;
        for (int i : numbers) {
            harmonik += (1/(double)i);
        }

        System.out.println(numbers.length/harmonik);
    }
}