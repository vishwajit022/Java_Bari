package F3_JavaIO;

import java.io.*;

public class p5_inputstreambitbybit {
    public static void main(String arg[]) {
        try {
            // Create a FileInputStream to read data from a file
            FileInputStream f = new FileInputStream("C:/Users/vishw/Documents/GitHub/Java_Bari/F3_JavaIO/test.txt");

            int x; // Variable to hold the read byte

            // Loop to read each byte from the file until the end is reached
            while ((x = f.read()) != -1) {

                /*
                 * In the context of reading from a file using Java's InputStream, the value -1
                 * serves as a sentinel value that indicates the end of the file has been
                 * reached. This is a common pattern in file reading operations. Let's break
                 * down why the -1 condition is used in the while loop:
                 */
                System.out.print((char) x);
            }

            // Close the FileInputStream to release system resources
            f.close();

        } catch (Exception e) {
            // Print the stack trace if an exception occurs
            e.printStackTrace();
        }
    }
}
