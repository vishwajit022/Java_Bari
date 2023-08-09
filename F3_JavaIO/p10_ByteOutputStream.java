package F3_JavaIO;

import java.io.*;

public class p10_ByteOutputStream {
    public static void main(String arg[]) throws Exception {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        bo.write('a');
        bo.write('b');
        bo.write('c');
        bo.write('d');

        // To print the elements on Terminal
        // byte[] str = bo.toByteArray();

        // int n = str.length;
        // for (byte x : str)
        // System.out.print((char) x);

        bo.writeTo(new FileOutputStream("C:/Users/vishw/Documents/GitHub/Java_Bari/F3_JavaIO/ByteArray1.txt"));

    }
}
