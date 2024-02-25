package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class JoinByDelimiter {


    public static String joinByDelimiter(char delimiter, String...args) {
       return String.join(String.valueOf(delimiter), args);
    }

    public static void main(String[] args) {
        char delimiter = ',';
        String result = joinByDelimiter(delimiter, "hello", "world");
        System.out.println(result);

    }
}
