package Conditional;

import java.util.*;

public class leapyear {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if (y % 4 == 0 && y % 100 == 0 && y % 400 == 0) {
            System.out.println("The year is Leap year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
