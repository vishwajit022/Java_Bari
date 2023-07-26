package ErrorHandling;

public class error {

    public static void main(String arg[]) {
        int a, b, c;
        a = 5;
        b = 0;
        // It can be use to avoid risk of exception while user is using program

        try {
            c = a / b;
            System.out.println(c);

        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Division by zero");
        } catch (Exception e) {
            System.out.println(e);
        }

        // It is very important that we should write super classs of exception catch
        // block to write in the end or else the control flow won't get into sub catch

    }

}
