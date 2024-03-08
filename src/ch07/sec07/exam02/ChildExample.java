package ch07.sec07.exam02;

import ch06.sec13.exam01.package2.C;

public class ChildExample {
    public static void main(String[] args) {
        // 자식 객체 생성
        Child child = new Child();
        child.method1();
        child.method2();
        child.method3();

        // 자동 타입 변환
        Parent parent = child;
        System.out.println(System.identityHashCode(child));
        System.out.println(System.identityHashCode(parent));

        // 메소드 호출
        parent.method1();
        parent.method2();
//        parent.method3(); (호출 불가능)
    }
}
