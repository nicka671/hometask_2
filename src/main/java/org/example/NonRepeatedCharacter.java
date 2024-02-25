//package org.example;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//// Я не знаю(((
//public class NonRepeatedCharacter {
//
//
//    public static String firstNonRepeatedCharacter(String str) {
//        return str.chars()
//                .mapToObj(c -> (char) c)
//                .collect(LinkedHashMap::new, (map, c) -> map.merge(c, 1, Integer::sum), LinkedHashMap::putAll)
//                .entrySet()
//                .stream()
//                .filter(entry -> (int) entry.getValue() == 1)
//                .map(Map.Entry::getKey)
//                .map(Object::toString)
//                .findFirst();
//    }
//
//
//
//    public static void main(String[] args) {
//        String str = "aabnnd";
//        String result = firstNonRepeatedCharacter(str);
//
//        System.out.println(result);
//
//    }
//}
