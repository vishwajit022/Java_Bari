package F5_Collections;

import java.util.*;

//Hashing we do  %10=n with the input data number and store it in n
//when it comes to Time Complexity it is a good data structure but lot of space is wasted

public class p5_hashset {
    public static void main(String arg[]) {
        HashSet<Integer> h = new HashSet<>();
        // HashSet<Integer> hs = new HashSet<>(20, 0.75f);
        // 0.25f is the load factor which indicates that the size will be

        h.add(10);
        h.add(20);
        h.add(30);
        h.add(10);
        // The elements won't be stored in the order in which it was order in which it
        // was entered

        // The set word indicates that only unique elements are allowed
        // we cannot store duplicate elements in it

        System.out.println(h);
    }
}
