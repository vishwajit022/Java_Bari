package F5_Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class p10_LinkedHashMapCache {

    public static void main(String arg[]) {
        // Create a new LinkedHashMap instance with initial capacity of 5, load factor
        // of 0.75,
        // and access order set to true (which means the ordering is based on access,
        // not insertion).
        LinkedHashMap<Integer, String> l = new LinkedHashMap<>(5, .75f, true) {
            // Override the removeEldestEntry method to specify a custom removal condition.
            public boolean removeEldestEntry(Map.Entry e) {
                return size() > 5; // Remove the eldest entry when the size exceeds 5.
            }
        };

        // Add key-value pairs to the LinkedHashMap.
        l.put(0, "A");
        l.put(8, "e");
        l.put(6, "G");
        l.put(1, "B");
        l.put(2, "C");
        l.put(3, "D");

        l.get(0); // Accessing the entry with key 0, which modifies its position based on access
                  // order.

        // Iterate over the entries in the LinkedHashMap and print each key-value pair.
        l.forEach((k, v) -> System.out.println(k + " " + v));
        // The output will reflect the access order, with the least recently accessed
        // entry (0) at the end.
    }
}
