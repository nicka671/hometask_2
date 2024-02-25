package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CheckingDigits {


    static boolean containsOnlyDigits(String str) {
        return str.chars()
                .allMatch(Character::isDigit);

    }

    public static void main(String[] args) {
        String str = "553344";
        Boolean result = containsOnlyDigits(str);

        System.out.println(result);

    }
}
