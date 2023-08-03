package Classes; // Declares the package name "Classes"

class Outer { // Defines a class named "Outer"

    // Method "Display" in the "Outer" class
    void Display() {
        // Local inner class "Inner" defined inside the "Display" method of the "Outer"
        // class
        class Inner { // Defines a local inner class named "Inner" inside the "Display" method

            // Method "Display" in the local inner class "Inner"
            void Display() {
                System.out.println("XYZ"); // Prints "XYZ" when the "Display" method of the local inner class is called
            }
        } // End of the local inner class "Inner" declaration

        Inner i = new Inner(); // Creates an instance of the local inner class "Inner"
        i.Display(); // Calls the "Display" method of the local inner class "Inner" and prints "XYZ"
    }
}

public class localinnerclass { // Defines a public class named "localinnerclass"

    public static void main(String arg[]) { // Main method, the entry point of the program

        Outer o = new Outer(); // Creates an instance of the "Outer" class
        o.Display(); // Calls the "Display" method of the "Outer" class, which in turn creates an
                     // instance of the local inner class "Inner" and calls its "Display" method to
                     // print "XYZ"
    }
}
