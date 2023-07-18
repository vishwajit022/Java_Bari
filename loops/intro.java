package loops;

public class intro {
    public static void main(String args[]) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 0, j = 1; i <= 10; i++, j = j * 2)
            System.out.println(i + " " + j);
    }
}
