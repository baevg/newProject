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

            String cleanNumber = input.replaceAll("[)+(\\-\\s]", "");
            int length = cleanNumber.length();
            char firstSymbol = cleanNumber.charAt(0);
            String result = "";

            if (length == 11 && firstSymbol == '8') {
                result = cleanNumber.replaceFirst("8", "7");
                System.out.println(result);
            } else if (length == 11 && firstSymbol == '7') {
                result = cleanNumber;
                System.out.println(result);
            } else if (length == 10) {
                result = "7" + cleanNumber;
                System.out.println(result);
            } else {
                System.out.println("Неверный формат номера");
            }

            Pattern pattern = Pattern.compile("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})");
            Matcher matcher = pattern.matcher(result);
            String str = matcher.replaceAll("+$1($2)$3-$4-$5");
            System.out.println(str);
        }
    }
}
