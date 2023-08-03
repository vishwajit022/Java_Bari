package Lang_Package; // Declares the package name "Lang_Package"

public class lan1 { // Defines a class named "lan1"

    public static void main(String arg[]) { // Main method, the entry point of the program

        Object o = new Object(); // Creates a new Object instance and assigns it to the variable "o"

        // The below code is commented out (single-line comment) as it is not currently
        // being used
        // System.out.println(o);
        // It will print the same thing as the default behavior of println is to call
        // the toString method of the Object.

        // The below code is commented out (single-line comment) as it is not currently
        // being used
        // System.out.println(o.toString());
        // #one and the same thing
        // The toString method of Object class returns a string representation of the
        // object.

        Object o2 = o; // Assigns the value of "o" to another variable "o2"

        // The below code is commented out (single-line comment) as it is not currently
        // being used
        // System.out.println(o.equals(o2));
        // True
        // The equals method of Object class checks if two objects are equal. Since "o"
        // and "o2" both refer to the same object, the result is true.

        System.out.println(o.hashCode()); // Prints the hash code of the object "o"

        // The hash code is a random number assigned to the object by the JVM. It is
        // used by data structures like HashMap and HashSet to efficiently store and
        // retrieve objects.
        // The value of the hash code can change during the execution of the program,
        // but it will remain constant for the same object in a single run of the
        // program.

    }
}
