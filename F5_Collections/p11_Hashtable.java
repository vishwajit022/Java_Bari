package F5_Collections;

import java.util.*;

public class p11_Hashtable {
    public static void main(String arg[]) {
        Hashtable h = new Hashtable();
        h.put(0, 12);
        h.put(3, 34);
        h.put(2, 45);
        h.put(1, 75);

        // Enumeration e = h.elements();
        // while (e.hasMoreElements()) {
        // System.out.println(e.nextElement());
        // }

        h.compute(2, (k, v) -> v + "34");

        // If the key isn't present we could use it in here
        // We could create one in here

        h.computeIfAbsent(7, (v) -> "K");

        Enumeration e = h.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
