package F3_JavaIO.SF4_Serialization;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

//In previous program we saw that we use Integer.parseInt 
//inorder to retrieve the   information which is stored in the form of String how about if we store int as int float as float
//How easier it would be store and retrieve the data

class Student {
    String name;
    String dept;
    int roll;
}

public class p3_writeserialized {
    public static void main(String arg[]) throws Exception {
        FileOutputStream f = new FileOutputStream(
                "C:/Users/vishw/Documents/GitHub/Java_Bari/F3_JavaIO/SF4_Serialization/data2.txt");
        DataOutputStream d = new DataOutputStream(f);
        Student s = new Student();
        s.roll = 21;
        s.dept = "CS";
        s.name = "Vishwajit";

        d.writeUTF(s.name);
        d.writeUTF(s.dept);
        d.writeInt(s.roll);

    }
}
