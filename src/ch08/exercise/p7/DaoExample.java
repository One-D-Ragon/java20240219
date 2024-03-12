package ch08.exercise.p7;

public class DaoExample {
    public static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork(new MySqlDao());
    }
}

// 추상 클래스 : 자식클래스의 부모클래스는 하나
//             추상메소드와 구현된 메소드 모두 작성가능
//             접근제한자도 4개 모두 사용 가능
//             인스턴스 필드 가질 수 있음

// 인터페이스 : 구현클래스가 여러 인터페이스를 구현할 수 있다.
//            모든 메소드는 public abstract 메소드 (x) -> 중요

//            public static 메소드
//            : 몸통이 있는 public static 메소드
//            default 메소드
//            : 몸통이 있는 public 메소드
//            private 메소드
//            : 몸통이 있는 private 메소드
//            인스턴스 필드 없음

//            public static final 필드만 작성 가능
