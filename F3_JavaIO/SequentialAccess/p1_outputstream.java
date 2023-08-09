package F3_JavaIO.SequentialAccess;

import java.io.*;

public class p1_outputstream {

    public static void main(String arg[]) {
        try {
            // Create a FileOutputStream to write data to a file
            FileOutputStream f = new FileOutputStream("C:/Users/vishw/Documents/GitHub/Java_Bari/F3_JavaIO/test.txt");

            // The string to be written to the file
            String str = "Learn Java Programming ";

            // Convert the string to bytes and write them to the file
            f.write(str.getBytes());
            f.close();

        } catch (Exception e) {
            System.out.print(e);
        } finally {
            System.out.println("Program Ran");
        }
    }
}
