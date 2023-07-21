package OOPS.thisandsuper;

import java.lang.*;

class Rectangle {
    int length;
    int breadth;
    int x = 10;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void display() {
        System.out.println("Length:" + this.length);
        System.out.println("Breadth:" + this.breadth);
    }
}

class Cuboid extends Rectangle {
    int height;
    int x = 20;

    Cuboid(int length, int breadth, int height) {
        super(length, breadth);// THis will refer to current super class and use the constructor of rectangle
        this.height = height;

    }

    void display() {
        System.out.println("Height:" + this.height);
        System.out.println("Length:" + this.length);
        System.out.println("Breadth:" + this.breadth);
        System.out.println("X value :" + this.x);

    }

}

public class superj {

    public static void main(String arg[]) {
        Rectangle r = new Rectangle(3, 5);
        Cuboid c = new Cuboid(3, 5, 8);
        c.display();

    }

}
