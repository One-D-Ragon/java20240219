package ch17.exercise.p7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

//        List<Member> developers2 = list.stream()
//                .filter(m -> m.getJob().equals("개발자"))
//                .collect(() -> new ArrayList<>()
//                        , (c, e) -> c.add(e)
//                        , (a, b) -> {
//                        });

        List<Member> developers2 = list.stream()
                .filter(m -> m.getJob().equals("개발자"))
                .collect(Collectors.toList());

        developers2.stream()
                .forEach(d -> System.out.println(d.getName()));

        // --------------------
        List<Member> developers = list.stream()
                .filter(s -> s.getJob().equals("개발자"))
                .toList();

        developers.stream()
                .forEach(s -> System.out.println(s.getName()));
    }
}
