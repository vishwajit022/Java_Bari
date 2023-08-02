package Lang_Package;

public class lang4String {
    public static void main(String arg[]) {
        // Declaring and initializing a String variable
        String a = "Hello";

        // Declaring a StringBuffer and StringBuilder object and initializing them with
        // "Hello"
        StringBuffer b = new StringBuffer("Hello");
        StringBuilder c = new StringBuilder("Hello");

        // Concatenating " World" to the original string "Hello"
        // Note: The result of the concatenation is not assigned to any variable
        // Strings are immutable in Java, so this line does not change the value of 'a'
        a.concat(" World");

        // Appending " world" to the original StringBuffer 'b'
        // StringBuffer is mutable, so this line modifies the content of 'b'
        b.append(" world");

        // Appending " World" to the original StringBuilder 'c'
        // StringBuilder is mutable, so this line modifies the content of 'c'
        c.append(" World");

        // Printing the values of 'a', 'b', and 'c' after the modifications
        // 'a' remains "Hello" as it was not changed directly
        // 'b' is now "Hello world" after the append operation
        // 'c' is now "Hello World" after the append operation
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}