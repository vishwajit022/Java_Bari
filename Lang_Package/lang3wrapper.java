package Lang_Package; // Declares the package name "Lang_Package"

public class lang3wrapper { // Defines a class named "lang3wrapper"

    public static void main(String arg[]) { // Main method, the entry point of the program

        // The below code is commented out (multi-line comment) as it is not currently
        // being used
        // int i=10;
        // Integer a= Integer.valueOf(10);
        // Integer b=10;

        // Byte c=15;
        // Byte d=Byte.valueOf("15");

        // //Boxing Method

        // byte bb=15;
        // Byte e=Byte.valueOf(bb);

        // short s=15;
        // Short ss =Short.valueOf(s);

        // float f=12.3f;
        // Float ff=Float.valueOf(f);

        // char gg = 'S';
        // Character g=Character.valueOf(gg);
        // //This how we create Object of Primitive Data types

        float f = 12.5f; // Declares and initializes a float variable "f" with the value 12.5
        Float h = Float.valueOf(f); // Converts the float "f" into a Float object using the valueOf() method
        float k = h; // Unboxing: Converts the Float object "h" back to a float primitive

        System.out.println(k); // Prints the value of "k" which is 12.5
        // Autoboxing: The conversion of primitive data type into an object of the
        // corresponding wrapper class.

        int q = 20; // Declares and initializes an int variable "q" with the value 20
        Integer i = Integer.valueOf(q); // Converts the int "q" into an Integer object using the valueOf() method
        int l = i; // Unboxing: Converts the Integer object "i" back to an int primitive

        System.out.println(l); // Prints the value of "l" which is 20

        int m = 15; // Declares and initializes an int variable "m" with the value 15
        Integer n = Integer.valueOf(m); // Converts the int "m" into an Integer object using the valueOf() method
        Integer o = 15; // Integer literal 15 is autoboxed into an Integer object "o"

        System.out.println(n.equals(o)); // Compares the values of Integer objects "n" and "o" using the equals() method
                                         // and prints the result (true)

        Integer m1 = Integer.valueOf(12); // Creates an Integer object "m1" with the value 12
        Integer m2 = Integer.valueOf("1010", 2); // Creates an Integer object "m2" with the value 1010 in binary
                                                 // representation (10 in decimal)
        System.out.println(m2); // Prints the value of "m2", which is 10 (decimal)
        // We can use the valueOf() method to convert a binary string to its decimal
        // representation.

        float a = 12.5f; // Declares and initializes a float variable "a" with the value 12.5
        Float b = 12.5f / 0; // Creates a Float object "b" with the value of positive infinity
        System.out.println(b.isInfinite()); // Checks if the value of "b" is infinite and prints the result (true)

        float w = 12.5f; // Declares and initializes a float variable "w" with the value 12.5
        Float x = (float) Math.sqrt(a); // Creates a Float object "x" with the square root of "a"
        System.out.println(x); // Prints the value of "x"
        System.out.println(x.isNaN()); // Checks if the value of "x" is NaN (Not-a-Number) and prints the result
                                       // (false)

    }
}
