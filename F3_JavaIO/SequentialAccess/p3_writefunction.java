package F3_JavaIO.SequentialAccess;

import java.io.*;

public class p3_writefunction {
    public static void main(String arg[]) {
        try {
            // Create a FileOutputStream to write data to a file
            FileOutputStream f = new FileOutputStream("C:/Users/vishw/Documents/GitHub/Java_Bari/F3_JavaIO/test.txt");

            // The string to be written to the file
            String str = "Learn Java Programming";

            // Convert the string to bytes
            byte b[] = str.getBytes();

            // Write a portion of the byte array to the file, starting from index 6
            // and writing the length of the string minus 18 bytes
            f.write(b, 6, str.length() - 18);

            // Close the FileOutputStream to release system resources
            f.close();
        } catch (Exception e) {
            // Print any exceptions that occur during the process
            System.out.println(e);
        }
    }
}
