package ch12.sec06;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {

        // Boxing
        Integer obj = 100; // auto unboxing
        System.out.println("value = " + obj.intValue());
        // obj.intValue() :  수동 언박싱
        System.out.println("obj = " + obj); // 재정의한 toString 호출
        System.out.println("obj.toString() = " + obj.toString()); // 재정의한 toString 호출

        // Unboxing
        int value = obj; // auto unboxing
        System.out.println("value = " + value);

        // 연산 시 Unboxing
        int result = obj + 100; // auto unboxing
        System.out.println("result = " + result);

    }
}
