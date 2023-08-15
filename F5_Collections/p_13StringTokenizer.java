package F5_Collections;

import java.util.*;
import java.io.*;

public class p_13StringTokenizer {
    public static void main(String arg[]) {
        String data = "name=Vishwajit \n address=Pune \n country=India";
        StringTokenizer str = new StringTokenizer(data, ";");

        String s;

        while (str.hasMoreTokens()) {
            s = str.nextToken();
            System.out.println(s);
        }

    }
}
