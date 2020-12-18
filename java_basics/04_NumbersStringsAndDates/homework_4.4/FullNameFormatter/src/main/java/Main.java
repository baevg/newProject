import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            int space1 = input.indexOf(" ");
            int space2 = input.indexOf(" ", space1 + 1);

            if (space1 == -1 || space2 == -1) {
                System.out.println("Введенная строка не является ФИО");
                break;
            } else {
                char[] inputArray = input.toCharArray();
                int whiteSpaces = 0;
                boolean isNotValid = false;

                for (int i = 0; i < inputArray.length; i++) {
                    if (Character.isWhitespace(inputArray[i])) {
                        whiteSpaces++;
                    }
                    if (whiteSpaces > 2 || !(inputArray[i] >= 1040 && inputArray[i] <= 1103) && !(inputArray[i] == 45 || inputArray[i] == 1105 || inputArray[i] == 1025 || inputArray[i] == 32)) {
                        isNotValid = true;
                        break;
                    }
                }

                if (isNotValid) {
                    System.out.println("Введенная строка не является ФИО");
                    break;
                }
            }
            System.out.println("Фамилия: " + input.substring(0, space1)
                    + "\nИмя:" + input.substring(space1, space2)
                    + "\nОтчество:" + input.substring(space2));
        }
    }
}