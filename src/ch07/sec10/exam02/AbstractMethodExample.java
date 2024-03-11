package ch07.sec10.exam02;

import ch06.sec13.exam01.package2.C;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        // 매개변수의 다형성
        animalSound(new Dog());
        animalSound(new Cat());
    }

    public static void animalSound(Animal aniaml) {
        aniaml.sound();
    }
}
