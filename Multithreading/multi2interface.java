package Multithreading;

//Using Interface
// We use the keyword implements which indicates Interface was implemented
class My implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Class");
        }
    }
}

public class multi2interface {
    public static void main(String arg[]) {

        My m = new My();
        // We cannot directly access methods of a different class without creating an
        // object

        Thread t = new Thread(m);
        // We want to create thread because we want both of the processes to perform
        // parallely on after other.

        t.start();
        while (true) {
            System.out.println("Main");
        }

    }
}
