package F3_JavaIO.SF4_Serialization;

import java.io.*;

class Student implements Serializable {
    private String name;
    private int roll;
    private String dept;
    public static int data = 10;
    public transient int t = 10;

    // Non-parametrized constructor
    public Student() {

    }

    public Student(String name, String dept, int roll) {
        this.name = name;
        this.dept = dept;
        this.roll = roll;
        data = 500;
        t = 500;
    }

    public String toString() {
        return "\nStudent Details\n" +
                "Roll: " + roll + "\nName: " + name + "\nDept: " + dept + "\nData: " + data + "\nT: " + t;
    }
}

public class p6_readObjectSerialized {
    public static void main(String arg[]) throws Exception {
        FileInputStream f = new FileInputStream(
                "C:/Users/vishw/Documents/GitHub/Java_Bari/F3_JavaIO/SF4_Serialization/data3.txt");
        ObjectInputStream o = new ObjectInputStream(f);

        Student s = (Student) o.readObject();
        System.out.print(s);

        o.close(); // Close the ObjectInputStream
    }
}
