package ch06.exercise.p15;

public class MemberService {
//    String id, password;
//
//    void setMemberService(String id, String password) {
//        this.id = id;
//        this.password = password;
//    }

    boolean login(String id, String password) {
        boolean isHong = id.equals("hong");
        boolean is12345 = password.equals("12345");

        boolean result = isHong && is12345;
        return result;

        /*
        if (id == "hong" && password == "12345") {
            return true;
        }
        return false;
         */
    }

    void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }
}
