package F2_Lambda;

@FunctionalInterface
interface Mylambda {
    void display(String s); // Functional interface with a single abstract method 'display'
}

public class p2_upperletterusingconstructor {
    public p2_upperletterusingconstructor(String s) {
        System.out.println(s.toUpperCase()); // Constructor: Convert the input string to uppercase and print it
    }

    public static void main(String arg[]) {
        Mylambda l = p2_upperletterusingconstructor::new; // Create a Mylambda instance using a constructor reference
        l.display("Hello"); // Call the 'display' method of the Mylambda instance with the string "Hello"
    }
}
