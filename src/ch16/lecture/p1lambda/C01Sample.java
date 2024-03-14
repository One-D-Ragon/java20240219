package ch16.lecture.p1lambda;

import java.util.Arrays;

public class C01Sample {
    public static void main(String[] args) {
        String[] names = {"son", "park", "hwang"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        Arrays.sort(names, (a, b) -> b.length() - a.length());
        System.out.println(Arrays.toString(names));
        Arrays.sort(names, (a, b) -> a.length() - b.length());
        System.out.println(Arrays.toString(names));
    }
}
