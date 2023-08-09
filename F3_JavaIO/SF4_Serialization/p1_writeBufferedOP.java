package F3_JavaIO.SF4_Serialization;

import java.io.FileOutputStream;
import java.io.PrintStream;

class Student {
    int roll;
    String name;
    String dept;
}

public class p1_writeBufferedOP {
    public static void main(String arg[]) throws Exception {
        FileOutputStream fo = new FileOutputStream(
                "C:/Users/vishw/Documents/GitHub/Java_Bari/F3_JavaIO/SF4_Serialization/data.txt");

        // We don't have read method in FileOutput Stream
        // Here we created bridge for class properties to be stored/transferred into our
        // file
        PrintStream p = new PrintStream(fo);

        Student s = new Student();
        s.name = "Vishwajit";
        s.roll = 21;
        s.dept = "CSE";

        p.println(s.dept);
        p.println(s.name);
        p.println(s.roll);

    }
}
