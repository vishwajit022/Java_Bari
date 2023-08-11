package F5_Collections;

import java.util.*;

public class p8_TreeMap {
    public static void main(String arg[]) {
        // Create a TreeMap with initial key-value pairs
        TreeMap<Integer, String> t = new TreeMap<>(Map.of(0, "a", 1, "b", 2, "c"));

        // Print the TreeMap's key-value pairs
        // for (Map.Entry<Integer, String> entry : t.entrySet()) {
        // System.out.println("Key: " + entry.getKey() + ", Value: " +
        // entry.getValue());

        t.put(3, "d");
        t.put(4, "e");
        System.out.println(t.get(3));

        System.out.println(t);

    }
}
