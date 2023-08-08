package F3_JavaIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class p2_intromodify {
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
