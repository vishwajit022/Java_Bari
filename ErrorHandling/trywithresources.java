package ErrorHandling; // Declares the package name "ErrorHandling"

import java.io.*; // Imports classes from the java.io package
import java.util.*; // Imports classes from the java.util package

public class trywithresources { // Defines a class named "trywithresources"

    static FileInputStream f; // Declares a static variable "f" of type FileInputStream
    static Scanner sc; // Declares a static variable "sc" of type Scanner

    static void Divide() throws Exception { // Defines a static method named "Divide" that may throw an exception

        // Attempt to open a FileInputStream for reading the file "my.txt"
        f = new FileInputStream("C:\\Users\\vishw\\Documents\\GitHub\\Java_Bari\\ErrorHandling\\my.txt");

        // Use the "try-with-resources" statement to automatically close the resources
        // (file and scanner)
        try (Scanner sc = new Scanner(f)) {

            // Read integers from the file and perform division operation
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a / b);
        } finally {
            // The "finally" block ensures that the resources are closed even if an
            // exception occurs
            f.close(); // Close the FileInputStream
            // Since the "Scanner" is declared within the try-with-resources block, it will
            // be automatically closed when the try block exits
        }
    }

    public static void main(String arg[]) { // Main method, the entry point of the program

        try {
            Divide(); // Calls the "Divide" method which may throw an exception
        } catch (Exception e) { // Catches any exception that occurs during the execution of the "Divide" method
            System.out.println(e); // Prints the exception information to the console
        }
    }

}
