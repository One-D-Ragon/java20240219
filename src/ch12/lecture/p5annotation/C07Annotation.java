package ch12.lecture.p5annotation;

public class C07Annotation {
    @MyAnnotation7
    private String fiedl1;
    @MyAnnotation7(value = "hello", model = 9, roll = {"admin"})
    private String fiedl2;
    //  @MyAnnotation7(value = "hi")
    @MyAnnotation7("hi") // value만 사용시 생략 가능
    private String fiedl3;
}

@interface MyAnnotation7 {
    String value() default "";

    int model() default 0;

    String[] roll() default {}; // 사용할 떄 값을 안줘도 사용 가능
}
