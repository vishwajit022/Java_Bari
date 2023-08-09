package F3_JavaIO.SF3_FileHandling;

import java.io.File;

public class p1_managingFiles {
    public static void main(String arg[]) throws Exception {
        File f = new File("C:/Users/vishw/Documents/GitHub/Java_Bari/F3_JavaIO/SequentialAccess");
        System.out.println(f.isDirectory());
        File list[] = f.listFiles();

        for (File i : list) {
            System.out.print(i.getName() + " ");
            System.out.println(i.getPath());
            System.out.println(i.getParent());

        }
    }
}
