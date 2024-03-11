package ch07.lecture.p3casting;

public class C05InstanceOf {
    public static void main(String[] args) {
        A a = new B();

        System.out.println(a instanceof A); // true
        System.out.println(a instanceof B); // true
        System.out.println(a instanceof C); // false
        System.out.println(a instanceof D); // false
        System.out.println(a instanceof E); // true
        System.out.println(a instanceof F); // false
    }
}

// @formatter:off
class A {}
class B extends A {}
class D extends B {}
class E extends B {}
// @formatter:on
class C extends A {
}

class F extends C {
}