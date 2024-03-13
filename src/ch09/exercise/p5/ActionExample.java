package ch09.exercise.p5;

public class ActionExample {
    public static void main(String[] args) {
//        Action action = new CopyWorker();
        Action action = new Action() {
            @Override
            public void work() {
                System.out.println("복사를 합니다.");
            }
        };
        action.work();
    }
}


//class CopyWorker implements Action {
//    @Override
//    public void work() {
//        System.out.println("복사를 합니다.");
//    }
//}