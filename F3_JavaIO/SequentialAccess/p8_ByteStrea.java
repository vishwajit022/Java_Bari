package F3_JavaIO.SequentialAccess;

import java.io.*;

public class p8_ByteStrea {
    public static void main(String arg[]) {

        byte arr[] = { 'a', 'b', 'c', 'd' };
        ByteArrayInputStream bi = new ByteArrayInputStream(arr);
        // Byte array

        int a;
        while ((a = bi.read()) != -1) {
            System.out.print((char) a);
        }
    }
}
