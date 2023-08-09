package F3_JavaIO;

import java.io.*;

public class p9_ByteInputStreamReadAll {
    public static void main(String arg[]) throws Exception {
        byte b[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
        ByteArrayInputStream bi = new ByteArrayInputStream(b);

        String str = new String(bi.readAllBytes());
        System.out.println(str);
        System.out.println(bi.markSupported());
        // In array we can traverse and we can mark the element but in files we cannot
        // do that

        FileOutputStream fi = new FileOutputStream("C:/Users/vishw/Documents/GitHub/Java_Bari/F3_JavaIO/sample.txt");
        String s = "Array";
        fi.write(s.getBytes());
        // System.out.println(fi.markSupported());
        fi.close();

    }
}
