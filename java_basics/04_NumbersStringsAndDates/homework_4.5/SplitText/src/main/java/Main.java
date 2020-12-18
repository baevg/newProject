public class Main {

    public static void main(String[] args) {
        String text = "The class String includes methods for examining individual characters of the sequence, for comparing strings, for searching strings.for extracting substrings, and for creating a copy of a string with all characters translated to uppercase or to lowercase. Case mapping is based on the Unicode Standard version specified by the Character class. The Java language provides special support for the string concatenation operator ( + ), and for conversion of other objects to strings. For additional information on string concatenation and conversion, see The Java™ Language Specification. Unless otherwise noted, passing a null argument to a constructor or method in this class will cause a NullPointerException to be thrown. A String represents a string in the UTF-16 format in which supplementary characters are represented by surrogate pairs (see the section Unicode Character Representations in the Character class for more information).";
        System.out.println(splitTextInToWords(text));
    }

    public static String splitTextInToWords(String text) {
        if (text.isEmpty()) {
            return "";
        }

        String newText = text.replaceAll("[)+(,.;\\-\\d]", " ");

        String[] arr = newText.split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (String s : arr) {
            sb.append(s).append("\r\n");
        }
        int end = sb.lastIndexOf("\r\n");
        sb.delete(end, sb.length());

        return sb.toString();
    }
}