package OOPS;

class Rectangle {
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public void setlength(int l) {
        if (l > 0) {
            length = l;
        } else {
            length = 0;
        }
    }

    public int getbreadth() {
        return breadth;
    }

    public void setbreadth(int l) {
        if (l > 0) {
            breadth = l;
        } else {
            breadth = 0;
        }
    }

    public double area() {
        return length * breadth;
    }

}

public class datahiding {

    // Let's not modify our code from the main method
    // let's make it more confidential or more secure so not all user could update
    // the properties of the object
    // we can update the properties using getter method or setter method

    public static void main(String arg[]) {
        Rectangle r = new Rectangle();

        r.setlength(5);

        System.out.println(r.getLength());

        r.setbreadth(6);
        System.out.println(r.getbreadth());

        System.out.println(r.area());

    }

}
