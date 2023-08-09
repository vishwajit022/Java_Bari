package F3_JavaIO.SF3_FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class p2_fileControlAccess {
    public static void main(String arg[]) throws FileNotFoundException {
        File f = new File("C:/Users/vishw/Documents/GitHub/Java_Bari/F3_JavaIO/SF3_FileHandling/data.txt");
        f.setReadOnly();
        // This method will not allow anyone to update the file
        // Error:- File not found exception (Access Denied)
        f.setWritable(true);
        // After adding the above it allows us to run the program without any errors
        System.out.println(f.lastModified());
        FileOutputStream fo = new FileOutputStream(
                "C:/Users/vishw/Documents/GitHub/Java_Bari/F3_JavaIO/SF3_FileHandling/data.txt");

    }
}
