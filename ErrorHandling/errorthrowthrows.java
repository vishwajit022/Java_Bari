package ErrorHandling; // Declares the package name "ErrorHandling"

public class errorthrowthrows { // Defines a class named "errorthrowthrows"

    static int fun1() { // Defines a static method named "fun1" which returns an integer
        return 10 / 0; // Attempting to divide by zero, which will cause an ArithmeticException to be
                       // thrown
    }

    static void fun2() { // Defines a static method named "fun2"
        fun1(); // Calls the "fun1" method
    }

    static void fun3() { // Defines a static method named "fun3"
        fun2(); // Calls the "fun2" method
    }

    public static void main(String arg[]) { // Main method, the entry point of the program

        try {
            fun3(); // Calls the "fun3" method, triggering the chain of method calls and exception
                    // handling
        } catch (Exception e) { // Catches any exception that occurs during the execution of the methods
            System.out.println(e); // Prints the exception information to the console
        }
    }

}
