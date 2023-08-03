import java.lang.*;
import java.util.*;

class Rectangle {
    private double length; // Private instance variable to store the length of the rectangle
    private double breadth; // Private instance variable to store the breadth of the rectangle

    public Rectangle() {
        // Default constructor initializes the length and breadth to 1
        length = 1;
        breadth = 1;
    }

    public Rectangle(int l, int b) {
        // Parameterized constructor to set the length and breadth based on provided
        // values
        length = l;
        breadth = b;
    }

    // Getters and setters (optional)
    public double getLength() {
        // Getter method to retrieve the length of the rectangle
        return length;
    }

    public void setLength(double length) {
        // Setter method to set the length of the rectangle with the provided value
        this.length = length;
    }

    public double getBreadth() {
        // Getter method to retrieve the breadth of the rectangle
        return breadth;
    }

    public void setBreadth(double breadth) {
        // Setter method to set the breadth of the rectangle with the provided value
        this.breadth = breadth;
    }

    // Other methods for calculating area, perimeter, etc. can be added here
}

public class Constructor {
    public static void main(String args[]) {
        // Constructor is a method which will have the same name as the class name
        // - Doesn't have a return type ((( Not even Void )))
        // - We make them public and private
        // - By default, there is a constructor for a class created by a compiler
        // Constructor overloading

        Rectangle e = new Rectangle(); // Create an object using the default constructor
        Rectangle r = new Rectangle(6, 9); // Create an object using the parameterized constructor

        // Example of using getters and setters (optional)
        System.out.println("Length of r: " + r.getLength()); // Display the length of rectangle r
        System.out.println("Breadth of r: " + r.getBreadth()); // Display the breadth of rectangle r

        r.setLength(10); // Set the length of rectangle r to 10 using the setter method
        r.setBreadth(5); // Set the breadth of rectangle r to 5 using the setter method

        System.out.println("New length of r: " + r.getLength()); // Display the updated length of rectangle r
        System.out.println("New breadth of r: " + r.getBreadth()); // Display the updated breadth of rectangle r
    }
}
