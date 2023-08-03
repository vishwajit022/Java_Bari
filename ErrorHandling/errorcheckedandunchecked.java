package ErrorHandling; // Declares the package name "ErrorHandling"

class LowBalanceException extends Exception { // Defines a custom checked exception class named "LowBalanceException"
                                              // which extends the "Exception" class
    public String toString() { // Overrides the "toString" method of the "Exception" class
        return "Balance Should not be less than 5000"; // Returns a custom error message when the exception is converted
                                                       // to a string
    }
}

public class errorcheckedandunchecked { // Defines a class named "errorcheckedandunchecked"

    static void fun1() { // Defines a static method named "fun1"
        try {
            throw new LowBalanceException(); // Throws a custom checked exception "LowBalanceException"
        } catch (LowBalanceException e) { // Catches the custom checked exception "LowBalanceException"
            System.out.println(e); // Prints the custom error message returned by the "toString" method of
                                   // "LowBalanceException"
        }
    }

    static void fun2() { // Defines a static method named "fun2"
        fun1(); // Calls the "fun1" method
    }

    static void fun3() { // Defines a static method named "fun3"
        fun2(); // Calls the "fun2" method
    }

    public static void main(String[] args) { // Main method, the entry point of the program
        fun3(); // Calls the "fun3" method, triggering the chain of method calls and exception
                // handling
    }
}
