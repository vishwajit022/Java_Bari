package F3_JavaIO.SF4_Serialization;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Student {
    String name;
    int roll;
    String dept;

}

public class p2_read {
    public static void main(String arg[]) throws Exception {
        Student s = new Student();
        FileInputStream fi = new FileInputStream(
                "C:/Users/vishw/Documents/GitHub/Java_Bari/F3_JavaIO/SF4_Serialization/data.txt");
        BufferedReader b = new BufferedReader(new InputStreamReader(fi));
        // Buffered Reader:-InputStream cannot read
        // String for that we used Buffered Reader

        // Input Stream Reader:- In order to convert
        // the stream to a reader we used Input Stream Reader

        // BufferedReader helps reduce the number of actual read operations from the
        // file, which can improve performance when reading large amounts of data.
        // Additionally, using InputStreamReader ensures that the raw bytes from the
        // file are properly decoded into characters based on the specified character
        // encoding. This is particularly important to correctly interpret characters
        // from the file, especially when dealing with non-ASCII or non-UTF-8 encoded
        // files.

        s.dept = b.readLine();
        s.name = b.readLine();
        s.roll = Integer.parseInt(b.readLine());
        // This method is used to convert a string representation of an integer into an
        // actual integer value.

        System.out.println("Department: " + s.dept);
        System.out.println("Name: " + s.name);
        System.out.println("Roll no. " + s.roll);

    }
}
