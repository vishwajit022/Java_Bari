package ErrorHandling;

import java.io.*;
import java.util.*;

public class trywithresources {

    static FileInputStream f;
    static Scanner sc;

   static void Divide() throws Exception{
   f=new FileInputStream("C:\Users\vishw\Documents\GitHub\Java_Bari\ErrorHandling\my.txt");

   // or if we don't want to go with hassle of closing the file then we can write  the above line in try(static FileInputStream f = new FileInputStream)
   try{
   sc=new Scanner(f);
   int a= sc.nextInt();
   int b=sc.nextInt();
   int c=sc.nextInt();
   System.out.println(a/b);
   }
finally{
   f.close();
   sc.close();
}
   }

    public static void main(String arg[]) {

        Divide();

        // TODO: handle exception
        System.out.println(e);

    }

}
