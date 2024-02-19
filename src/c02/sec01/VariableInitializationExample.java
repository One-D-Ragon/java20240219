package c02.sec01;

public class VariableInitializationExample {
    // 4~13 줄의 코드 작성
    public static void main(String[] args) {
        //변수 value 선언
        int value;
        value = 10; // 컴파일이 되기 위해 밸류값을 넣어줌

        //연산 결과를 변수 result의 초기값으로 대입
        // 값이 없는 변수를 사용할 수 없음
        int result = value + 10;

        //변수 result 값을 읽고 콘솔에 출력
        System.out.println(result);
    }
}
