package org.example;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class RemoveDuplicates {


    public static String removeCharacter(String str, char ch) {
        return str.chars()
                .filter(c -> c != ch)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public static void main(String[] args) {
        String str = "absdd";
        char ch = 'd';
        String result = removeCharacter(str, ch);
        System.out.println(result);

    }
}
