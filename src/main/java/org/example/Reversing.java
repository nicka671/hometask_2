package org.example;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Reversing {
    

    public static String reverseWords(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .reduce("", (s,c) -> c+s, (s1,s2) -> s2+s1);

    }

    public static void main(String[] args) {
        String str = "abc";
        String result = reverseWords(str);

        System.out.println(result);

    }
}
