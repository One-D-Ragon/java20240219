package ch08.lecture.p1interface;

public class C06StaticMethod {
    public static void main(String[] args) {
        C06MyInterface.method1();
    }
}

interface C06MyInterface {
    // field (public static final)
    // abstract method (public abstract) 중요
    // default method (public instance)

    // static method (public static)
    static void method1() { // 인스턴스 생성없이 메소드를 실행할 수 있다
        System.out.println("C06MyInterface.method1");
    }
}
