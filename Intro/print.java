package Intro;

import java.lang.*;

public class print {

    public static void main(String args[]) {
        int x = 10;
        char v = 'v';
        float f = 10.2f;
        System.out.print("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.printf("Hello %d %c %f", x, v, f);

        String str = "Java";
        System.out.format("%2000s", str);

        // Using format I am able to gap between my Program /tab
    }

}
