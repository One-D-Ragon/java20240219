package ch12.lecture.p5annotation;

public class C06Annotation {
    @MyAnnotation6(value = "hello", data = {4, 5})
    String name;

    @MyAnnotation6(value = "hi", data = 6)
    int age;

    @MyAnnotation6(data = 7)
    String address;
}

// MyAnnotation6 작성
@interface MyAnnotation6 {
    String value() default "model"; // 디폴트 값을 주면 사용할 때, 생략 가능

    int[] data();
}
