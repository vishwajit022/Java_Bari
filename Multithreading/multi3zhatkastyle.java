package Multithreading;

public class multi3zhatkastyle extends Thread {

    // Why we don't write these methods as static why do we get error when we
    // declare it as static
    public void run() {
        while (true) {
            System.out.println("Run");
        }
    }

    public static void main(String arg[]) {
        multi3zhatkastyle m = new multi3zhatkastyle();
        m.start();
        while (true) {
            System.out.println("Main");
        }

    }

}
