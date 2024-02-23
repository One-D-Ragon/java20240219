package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x 값 입력: ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("y 값 입력: ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        // 새롭게 작성
        System.out.print("z 값 입력: ");
        int z = scanner.nextInt();

//        int result = x + y;
//        System.out.println("x + y: " + result);
//        System.out.println();

        // 새롭게 작성
        int result = x + y + z;
        System.out.println("x + y + z: " + result);
        System.out.println();

        scanner.nextLine();
        while (true) {
            System.out.print("입력 문자열: ");
            String data = scanner.nextLine();
            if (data.equals("q")) { // data 가 "q"이면
                break;
            }
            System.out.println("출력 문자열: " + data);
            System.out.println();
        }
        System.out.println("종료");

        scanner.close();
    }
}
