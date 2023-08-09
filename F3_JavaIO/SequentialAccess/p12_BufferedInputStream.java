package F3_JavaIO.SequentialAccess;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class p12_BufferedInputStream {
    public static void main(String arg[]) throws Exception {
        // BufferedInputStream == BufferedReader
        FileInputStream fi = new FileInputStream("C:/Users/vishw/Documents/GitHub/Java_Bari/F3_JavaIO/p12_Buffer.txt");
        BufferedInputStream bi = new BufferedInputStream(fi);

        // Buffer area is a temporary memory area

        System.out.println("File: " + fi.markSupported());
        System.out.println("File: " + bi.markSupported());

        // Mark is only supported in Buffered Input Stream

        System.out.println((char) bi.read());
        System.out.println((char) bi.read());
        System.out.println((char) bi.read());
        bi.mark(20);
        System.out.println((char) bi.read());
        System.out.println((char) bi.read());
        System.out.println((char) bi.read());

        bi.reset();
        System.out.println((char) bi.read());
        System.out.println((char) bi.read());
        System.out.println((char) bi.read());

        // This shows that mark was holding values in it
    }
}
