package F3_JavaIO;

//In this program we are going to merge two files and store them into a third file 
//We are going to get it in using Sequence output Stream

import java.io.*;

public class p7_mergecopy {
    public static void main(String arg[]) throws Exception {

        FileInputStream fi1 = new FileInputStream("C:/Users/vishw/Documents/GitHub/Java_Bari/F3_JavaIO/source1.txt");
        FileInputStream fi2 = new FileInputStream("C:/Users/vishw/Documents/GitHub/Java_Bari/F3_JavaIO/source2.txt");

        FileOutputStream fo = new FileOutputStream(
                "C:/Users/vishw/Documents/GitHub/Java_Bari/F3_JavaIO/Destination.txt");

        SequenceInputStream si = new SequenceInputStream(fi1, fi2);

        int b;
        while ((b = si.read()) != -1) {
            fo.write(b);
        }
    }
}
