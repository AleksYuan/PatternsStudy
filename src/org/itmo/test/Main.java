package org.itmo.test;


import java.net.URL;
import java.time.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        String data = "https://api.openweathermap.org/data/3.0/onecall?lat={lat}&lon={lon}&exclude={part}&appid={API key}";
//        double lat ;
//        double lon ;
//        String exclude;
//        URL url = new URL("")
//        System.out.println();
//        ZoneId zone = ZoneId.of("Africa/Cairo");
//        ZonedDateTime cairoTime = ZonedDateTime.now(zone);
//
//        LocalDate localDate = cairoTime.toLocalDate();
//        LocalTime localTime = cairoTime.toLocalTime();
//        LocalDateTime localDateTime = cairoTime.toLocalDateTime();
//
//        System.out.println(zone);
//        System.out.println(cairoTime);
//        System.out.println(localDate);
//        System.out.println(localTime);
//        System.out.println(localDateTime);

//        String[] array1 = {"мама", "мыла", "раму"};
//        String[] array2 = {"я", "очень", "люблю", "java"};
//        String[] array3 = {"мир", "труд", "май"};
//
//        List<String[]> arrays = new ArrayList<>();
//        arrays.add(array1);
//        arrays.add(array2);
//        arrays.add(array3);
//
//        arrays.sort((o1, o2) -> o1.length - o2.length);
//
//        arrays.sort((o1,o2) -> {
//            int length1 = 0;
//            int length2 = 0;
//            for (String s : o1) {
//                length1 += s.length();
//            }
//            for (String s : o2) {
//                length2 += s.length();
//            }
//            return length1 - length2;
//        });
//
//        for (String[] array : arrays) {
//            for (String s : array) {
//                System.out.print(s + " ");
//            }
//            System.out.println();
//        }

        ArrayList<Integer> al = new ArrayList<>();
        Collections.addAll(al, 1,2,3,4,5,6);
        System.out.println(al.equals(3));
    }
}
