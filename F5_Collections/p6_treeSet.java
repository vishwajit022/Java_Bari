package F5_Collections;

import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class p6_treeSet {
    public static void main(String arg[]) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(10);
        t.add(45);
        t.add(23);
        t.add(23);
        t.add(48);
        t.add(1);
        t.add(76);

        System.out.println(t);

        // Here ceiling will return the most nearest bigger value
        System.out.println(t.ceiling(46));

        // Here floor will return the most nearest smaller value
        System.out.println(t.floor(47));

        Collection ts = new TreeSet<>();
        // Using this we can only access the methods which are there in Collection
        // ts.contains(10);

        TreeSet<Integer> tse = new TreeSet<>(List.of(3, 4, 2, 4, 35, 432, 5, 32, 45, 434, 435, 6, 56, 65));

        tse.add(20);
        System.out.println(tse);
    }
}
