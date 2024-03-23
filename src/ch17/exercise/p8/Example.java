package ch17.exercise.p8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        Map<String, List<Member>> groupingMap = list.stream()
                .collect(Collectors.groupingBy(e -> e.getJob()));

        Map<String, List<Member>> collect = list.stream()
                .collect(Collectors.groupingBy(Member::getJob));

    /*
            List<Member> developers2 = list.stream()
                .filter(m -> m.getJob().equals("개발자"))
                .collect(Collectors.toList());
        developers2.stream()
                .forEach(d -> System.out.println(d.getName()));

                Map<String, List<String>> collect = list.stream()
                .collect(Collectors.groupingBy(e -> e.substring(0, 1)));

     */

        System.out.println("[개발자]");
        //나
        List<Member> devList = groupingMap.get("개발자");
//        devList.stream().forEach(e -> System.out.println(e.toString()));
        devList.stream().forEach(e -> System.out.println(e.toString()));

        // 강사님
        collect.get("개발자")
                .stream()
                .forEach(System.out::println);


        System.out.println();

        System.out.println("[디자이너]");
        // 나
        List<Member> desList = groupingMap.get("디자이너");
        desList.stream().forEach(e -> System.out.println(e.toString()));

        // 강사님
        collect.get("디자이너")
                .stream()
                .forEach(System.out::println);
    }
}
