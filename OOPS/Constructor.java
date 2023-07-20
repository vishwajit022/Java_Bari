package OOPS;

import java.lang.*;
import java.util.*;

class Rectangle {
    private double length;
    private double breadth;

    public Rectangle() {
        length = 1;
        breadth = 1;
    }

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    // Getters and setters (optional)
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
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

        Rectangle e = new Rectangle(); // Default constructor
        Rectangle r = new Rectangle(6, 9); // Parameterized constructor

        // Example of using getters and setters (optional)
        System.out.println("Length of r: " + r.getLength());
        System.out.println("Breadth of r: " + r.getBreadth());

        r.setLength(10);
        r.setBreadth(5);

        System.out.println("New length of r: " + r.getLength());
        System.out.println("New breadth of r: " + r.getBreadth());
    }
}
