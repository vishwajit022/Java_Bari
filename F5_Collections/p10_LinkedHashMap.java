package F5_Collections;

import java.util.LinkedHashMap;

public class p10_LinkedHashMap {

    // It maintains the order in which the data is stored
    // Just like hashing the data is first %10 then it stored in
    public static void main(String arg[]) {
        LinkedHashMap<Integer, String> l = new LinkedHashMap<>(5);
        l.put(0, "A");
        l.put(8, "e");
        l.put(6, "G");
        l.put(1, "B");
        l.put(2, "C");
        l.put(3, "D");

        l.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
