import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }

            String input2 = input.trim();

            int space = input2.length() - input2.replace(" ", "").length();

            Pattern pattern = Pattern.compile("([А-Яа-я]+-?[А-Яа-я]+?)(\\s[А-Яа-я]+\\s[А-Яа-я]+)");
            Matcher matcher = pattern.matcher(input2);

            if (matcher.matches() && space == 2) {
                String[] str = input2.split(" ");
                System.out.print("Фамилия: " + str[0] + "\nИмя: " + str[1] + "\nОтчество: " + str[2]);
            } else {
                System.out.println("Введенная строка не является ФИО");
            }
        }
    }
}