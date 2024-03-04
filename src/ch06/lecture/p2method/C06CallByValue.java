package ch06.lecture.p2method;

import ch06.sec06.exam01.Car;

public class C06CallByValue {
    public static void main(String[] args) {
        C06Car car = new C06Car();
        car.name = "tesla";
        car.printName();

        C06CarCenter center = new C06CarCenter();
        center.changeName(car);

        car.printName(); // "kia"? "tesla"?

    }
}

class C06CarCenter {
    void changeName(C06Car car) {
        car = new C06Car(); // 이 부분을 주석처리하면 위의 printName() 객체는 "kia"가 된다
        car.name = "kia";
    }
}

class C06Car {
    String name;

    void printName() {
        System.out.println(name);
    }
}




