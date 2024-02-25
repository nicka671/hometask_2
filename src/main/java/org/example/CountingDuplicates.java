package org.example;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CountingDuplicates {


    public static Map<Character, Long> countDuplicateCharacters(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static void main(String[] args) {
        String str = "aabnn";
        Map<Character, Long> result = countDuplicateCharacters(str);

        System.out.println(result);

    }
}
