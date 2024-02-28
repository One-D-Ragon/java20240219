package ch05.lecture.p1array;

public class C06Array {
    public static void main(String[] args) {
        // 배열 전체 탐색
        int[] arr = new int[]{7, 20, 30, 40, 12, 234, 435, 12, 3, 27};

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }

        // 배열의 길이
        System.out.println("arr.length = " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
