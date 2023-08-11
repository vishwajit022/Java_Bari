package F5_Collections;

import java.util.*;

class Point implements Comparable<Point> {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Returns a string representation of the point in the format "x= x-value y=
    // y-value"
    public String toString() {
        return "x= " + x + " y= " + y;
    }

    // Compares two points for ordering in TreeSet
    @Override
    public int compareTo(Point other) {
        // Compare x-coordinates
        if (this.x < other.x)
            return -1;
        if (this.x > other.x)
            return 1;

        // If x-coordinates are equal, compare y-coordinates
        if (this.y < other.y)
            return -1;
        if (this.y > other.y)
            return 1;

        // Points are equal
        return 0;
    }
}

// TreeSet example using the Point class implementing Comparable
public class p7_treeSetwithComparableInterface {
    public static void main(String arg[]) {
        // Create a TreeSet of Points
        TreeSet<Point> t = new TreeSet<>();
        t.add(new Point(1, 1)); // Add points to the set
        t.add(new Point(2, 4));
        t.add(new Point(7, 1));
        t.add(new Point(5, 9));

        // Print the points in the TreeSet, they will be automatically sorted
        for (Point point : t) {
            System.out.println(point);
        }
    }
}
