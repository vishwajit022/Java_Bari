package OOPS;

import java.util.*;
import java.lang.*;

class Circle {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Cylinder extends Circle {
    public double height;

    public double volume() {
        return area() * height;
    }

}

public class inheritance {
    public static void main(String args[]) {
        Cylinder c = new Cylinder();
        c.radius = 5;
        c.height = 12;
        System.out.println("Volume of the Cylinder  : " + c.volume());
        System.out.println("Area of the Circle : " + c.area());
    }
}
