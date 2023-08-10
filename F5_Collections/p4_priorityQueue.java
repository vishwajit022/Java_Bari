package F5_Collections;

import java.util.*;

public class p4_priorityQueue {
    public static void main(String arg[]) {

        // Smaller the number will be the higher the priority will be
        // Bigger the number will be the lower the priority will be
        // Root-left-right

        PriorityQueue p = new PriorityQueue<>();
        p.add(10);
        p.add(1);
        p.add(3);
        p.add(34);
        p.add(4);
        // System.out.println(p.peek());
        // 1
        p.forEach((x) -> System.out.println(x));

        p.poll();
        // Delete one of the Element
        p.forEach((x) -> System.out.println(x));

    }
}
