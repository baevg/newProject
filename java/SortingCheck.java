package lesson09_Arrays;

public class SortingCheck {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 8, 9};
//        int[] array = {9, 7, 4, 3, 2, 1};
//        int[] array = {0, 7, 9, 3, 2, 1};

        if (isAscendingOrderSorted(array)) {
            System.out.println("Массив отсортирован по возрастанию");
        } else if (isDescendingOrderSorted(array)){
            System.out.println("Массив отсортирован по убыванию");
        } else {
            System.out.println("Массив не отсортирован");
        }
    }

    public static boolean isAscendingOrderSorted(int[] array) {
        for (int i = 0, j = 1; j < array.length; i++, j++) {
            if (array[i] >= array[j]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isDescendingOrderSorted(int[] array) {
        for (int i = 0, j = 1; j < array.length; i++, j++) {
            if (array[i] <= array[j]) {
                return false;
            }
        }

        return true;
    }
}
