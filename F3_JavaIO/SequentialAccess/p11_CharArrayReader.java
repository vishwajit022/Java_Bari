package F3_JavaIO.SequentialAccess;

import java.io.*;

public class p11_CharArrayReader {
    public static void main(String arg[]) throws Exception {
        char c[] = { 'a', 'b', 'c', 'd' };
        CharArrayReader cr = new CharArrayReader(c);

        int x;
        while ((x = cr.read()) != -1) {
            System.out.println((char) x);
        }
    }
}
