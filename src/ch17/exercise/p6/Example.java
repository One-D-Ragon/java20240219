package ch17.exercise.p6;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("감자바", 26)
        );

        double avg = list.stream()
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();
        System.out.println("평균 나이: " + avg);

        double avg4 = list.stream()
                .mapToInt(member -> member.getAge()) // 람다
                .average()
                .getAsDouble();
        System.out.println("평균 나이2: " + avg);

        double avg2 = list.stream()
                .mapToInt(Member::getAge)
                .average()
                .orElse(0.0);
        System.out.println("avg2 = " + avg2);

        list.stream()
                .mapToInt(Member::getAge)
                .average()
                .ifPresent(a -> System.out.println("avg3 :" + a));
    }
}
