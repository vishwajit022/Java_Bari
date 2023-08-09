package F3_JavaIO.RandomAccess;

import java.io.*;

public class p1_intro {
    public static void main(String arg[]) throws Exception {
        // A B C D E F G H I J K L
        // Provide the correct file path and name
        String filePath = "C:/Users/vishw/Documents/GitHub/Java_Bari/F3_JavaIO/RandomAccess/data.txt";

        // rw represents that we are performing read and write operations
        RandomAccessFile r = new RandomAccessFile(filePath, "rw");

        // after every operation the pointer moves one step ahead
        System.out.println((char) r.read());
        System.out.println((char) r.read());
        r.write('d'); // Changes the value
        System.out.println((char) r.read());
        r.skipBytes(3); // skip bytes
        System.out.println(r.getFilePointer()); // G
        System.out.println((char) r.read());
        r.seek(1);
        System.out.println(r.getFilePointer() + 2); // 3

        r.close(); // Close the RandomAccessFile when you're done with it
    }
}
