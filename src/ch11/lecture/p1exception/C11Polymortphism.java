package ch11.lecture.p1exception;

import java.util.List;

public class C11Polymortphism {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            List.of().get(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
