package ErrorHandling;

public class errorzfinally {
    public static void main(String arg[]) {

        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            // No matter what happens the finally will block definitely execute
            System.out.println("Final Message");
        }
    }
}
