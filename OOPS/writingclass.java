import java.lang.*;
import java.util.*;

class Circle {
    public double radius;

    // Method to calculate the area of the circle
    public double area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the perimeter of the circle
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // Method to calculate the circumference of the circle
    public double circumference() {
        return perimeter();
    }
}

public class writingclass {
    public static void main(String arg[]) {
        // Create two Circle objects
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        // Set the radius of the circles
        c1.radius = 7;
        c2.radius = 8;

        // Calculate and display the properties of the first circle
        System.out.println("Area of Circle 1: " + c1.area());
        System.out.println("Perimeter of Circle 1: " + c1.perimeter());
        System.out.println("Circumference of Circle 1: " + c1.circumference());

        // Calculate and display the area of the second circle
        System.out.println("Area of Circle 2: " + c2.area());
    }
}
