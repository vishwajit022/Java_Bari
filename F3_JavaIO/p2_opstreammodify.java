package F3_JavaIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class p2_opstreammodify {

    /*
     * However, this is not a common practice. Instead, it's usually better to
     * handle exceptions within the main method using try and catch blocks to
     * provide appropriate error handling. This is because exceptions that are
     * thrown from the main method might not be easily caught and handled by the
     * caller (the Java runtime in this case).
     * 
     * In general, it's good practice to handle exceptions as close to where they
     * occur as possible, rather than relying on higher-level methods (like main) or
     * the caller to handle them.
     */
    public static void main(String arg[]) throws Exception {
        // Create a FileOutputStream to write data to a file
        FileOutputStream f = new FileOutputStream("C:/Users/vishw/Documents/GitHub/Java_Bari/F3_JavaIO/test.txt");

        // The string to be written to the file
        String str = "Hey Everyone";

        // Convert the string to bytes
        byte b[] = str.getBytes();

        // Iterate through each byte in the byte array and write it to the file
        for (byte x : b)
            f.write(x);

        // Close the FileOutputStream to release system resources
        f.close();
    }
}
