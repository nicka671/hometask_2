package org.example;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class RemoveCharacter {


    public static String removeDuplicates(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toCollection(LinkedHashSet::new))
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String str = "aabbs";
        String result = removeDuplicates(str);
        System.out.println(result);

    }
}
