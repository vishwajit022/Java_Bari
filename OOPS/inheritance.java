import java.util.*;
import java.lang.*;

class Circle {
    public double radius; // Public instance variable to store the radius of the circle

    public double area() {
        return Math.PI * radius * radius; // Method to calculate and return the area of the circle
    }

    public double perimeter() {
        return 2 * Math.PI * radius; // Method to calculate and return the perimeter of the circle
    }
}

class Cylinder extends Circle {
    public double height; // Public instance variable to store the height of the cylinder

    public double volume() {
        return area() * height; // Method to calculate and return the volume of the cylinder
    }

}

public class inheritance {
    public static void main(String args[]) {
        Cylinder c = new Cylinder(); // Create an object of the Cylinder class

        c.radius = 5; // Set the radius of the circle part of the cylinder
        c.height = 12; // Set the height of the cylinder

        System.out.println("Volume of the Cylinder: " + c.volume()); // Calculate and display the volume of the cylinder
        System.out.println("Area of the Circle: " + c.area()); // Calculate and display the area of the circle part of
                                                               // the cylinder
    }
}
