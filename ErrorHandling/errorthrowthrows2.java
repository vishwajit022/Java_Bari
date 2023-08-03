package ErrorHandling; // Declares the package name "ErrorHandling"

// Custom exception class for handling negative dimensions
class NegativeDimensionException extends Exception {
    public String toString() {
        return "Dimensions of the Rectangle cannot be Negative or Zero";
    }
}

public class errorthrowthrows2 { // Defines a class named "errorthrowthrows2"

    static int meth1(int l, int b) throws Exception { // Defines a static method named "meth1" that takes two integers
                                                      // as parameters and throws an Exception
        if (l <= 0 || b <= 0) { // Checks if the dimensions (length or breadth) are less than or equal to zero
            throw new NegativeDimensionException(); // If dimensions are negative or zero, throw the custom exception
                                                    // "NegativeDimensionException"
        }

        return l * b; // If dimensions are valid, return the result of length * breadth
    }

    static void meth2() throws Exception { // Defines a static method named "meth2" that throws an Exception
        meth1(10, -3); // Calls the "meth1" method with arguments 10 and -3
    }

    public static void main(String arg[]) { // Main method, the entry point of the program

        try {
            meth2(); // Calls the "meth2" method, which may throw an Exception
        } catch (NegativeDimensionException e) { // Catches the custom exception "NegativeDimensionException"
            System.out.println(e); // Prints the custom error message returned by the "toString" method of
                                   // "NegativeDimensionException"
        } catch (Exception e) { // Catches any other exception that may occur during the execution
            System.out.println(e); // Prints the exception information to the console
        }
    }
}
