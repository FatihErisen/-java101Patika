public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int rows = matrix.length;
        int columns = matrix[0].length;

        // Transpoze matrisin boyutları sütun ve satır sayıları arasında yer değiştirdiğinde elde edilir
        int[][] transpose = new int[columns][rows];

        // Matrisin transpozunu bulma
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Transpoz matrisi ekrana yazdırma
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
