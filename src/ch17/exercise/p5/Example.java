package ch17.exercise.p5;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports lambda expression"
        );
        list.stream()
                .filter(e -> e.toLowerCase().contains("java"))
                .filter(e -> e.toUpperCase().contains("JAVA"))
                .filter(s -> s.matches(".*[jJ][aA][vV][aA].*"))
//                .filter(s -> s.contains(".*[jJ][aA][vV][aA].*"))
                .forEach(System.out::println);
    }
}
