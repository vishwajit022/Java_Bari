package Lang_Package; // Declares the package name "Lang_Package"

// Declare an enumeration named "Dept" to represent different departments
enum Dept {
    CS, // Represents the Computer Science department
    IT, // Represents the Information Technology department
    ECE // Represents the Electronics and Communication Engineering department
}

public class lang6Enum { // Defines a class named "lang6Enum"

    public static void main(String arg[]) { // Main method, the entry point of the program

        // Creating an object of the Dept enum and assigning it the value CS
        Dept a = Dept.CS; // Creates an object 'a' of the enumeration type 'Dept' and assigns it the value
                          // 'CS', representing the Computer Science department.

        // Error: We can't do that
        // Dept c=3;
        // Enumerations restrict values to the predefined constants (CS, IT, ECE) and do
        // not allow arbitrary integer values. The line 'Dept c=3;' would result in a
        // compilation error.

        // Print the ordinal value of the enum constant 'a'
        System.out.println(a.ordinal()); // The 'ordinal()' method returns the position of the enum constant in its
                                         // enumeration declaration. In this case, it will print 0 because CS is the
                                         // first constant (ordinal 0).

        // Print the name of the enum constant 'a'
        System.out.println(a.name()); // The 'name()' method returns the name of the enum constant as a string. In
                                      // this case, it will print "CS".

        // Storing Enum Dept values in an array
        Dept list[] = Dept.values(); // The 'values()' method returns an array containing all the enum constants of
                                     // the specified enum type 'Dept'.

        // Print the elements of the array containing Enum Dept values
        for (Dept x : list) { // Using a for-each loop to iterate through each enum constant in the array
                              // 'list'
            System.out.print(x + "\t"); // Prints each enum constant (CS, IT, ECE) followed by a tab.
        }

    }
}
