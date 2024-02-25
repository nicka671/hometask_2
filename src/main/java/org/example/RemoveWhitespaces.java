package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class RemoveWhitespaces {


    public static String removeWhitespaces(String str) {
        return str.chars()
                .filter(c -> !Character.isWhitespace(c))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public static void main(String[] args) {
        String str = "fkkdja dsda dasd";
        String result = removeWhitespaces(str);
        System.out.println(result);

    }
}
