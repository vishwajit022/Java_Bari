package Lang_Package; // Declares the package name "Lang_Package"

class MyObject { // Defines a class named "MyObject"

    public String toString() { // Overrides the toString() method of the Object class
        return "My Object is My Object none of your object";
    }

    public int hashCode() { // Overrides the hashCode() method of the Object class
        return 10;
    }

    public boolean equals(Object o) { // Overrides the equals() method of the Object class
        return this.hashCode() != o.hashCode();
        // The equals method compares two objects for equality based on their hash
        // codes.
        // It returns true if the hash codes of the objects are different, indicating
        // that the objects are not equal.
        // It returns false if the hash codes of the objects are the same, indicating
        // that the objects are equal.
    }
}

public class lang2overriding { // Defines a public class named "lang2overriding"

    public static void main(String arg[]) { // Main method, the entry point of the program

        MyObject m = new MyObject(); // Creates a new instance of the MyObject class and assigns it to the variable
                                     // "m"
        MyObject t = new MyObject(); // Creates another instance of the MyObject class and assigns it to the variable
                                     // "t"

        System.out.println(m.toString()); // Prints the string representation of the object "m" using the overridden
                                          // toString() method
        System.out.println(m.hashCode()); // Prints the hash code of the object "m" using the overridden hashCode()
                                          // method

        System.out.println(m.equals(t)); // Compares the objects "m" and "t" using the overridden equals() method and
                                         // prints the result

    }
}
