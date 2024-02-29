package ch05.sec05;

public class EmptyStringExample {
    public static void main(String[] args) {
        String hobby = "";
        if (hobby.equals("")) {
            System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
        }
        if (hobby.isEmpty()) {
            System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
        }
        if (hobby.isBlank()) { // ctrl + q를 누르면 자세히 볼 수 있다
            System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
        }
    }
}
