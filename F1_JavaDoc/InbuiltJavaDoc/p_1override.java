package F1_JavaDoc.InbuiltJavaDoc;

// Parent class
class Parent {
    // This method is the display method of the Parent class
    public void display() {
        // The implementation of this method will be provided by its subclasses.
        // This method can be overridden by the subclasses to provide their specific
        // behavior.
    }
}

// Child class extending Parent class
class Child extends Parent {
    // This annotation (@Override) indicates that we are overriding the display
    // method from the parent class.
    // If there is no matching method in the parent class, this will result in a
    // compilation error.
    @Override
    public void display() {
        // This method overrides the display method from the parent class.
        // It will be called instead of the parent class's display method when an object
        // of the Child class is used.
        System.out.println("Hello");
    }
}

// Main class
public class p_1override {
    public static void main(String s) {
        // This is the main method, the entry point of the program.
        // However, it's declared incorrectly with only one parameter of type String.
        // The main method should be declared as public static void main(String[] args).
        // The correct declaration should be:
        // public static void main(String[] args) {
        // // code here
        // }
    }
}
