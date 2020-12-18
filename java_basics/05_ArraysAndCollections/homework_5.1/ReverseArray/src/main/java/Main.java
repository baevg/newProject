public class Main {
    public static void main(String[] args) {
        String line = "Каждый охотник желает знать, где сидит фазан";
        String[] array = line.split(" |, ");

        ReverseArray.reverse(array);

        for (String e : array) {
            System.out.println(e);
        }
    }
}
