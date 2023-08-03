package Lang_Package; // Declares the package name "Lang_Package"

public class lang4String { // Defines a class named "lang4String"

    public static void main(String arg[]) { // Main method, the entry point of the program

        // Declaring and initializing a String variable
        String a = "Hello"; // Creates a String variable 'a' with the value "Hello"

        // Declaring a StringBuffer and StringBuilder object and initializing them with
        // "Hello"
        StringBuffer b = new StringBuffer("Hello"); // Creates a StringBuffer object 'b' with the value "Hello"
        StringBuilder c = new StringBuilder("Hello"); // Creates a StringBuilder object 'c' with the value "Hello"

        // Concatenating " World" to the original string "Hello"
        // Note: The result of the concatenation is not assigned to any variable
        // Strings are immutable in Java, so this line does not change the value of 'a'
        a.concat(" World"); // The 'concat' method returns a new String object containing the concatenated
                            // value, but it is not stored in 'a'

        // Appending " world" to the original StringBuffer 'b'
        // StringBuffer is mutable, so this line modifies the content of 'b'
        b.append(" world"); // The 'append' method modifies the content of 'b' by adding " world" to it

        // Appending " World" to the original StringBuilder 'c'
        // StringBuilder is mutable, so this line modifies the content of 'c'
        c.append(" World"); // The 'append' method modifies the content of 'c' by adding " World" to it

        // Printing the values of 'a', 'b', and 'c' after the modifications
        // 'a' remains "Hello" as it was not changed directly
        // 'b' is now "Hello world" after the append operation
        // 'c' is now "Hello World" after the append operation
        System.out.println(a); // Prints "Hello"
        System.out.println(b); // Prints "Hello world"
        System.out.println(c); // Prints "Hello World"

    }
}
