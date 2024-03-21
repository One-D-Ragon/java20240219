package ch15.lecture.p4queue;

import java.util.LinkedList;
import java.util.Queue;

public class C01Queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // 아이템 추가 (offer)
        queue.offer("java");
        queue.offer("spring");
        queue.offer("jdbc");
        queue.offer("mariadb");
        System.out.println(queue.size()); // 4

        // 아이템 꺼내기 (poll)
        queue.poll(); // java
        queue.poll(); // spring
        queue.poll(); // jdbc
        queue.poll(); // mariadb
        System.out.println(queue.size()); // 0


    }
}


