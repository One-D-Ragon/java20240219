package ch02.sec05;

public class BooleanExample {
    public static void main(String[] args) {
        boolean stop = true;
        if (stop) {
            System.out.println("중지합니다");
        } else {
            System.out.println("시작합니다");
        } // ctrl + shift + enter 를 누르면 문장을 완성하는데 필요한 코드를 자동으로 입력해준다.

        int x = 10;
        boolean result1 = (x == 20); // 변수 x의 값이 20인가?
        boolean result2 = (x != 20); // 변수 x의 값이 20이 아닌가?
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
