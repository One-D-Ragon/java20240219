package ch02.sec02;

public class IntegerLiteralExample {
    public static void main(String[] args) {
        int var1 = 0b1011; // 2진수 '0b'로 시작
        int var2 = 0206; // 8진수 '0'으로 시작
        int var3 = 365; //10진수
        int var4 = 0xB3; //16진수 '0x'로 시작

        // 영문자는 대소문자 구분 안함

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);


    }
}
