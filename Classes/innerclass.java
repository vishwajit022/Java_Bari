package Classes; // Declares the package name "Classes"

class Outer { // Defines a class named "Outer"
    class Inner { // Defines a nested class named "Inner" within the "Outer" class

        // Method to display a message indicating that it's inside the "Inner" class
        void Display() {
            System.out.println("Print Inner Class");
        }

    }

    // Method in the "Outer" class to create an instance of the "Inner" class and
    // call its "Display" method
    void Display() {
        Inner i = new Inner(); // Create an instance of the "Inner" class
        i.Display(); // Call the "Display" method of the "Inner" class
    }
}

public class innerclass { // Defines a public class named "innerclass"

    public static void main(String arg[]) { // Main method, the entry point of the program

        Outer o = new Outer(); // Create an instance of the "Outer" class
        o.Display(); // Call the "Display" method of the "Outer" class
    }
}
