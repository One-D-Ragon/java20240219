package ch04.lecture.p3while;

public class C04DoWhile {
    public static void main(String[] args) {

        System.out.println("statement 1");

        boolean b = false;

        // do-while : 첫 실행은 항상 진행됨
        do {
            System.out.println("statement 2");
        } while (b);

        System.out.println("statement 3");
    }
}
