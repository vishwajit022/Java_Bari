// Package declaration: F2_Lambda
package F2_Lambda;

// Functional interface Myinterface with a single abstract method 'display()'
// The @FunctionalInterface annotation is used to indicate that this interface is a functional interface.
// Functional interfaces can have only one abstract method and can be used as lambda expressions or method references.
@FunctionalInterface
interface Myinterface {
    // Abstract method 'display()' with no parameters and no return type (void).
    void display();
}

// Main class intro
public class intro {
    // This is the main class containing the main method, the entry point of the
    // program.

    public static void main(String arg[]) {
        // The main method starts here.

        // Create an object 'm' of the Myinterface using a lambda expression.
        // The lambda expression () -> { System.out.println("Hello"); } implements the
        // 'display()' method of the Myinterface.
        // The lambda expression is a concise way to create an implementation of the
        // functional interface.

        Myinterface m = () -> {
            // The body of the lambda expression starts here.
            // This block of code will be executed when the 'display()' method of
            // Myinterface is called.
            System.out.println("Hello");
            // The code inside the lambda expression prints "Hello" to the console.
        };

        // Call the 'display()' method of the Myinterface using the object 'm'.
        // This will invoke the implementation provided in the lambda expression.
        m.display();
        // The output will be: "Hello"

    }
}
