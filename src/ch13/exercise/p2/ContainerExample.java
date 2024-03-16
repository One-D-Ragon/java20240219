package ch13.exercise.p2;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<>();
        container1.set = "홍길동";
        String str = container1.set;
        System.out.println(str);
//        String str = container1.get();

        var container2 = new Container<Integer>();
        container2.set = 6;
        int value = container2.set;
        System.out.println(value);
//        int value = container2.get();
    }
}

class Container<T> {
    public T set;

    public T getSet() {
        return set;
    }

    public void setSet(T set) {
        this.set = set;
    }
}