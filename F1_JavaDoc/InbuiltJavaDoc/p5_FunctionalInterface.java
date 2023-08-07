package F1_JavaDoc.InbuiltJavaDoc;

// Functional interface Me with a single abstract method 'show()'
// The @FunctionalInterface annotation is used to indicate that this interface is a functional interface.
// Functional interfaces can have only one abstract method and can be used as lambda expressions or method references.
@FunctionalInterface
interface Me {
    // Abstract method 'show()' with no parameters and no return type (void).
    public void show();
}

// Main class
public class p5_FunctionalInterface {
    // This is the main class, but there is no code inside the main method.

    // The code above defines a functional interface 'Me' with a single abstract
    // method 'show()'.
    // The @FunctionalInterface annotation is used to enforce that this interface
    // should have only one abstract method.

    // Functional interfaces are typically used for lambda expressions and method
    // references in Java.
    // For example, you can create a lambda expression that implements the 'Me'
    // interface:
    // Me myLambda = () -> System.out.println("Hello, this is a lambda
    // expression.");
    // The lambda expression replaces the need to create a separate class that
    // implements the 'Me' interface.

    // You can also use method references with functional interfaces:
    // void display() {
    // System.out.println("Hello, this is a method reference.");
    // }
    // Me myMethodReference = this::display;
    // The method reference 'this::display' refers to the 'display()' method in the
    // current class.

    // The usage of functional interfaces simplifies the code and provides a concise
    // way to work with functional programming in Java.
}
