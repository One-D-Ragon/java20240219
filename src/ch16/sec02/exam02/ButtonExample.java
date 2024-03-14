package ch16.sec02.exam02;

public class ButtonExample {
    public static void main(String[] args) {
        // Ok 버튼 객체 생성
        Button button = new Button();

        // Ok 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
        button.setClickListener(() -> {
            System.out.println("Ok 버튼을 클릭했습니다.");
        });

        // Ok 버튼 클릭하기
        button.click();

        // Cancel 버튼 객체 생성
        Button button2 = new Button();

        // Cancel 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
        button2.setClickListener(() -> System.out.println("Cancel 버튼을 클릭했습니다."));

        // Cancel 버튼 클릭하기
        button2.click();
    }
}
