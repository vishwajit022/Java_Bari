class Super {
    void display() {
        System.out.println("Hello");
    }
}

class Sub extends Super {
    @Override
    void display() {
        System.out.println("Hello World");
    }
}

public class overriding {
    public static void main(String arg[]) {
        // Create an instance of Sub class
        Sub s = new Sub();
        s.display();
        // Output: "Hello World"
        // Since the Sub class has its own method display, it will run its own display
        // method and print "Hello World".

        // Create an instance of Super class
        Super su = new Super();
        su.display();
        // Output: "Hello"
        // Since the object 'su' is of type 'Super', it will run the display method of
        // the 'Super' class and print "Hello".

        // Create an instance of Sub class but store it in a reference of Super class
        Super sh = new Sub();
        sh.display();
        // Output: "Hello World"
        // Here, the reference 'sh' is of type 'Super', but it points to an object of
        // type 'Sub'.
        // Java uses dynamic method dispatch to determine the actual object type at
        // runtime and execute the appropriate method.
        // So, it will run the display method of the 'Sub' class and print "Hello
        // World".

        // Conclusion: The method that gets called is determined by the type of the
        // object that the reference points to, not the type of the reference itself.
    }
}
