package ch05.exercise;

public class Exercise03 {
    public static void main(String[] args) {
        String a = "java";
        String b = new String("java");
        String c = "java";

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));

        System.out.println(a == c); // X
        System.out.println(a.equals(c)); // ok
    }
}
