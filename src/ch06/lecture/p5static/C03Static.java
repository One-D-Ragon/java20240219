package ch06.lecture.p5static;

import java.util.Arrays;


// static import : 클래스명 생략하고 클래스 멤버 사용 가능하게 함
//import static java.util.Arrays.fill;
//import static java.util.Arrays.copyOf;

import static java.util.Arrays.*; // 한번에

public class C03Static {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3};
        int[] brr = new int[5];
//        Arrays.fill(brr, 100);
        fill(brr, 100);

//        int[] crr = Arrays.copyOf(arr, arr.length);
        int[] crr = copyOf(arr, arr.length);
    }
}
