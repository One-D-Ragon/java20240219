package c02.lecture.p02type;

public class C08Double {
    public static void main(String[] args) {
        // double
        // 실수 표현 타입
        // 8byte == 64bits

        double a = 3.141592;
        double b = 2983742.918734;
        double c = -9187.987298734;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // 근사한 값 저장
        double d = 23423424.10983749190178197341329471;
        System.out.println("d = " + d);
        // E7 = 10의 7승

        double e = 3.141592E2;
        System.out.println("e = " + e);

        double f = 3.141592E-2; // 3.141592 * 10^-2
        System.out.println("f = " + f);

    }
}
