package F5_Collections;

import java.util.*;

public class p3_ArrayDeque {
    public static void main(String arg[]) {
        ArrayDeque dq = new ArrayDeque<>(10);
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.addFirst(0);
        dq.forEach((x) -> System.out.println(x));

        dq.pollFirst();
        System.out.println("After doing poll");
        dq.forEach((x) -> System.out.println(x));

    }
}
