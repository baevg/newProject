package lesson09_Arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        printMultiplicationTable(10);
    }

    public static void printMultiplicationTable(int size) {

        int[][] array = new int[size + 1][size + 1];

        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                array[i][j] = i * j;

                System.out.print(array[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
