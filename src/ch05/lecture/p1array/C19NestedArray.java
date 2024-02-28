package ch05.lecture.p1array;

import java.util.Arrays;

public class C19NestedArray {
    public static void main(String[] args) {
        int[][] arr1 = new int[2][]; // 객체의 주소는 있지만 참조값은 없는 상태

        System.out.println(arr1.length); // 길이 : 2
        System.out.println(Arrays.toString(arr1)); // 원소의 값 : [null, null]

        arr1[0] = new int[3];
        System.out.println(Arrays.toString(arr1)); // 원소의 값 : [[I@b4c966a, null]
        System.out.println(Arrays.toString(arr1[0])); // [0, 0, 0]

        arr1[1] = new int[2];
        System.out.println(Arrays.toString(arr1[1])); // [0, 0]
    }
}
