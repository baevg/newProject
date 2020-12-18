import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество ящиков:");
        String boxes = scanner.nextLine();

        int container = 0;
        int truck = 0;

        for (int i = 0; i < Integer.parseInt(boxes); i++) {
            if (i % (12 * 27) == 0) {
                truck++;
                System.out.println("Грузовик: " + truck);
            }
            if (i % 27 == 0) {
                container++;
                System.out.println("\tКонтейнер: " + container);
            }
            System.out.println("\t\tЯщик: " + (i + 1));
        }
        
        System.out.println("Необходимо:\n\tгрузовиков - " + truck + " шт." + "\n\tконтейнеров - " + container + " шт.");
    }

}
