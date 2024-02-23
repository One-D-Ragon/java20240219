package ch02.lecture.p02type;

public class C28Printf {
    public static void main(String[] args) {
        // System.out.printf()

        // 파라미터 1개 (print와 유사)
        System.out.printf("hello world!");

        System.out.println();

        // 파라미터 2개 이상
        // 첫번째 파라미터 문자열에 두번째, 세번째,... 파라미터를 포함해서 출력
        System.out.printf("hello %s", "jane");

        System.out.println();
        // 피라미터 3개
        System.out.printf("hello %s and %s", "son", "park");

        System.out.println();

        String a = "son";
        String b = "park";
        System.out.println(STR."hello \{a} and \{b}"); // java 21부터

        System.out.printf("%s %s - %s", "lee", "kang", "in");
        System.out.println();
        System.out.printf("%1$s %2$s %3$s", "son", "lee", "park");
        System.out.println();
        System.out.printf("%2$s %3$s %1$s", "son", "lee", "park");
        System.out.println();
        System.out.printf("%s %s %s %1$s %3$s %3$s", "son", "lee", "park"); // 다시 쓰고싶은 것을
        System.out.println();

        System.out.printf("%5s", "son"); // 다섯자리를 차지
        System.out.println();
        System.out.printf("-%5s", "son");

        System.out.printf("-%5s", "son");

        // [] 생략가능한 내용
    }
}
