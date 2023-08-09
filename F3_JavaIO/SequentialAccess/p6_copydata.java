package F3_JavaIO.SequentialAccess;

import java.io.*;

public class p6_copydata {
    public static void main(String arg[]) throws Exception

    {

        // File input stream for reading from the file
        FileInputStream fi = new FileInputStream("C:/Users/vishw/Documents/GitHub/Java_Bari/F3_JavaIO/source1.txt");
        // File output stream for writing inside the file
        FileOutputStream fo = new FileOutputStream("C:/Users/vishw/Documents/GitHub/Java_Bari/F3_JavaIO/source2.txt");

        // Uppercase alphabet is from 65 to 90
        // Lowercase alphabet is from 97 to 122

        int b;
        while ((b = fi.read()) != -1) {
            if (b >= 65 && b <= 90) {
                // Convert uppercase to lowercase by adding 32 and casting back to byte
                fo.write((char) (b + 32));
            }
            // Apart from uppercase letter all the letter or special characters will be
            // copied as it is
            else {
                fo.write(b);
            }
        }

        // Close the input and output streams to release resources

        fi.close();
        fo.close();
    }
}
