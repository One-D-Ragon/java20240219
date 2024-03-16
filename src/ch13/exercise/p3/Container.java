package ch13.exercise.p3;

public class Container<T, T1> {
    private T key;
    private T1 value;

    public void set(T param1, T1 param2) {
        this.key = param1;
        this.value = param2;
    }

    public T getKey() {
        return key;
    }

    public T1 getValue() {
        return value;
    }

}
