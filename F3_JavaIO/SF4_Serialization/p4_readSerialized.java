package F3_JavaIO.SF4_Serialization;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class Student {
    String name;
    String dept;
    int roll;
}

public class p4_readSerialized {
    public static void main(String arg[]) throws IOException {
        Student s = new Student();
        FileInputStream f = new FileInputStream(
                "C:/Users/vishw/Documents/GitHub/Java_Bari/F3_JavaIO/SF4_Serialization/data2.txt");
        DataInputStream d = new DataInputStream(f);
        s.name = d.readUTF();
        s.dept = d.readUTF();
        s.roll = d.readInt();
        System.out.println("Name: " + s.name);
        System.out.println("Department  " + s.dept);
        System.out.println("Roll " + s.roll);

    }
}
