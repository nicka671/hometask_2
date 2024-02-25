package org.example;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CountVowelsAndConsonants {


    public static Map<String, Integer> countVowelsAndConsonants(String str) {
        String lowercaseStr = str.toLowerCase();
        return lowercaseStr.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> "aeiou".contains(String.valueOf(c)) ? "vowels" : "consonants", Collectors.summingInt(c -> 1)));
    }

    public static void main(String[] args) {
        String str = "aabbdce";
        Map<String, Integer> result = countVowelsAndConsonants(str);
        System.out.println(result);

    }
}
