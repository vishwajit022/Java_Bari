package ErrorHandling;

public class error {

    public static void main(String arg[]) {
        int a, b, c;
        a = 5;
        b = 0;
        try {
            c = a / b;
            System.out.println(c);

        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
        // It can be use to avoid risk of exception while user is using program

    }

}
