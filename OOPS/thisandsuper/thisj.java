package OOPS.thisandsuper;

class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        // We use this keyword to refer to variable of the current class so if
        // we have same var name the compiler doesn't get confused while assigning
        // values
    }

    void display() {
        System.out.println("Lenght:" + this.length);
        System.out.println("Breadth:" + this.breadth);
    }
}

public class thisj {
    public static void main(String arg[]) {
        Rectangle r = new Rectangle(4, 5);
        r.display();
    }

}
