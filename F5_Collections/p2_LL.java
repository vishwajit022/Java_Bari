package F5_Collections;

import java.util.*;

public class p2_LL {

    public static void main(String arg[]) {
        // Generics only work with reference types (objects), not primitive types. The
        // wrapper classes like Integer are reference types, which allows them to be
        // used as generic type arguments.
        LinkedList a = new LinkedList<>();
        LinkedList b = new LinkedList<>(List.of(23, 2, 3, 6, 8, 6, 8, 6, 9, 7));

        a.add(14);
        a.add(0, 1);
        a.add(b);
        System.out.print(a);

        System.out.println(a.contains(10));
        System.out.println(a.get(0));
        System.out.println(b.indexOf(6));

        a.set(0, 10000);
        // This replace the element given inside the ArrayList
        System.out.println(a);

        System.out.println("Traversing");

        // Traversing all the Elements
        // for (int i = 0; i < a.size(); i++) {
        // System.out.print(a.get(i) + " ");
        // }
        a.forEach(n -> show(n));
    }

    public static void show(Object n) {
        System.out.println(n);
    }

}
