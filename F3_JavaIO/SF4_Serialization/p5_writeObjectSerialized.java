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
        this.name = name; // Use 'this' to refer to instance variables
        this.dept = dept; // Use 'this' to refer to instance variables
        this.roll = roll; // Use 'this' to refer to instance variables
        data = 500;
        t = 500;
    }

    public String toString() {
        return "\nStudent Details\n" +
                "\nRoll" + roll + "\nName" + name + "\nRoll no." + roll + "Data: " + data + "T: " + t;
    }

}

public class p5_writeObjectSerialized {
    public static void main(String arg[]) throws Exception {

        FileOutputStream f = new FileOutputStream(
                "C:/Users/vishw/Documents/GitHub/Java_Bari/F3_JavaIO/SF4_Serialization/data3.txt");

        ObjectOutputStream o = new ObjectOutputStream(f);
        Student s = new Student("Vishwajit", "CS", 21);
        o.writeObject(s);

        o.close(); // Close the ObjectOutputStream
    }
}
