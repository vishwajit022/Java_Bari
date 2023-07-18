package Conditional;

import java.util.*;

public class switchDay {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("TUe");
                break;
            case 3:
                System.out.println("Wed");
                break;

            case 4:
                System.out.println("Thurs");
                break;

            case 5:
                System.out.println("Fri");
                break;

            case 6:
                System.out.println("Sat");
                break;

            default:
                System.out.println("Invalid Input");
                break;

        }
    }
}
