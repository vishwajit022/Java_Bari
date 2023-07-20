package OOPS;

import java.lang.*;
import java.util.*;

class Circle {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double circumference() {
        return perimeter();
    }
}

public class writeclass {
    public static void main(String arg[]) {
        Circle c1 = new Circle();
        c1.radius = 7;
        Circle c2 = new Circle();
        c2.radius = 8;
        System.out.println("Area:" + c1.area());
        System.out.println("Perimeter:" + c1.perimeter());
        System.out.println("Circumference:" + c1.circumference());
        System.out.println("Area of circle 2:" + c2.area());

    }

}
