package loops;

import java.util.*;

public class fibo {
    public static void main(String args[]) {
        System.out.println("Enter a Number for printing fibnacci Series");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        for (int i = 1; i <= n; i++) {
            int c = a + b;
            b = a;
            a = c;
            System.out.println(c);

        }
    }
}
