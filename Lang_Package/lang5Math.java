package Lang_Package; // Declares the package name "Lang_Package"

public class lang5Math { // Defines a class named "lang5Math"

    public static void main(String arg[]) { // Main method, the entry point of the program

        // Generate a random number between 0 and 9
        int a = (int) (Math.random() * 10); // Uses the Math.random() method to generate a random decimal number between
                                            // 0.0 (inclusive) and 1.0 (exclusive). Then, multiplies it by 10 and casts
                                            // it to an integer to get a random integer between 0 and 9.
        System.out.println(a); // Prints the randomly generated number.

        // Calculate the power of a number
        int b = (int) Math.pow(4, 2); // Uses the Math.pow() method to calculate the power of a number. In this case,
                                      // it calculates 4 raised to the power of 2, which is 16.
        System.out.println(b); // Prints the result of the power calculation, which is 16.

    }
}
