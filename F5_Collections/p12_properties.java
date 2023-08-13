package F5_Collections;

import java.util.*;
import java.io.*;

public class p12_properties {
    public static void main(String arg[]) throws Exception {
        Properties p = new Properties();
        // p.setProperty("Name", "Vishwajit");
        // p.setProperty("Language", "Marathi");
        // p.setProperty("Degree", "Computer Science");

        // p.storeToXML(new
        // FileOutputStream("C:/Users/vishw/Documents/GitHub/Java_Bari/F5_Collections/p_12prop.xml"),
        // "nothing");

        p.load(new FileInputStream("C:/Users/vishw/Documents/GitHub/Java_Bari/F5_Collections/p_12prop.xml"));
        System.out.println(p);
        System.out.println(p.getProperty("Name"));
    }
}
