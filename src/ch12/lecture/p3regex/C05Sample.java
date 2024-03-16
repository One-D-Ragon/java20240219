package ch12.lecture.p3regex;

public class C05Sample {
    public static void main(String[] args) {
        // _, $, 영문대소문자, 숫자 조합
        // 단 숫자로 시작하면 안됨

        String pattern = "[a-zA-Z_$]\\w*";
//        String pattern = "[_$a-zA-Z][A-Za-z0-9_$]+";
//        String pattern = "^(?![0-9])[A-Za-z0-9_$]+$";
        System.out.println("num".matches(pattern)); // true
        System.out.println("var7".matches(pattern)); // true
        System.out.println("class".matches(pattern)); // true
        System.out.println("PI".matches(pattern)); // true
        System.out.println("MAX_VALUE".matches(pattern)); // true
        System.out.println("7num".matches(pattern)); // false

        // 수량자
        // {n} : 정확히 n번
        // {n,m} : n~m번
        // {n,} : n번 이상
        // + : {1,} : 1번 이상
        // * : {0,} : 0번 이상
        // ? : {0,1} : 한번 또는 없음
        // [0-9] : \d
        // whitespace : \s
        // word character [a-zA-z0-9_] : \w
        // 모든 문자 : .
    }
}
