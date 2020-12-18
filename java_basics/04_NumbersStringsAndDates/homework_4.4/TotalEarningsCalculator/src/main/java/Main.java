public class Main {

    public static void main(String[] args) {

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        int beginIncomeVasya = text.indexOf("заработал") + 10;
        int endIncomeVasya = text.indexOf(" ", beginIncomeVasya);
        int incomeVasya = Integer.parseInt(text.substring(beginIncomeVasya, endIncomeVasya));

        int beginIncomePetr = text.indexOf("-") + 2;
        int endIncomePetr = text.indexOf(" ", beginIncomePetr);
        int incomePetr = Integer.parseInt(text.substring(beginIncomePetr, endIncomePetr));

        int beginIncomeMaria = text.lastIndexOf("-") + 2;
        int endIncomeMaria = text.indexOf(" ", beginIncomeMaria);
        int incomeMaria = Integer.parseInt(text.substring(beginIncomeMaria, endIncomeMaria));

        System.out.println(incomeVasya + incomePetr + incomeMaria);
    }
}