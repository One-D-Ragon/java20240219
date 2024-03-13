package ch09.lecture.p2anonymous;

import java.util.Arrays;
import java.util.Random;

public class C07Sample {
    public static void main(String[] args) {
        // TODO : null 대신 익명클래스 객체 코드 작성

        Game rpsGame = new Game() {
            @Override
            public void play() {
                // "가위", "바위", "보" 중 하나 출력
                Random random = new Random();
                int a = (int) (Math.random() * 3 + 1);
                switch (a) {
                    case 1 -> System.out.println("가위");
                    case 2 -> System.out.println("바위");
                    case 3 -> System.out.println("보");
                }
            }
        };
        rpsGame.play();

        Game lottoGame = new Game() {
            @Override
            public void play() {
                // 초보자: 1~45 값 중 한개 출력
                Random random = new Random();
                System.out.println((int) (Math.random() * 45 + 1));
            }
        };
        lottoGame.play();

        Game lottoGame2 = new Game() {
            @Override
            public void play() {
                // 중급자: 1~45 값 중 6개 중복없이 출력
                int[] numbers = new int[6];
                int size = 0;

                Random random = new Random();

                while (size < 6) {
                    // 번호 뽑고
                    int randomNumber = random.nextInt(45) + 1;

                    // 있는 지 없는 지? 판단한는 변수
                    boolean alreadyHave = false;

                    // 이미 있는 지?
                    for (int i = 0; i < size; i++) {
                        if (numbers[i] == randomNumber) {
                            // 있다는 표시하고
                            alreadyHave = true;
                            // 반복문 종료
                            break;
                        }
                    }

                    if (!alreadyHave) {
                        // 없으면 배열에 추가하고
                        // size 를 1 증가
                        numbers[size] = randomNumber;
                        size++;
                    }
                    // 다음 번호 뽑기
                }

                System.out.println(Arrays.toString(numbers));
            }

        };
        lottoGame2.play();
    }
}

interface Game {
    void play();
}
