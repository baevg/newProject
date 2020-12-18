public class ReverseArray {
    public static String[] reverse (String[] strings){
        int lastElement = strings.length - 1;
        for (int i = 0; i < strings.length / 2; i++) {
            String color = strings[i];
            strings[i] = strings[lastElement - i];
            strings[lastElement - i] = color;
        }
        return strings;
    }
}
