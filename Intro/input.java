package Intro;

import java.util.*;

public class input {
    public static void main(String arg[]) {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.println(c);
    }
}