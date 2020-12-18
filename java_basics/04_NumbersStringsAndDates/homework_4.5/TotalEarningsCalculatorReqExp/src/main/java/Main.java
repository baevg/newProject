public class Main {

    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println(calculateSalarySum(text));
    }

    public static int calculateSalarySum(String text) {
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                        String newText = text.replaceAll("[^,\\d]", "");
                String income = newText.replace(",", "+") + "+";

                char[] d = income.toCharArray();
                int sum = 0;
                int delimiterSymbol = 0;

                for (int i = 0; i < d.length; i++) {
                    if (d[i] == '+') {
                        sum += Integer.parseInt(income.substring(delimiterSymbol, i));
                        delimiterSymbol = i;
                    }
                }
                return sum;
            }
        }
        return 0;
    }
}