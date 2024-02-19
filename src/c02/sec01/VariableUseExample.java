package c02.sec01;

public class VariableUseExample {
    // 파일명과 클래스명이 같다, 클래스에서 이름을 바꾸는 법은 이름에 커서를 올려놓고 마우스 오른쪽 refactor -> rename
    public static void main(String[] args) {
        int hour = 3;
        int minute = 5;
        System.out.println(hour + "시간 " + minute + "분");

        int totalMinute = (hour*60) + minute;
        System.out.println("총 " + totalMinute + "분");
    }
}
