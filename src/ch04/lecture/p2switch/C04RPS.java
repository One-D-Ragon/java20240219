package ch04.lecture.p2switch;

import java.util.Random;
import java.util.Scanner;

public class C04RPS {
    public static void main(String[] args) {
        // 가위바위보 게임 만들기
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("가위(1), 바위(2), 보(3) 를 선택하세요:");

        // 1, 2, 3
        int user = Integer.parseInt(scanner.nextLine());
        int computer = random.nextInt(1, 4);

        // switch 문으로 바꾸기

        switch (user) {
            case 1 -> System.out.println("user = 가위");
            case 2 -> System.out.println("user = 바위");
            case 3 -> System.out.println("user = 보");
        }

        switch (computer) {
            case 1:
                System.out.println("computer = 가위");
                break;
            case 2:
                System.out.println("computer = 바위");
                break;
            case 3:
                System.out.println("computer = 보");
                break;
        }


        /*
        if (user == 1) {
            System.out.println("user = 가위"); // 가위, 바위, 보
        }
        if (user == 2) {
            System.out.println("user = 바위"); // 가위, 바위, 보
        }
        if (user == 3) {
            System.out.println("user = 보"); // 가위, 바위, 보
        }
        if (computer == 1) {
            System.out.println("computer = 가위"); // 가위, 바위, 보
        }
        if (computer == 2) {
            System.out.println("computer = 바위"); // 가위, 바위, 보
        }
        if (computer == 3) {
            System.out.println("computer = 보"); // 가위, 바위, 보
        }
         */

        // 누가 이겼는지? 또는 비겼는지 메세지 출력
        // 비김 : user == computer
        // 이김 : user == 1 && computer == 3
        //       user == 2 && computer == 1
        //       user == 3 && computer == 2
        // 짐 : 나머지 모두


        if (user == computer) {
            System.out.println("비겼습니다");
        } else if (user == 1 && computer == 3) {
            System.out.println("유저가 이겼습니다");
        } else if (user == 2 && computer == 1) {
            System.out.println("유저가 이겼습니다");
        } else if (user == 3 && computer == 2) {
            System.out.println("유저가 이겼습니다");
        } else {
            System.out.println("유저가 졌습니다");
        }
        System.out.print("가위(1), 바위(2), 보(3) 를 선택하세요:");
    }
}
