package F3_JavaIO;

import java.io.*;

public class p4_inputstream {
    public static void main(String arg[]) {
        try (FileInputStream f = new FileInputStream("C:/Users/vishw/Documents/GitHub/Java_Bari/F3_JavaIO/test.txt")) {

            // Create a byte array to hold the content of the file
            byte b[] = new byte[f.available()];

            // Read the content of the file into the byte array
            f.read(b);

            // Convert the byte array to a string
            String str = new String(b);

            /*
             * Round Brackets () for Strings:
             * In Java, a string is a sequence of characters. When you create a string or
             * call methods on a string, you use round brackets. For example, new String(b)
             * is creating a new string using the byte array b as its character data.
             * 
             * Square Brackets [] for Arrays:
             * Arrays in Java are used to store a collection of elements of the same type.
             * When you declare an array or access its elements, you use square brackets. In
             * the line byte b[] = new byte[f.available()];, you are declaring a byte array
             * named b and using square brackets to specify that it's an array. Later, b[i]
             * would be used to access the individual elements of the array.
             */

            // Print the content of the file
            System.out.println(str);

        } catch (IOException e) {
            // Print the stack trace if an IOException occurs
            e.printStackTrace();
        }
    }
}
