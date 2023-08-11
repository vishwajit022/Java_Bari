package F5_Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class p9_HashMap {
    public static void main(String arg[]) {
        // Create a TreeMap with initial key-value pairs
        HashMap<Integer, String> t = new HashMap<>(Map.of(0, "a", 1, "b", 2, "c"));

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
