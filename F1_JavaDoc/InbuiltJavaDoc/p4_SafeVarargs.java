package F1_JavaDoc.InbuiltJavaDoc;

// Generic class My with a type parameter 'c'
class My<c> {
    // This annotation @SafeVarargs is used to suppress warnings related to using
    // varargs with generics safely.
    // Varargs (variable-length arguments) can cause potential heap pollution
    // warnings with generics.
    // @SafeVarargs annotation is used to indicate that the method is safe to use
    // with varargs and generics.
    @SafeVarargs
    private void show(c... t) {
        // The method takes a variable number of arguments (varargs) of type 'c' (the
        // generic type parameter).

        // Generic type argument 'c' is used as the type of elements in the varargs.

        // The for loop iterates through each element of the varargs 't'.
        for (c x : t) {
            // Inside the loop, 'x' represents each element in the varargs 't'.

            // The method is trying to print a variable 's', but 's' is not declared or
            // defined anywhere in the method.
            // It should instead print 'x' to display each element in the varargs 't'.
            System.out.println(x);
        }
    }
}

public class p4_SafeVarargs {
    public static void main(String arg[]) {
        // This is the main method, the entry point of the program.
        // However, there is no code inside the main method to execute.

        // To demonstrate the functionality of the My class, you can create an object of
        // My and call the show method:
        // My<Integer> myObj = new My<>();
        // myObj.show(1, 2, 3); // This will print: 1 2 3
        // The show method will accept varargs of type Integer and print each element in
        // the varargs.
    }
}
