package F3_JavaIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class p2_intromodify {
    public static void main(String arg[]) throws Exception {

        FileOutputStream f = new FileOutputStream("C:/Users/vishw/Documents/GitHub/Java_Bari/F3_JavaIO/test.txt");
        String str = "Hey Everyone";
        byte b[] = str.getBytes();
        for (byte x : b)
            f.write(x);

        f.close();

    }
}
