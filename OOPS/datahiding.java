class Rectangle {
    private int length; // Private instance variable to store the length of the rectangle
    private int breadth; // Private instance variable to store the breadth of the rectangle

    public int getLength() {
        return length; // Getter method to retrieve the length of the rectangle
    }

    public void setLength(int l) {
        if (l > 0) {
            length = l; // Setter method to set the length of the rectangle with the provided value
        } else {
            length = 0; // If the provided value is not valid (less than or equal to 0), set length to 0
        }
    }

    public int getBreadth() {
        return breadth; // Getter method to retrieve the breadth of the rectangle
    }

    public void setBreadth(int l) {
        if (l > 0) {
            breadth = l; // Setter method to set the breadth of the rectangle with the provided value
        } else {
            breadth = 0; // If the provided value is not valid (less than or equal to 0), set breadth to
                         // 0
        }
    }

    public double area() {
        return length * breadth; // Method to calculate and return the area of the rectangle
    }
}

public class datahiding {

    // Let's not modify our code from the main method
    // Let's make it more confidential or more secure so not all users can update
    // the properties of the object
    // We can update the properties using getter method or setter method

    public static void main(String arg[]) {
        Rectangle r = new Rectangle();

        r.setLength(5); // Set the length of the rectangle to 5 using the setter method

        System.out.println(r.getLength()); // Display the length of the rectangle using the getter method

        r.setBreadth(6); // Set the breadth of the rectangle to 6 using the setter method
        System.out.println(r.getBreadth()); // Display the breadth of the rectangle using the getter method

        System.out.println(r.area()); // Calculate and display the area of the rectangle using the area() method
    }
}
