package loops;

import java.util.*;

public class factorial {
    public static void main(String arg[]) {
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;
        for (int i = 1; i <= a; i++) {
            b = b * i;

        }
        System.out.println(b);

    }
}
