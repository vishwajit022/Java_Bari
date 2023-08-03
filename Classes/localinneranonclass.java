package Classes; // Declares the package name "Classes"

abstract class My { // Defines an abstract class named "My"
    abstract void display(); // Abstract method "display" without any implementation
}

class Outer { // Defines a class named "Outer"

    // Method "meth1" in the "Outer" class
    public void meth1() {
        My m = new My() { // Creates an anonymous inner class that extends the abstract class "My"
            void display() { // Overrides the "display" method of the abstract class "My" with a custom
                             // implementation
                System.out.println("Hello"); // Prints "Hello" when the "display" method is called
            }
        }; // Semicolon marks the end of the anonymous inner class declaration

        // Here we are writing a comment to explain the presence of the semicolon
    }
}

public class localinneranonclass { // Defines a public class named "localinneranonclass"

    public static void main(String arg[]) { // Main method, the entry point of the program

        Outer o = new Outer(); // Creates an instance of the "Outer" class
        o.meth1(); // Calls the "meth1" method of the "Outer" class
    }
}
