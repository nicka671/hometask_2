package org.example;

import java.util.Map;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CountOccurrencesOfACertainCharacter {


    public static int countOccurrencesOfACertainCharacter(String str, char ch) {
        return (int) str.chars()
                .filter(c -> c == ch)
                .count();
    }

    public static void main(String[] args) {
        String str = "addav";
        char ch = 'a';
        int result = countOccurrencesOfACertainCharacter(str, ch);
        System.out.println(result);

    }
}
