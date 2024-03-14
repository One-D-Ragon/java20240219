package ch16.lecture.p1lambda;

public class C08Lambda {
    public static void main(String[] args) {
        C08MyInterface obj = () -> {
            System.out.println("C08Lambda.method");
            System.out.println("C08Lambda.method");
        };
        C08MyInterface obj2 = () -> System.out.println("hello");
    }
}

// 1. 매개변수가 2개 이상 있고 리턴이 없는 추상 메소드
// 2. 매개변수가 1개 있고 리턴이 없는 추상 메소드
// 3. 매개변수가 없고 리턴이 없는 추상 메소드
@FunctionalInterface
interface C08MyInterface {
    void method();
}

// 4. 리턴 있는 추상 메소드
