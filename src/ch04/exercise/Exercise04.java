package ch04.exercise;

public class Exercise04 {
    public static void main(String[] args) {

        while (true) {
            int dice1 = (int) (Math.random() * 6) + 1; // Math.random() 함수는 0.0보다 같거나 크고 1.0보다 작은 값을 출력
            int dice2 = (int) (Math.random() * 6) + 1;

            System.out.println("눈1 = " + dice1 + ", 눈2 = " + dice2);
            System.out.println(STR."(\{dice1}, \{dice2})");

            if ((dice1 + dice2) == 5) {
                break;
            }
        }
        System.out.println("주사위 종료");
    }
}
