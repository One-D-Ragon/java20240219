package ch11.sec05;

public class ThorwsExample {
    public static void main(String[] args) {
        try {
            findclass();
        } catch (Exception e) {
            System.out.println("예외 처리: " + e.toString());
        }
    }

    public static void findclass() throws Exception {
        Class.forName("java.lang.String2");
    }
}
