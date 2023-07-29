package Multithreading;

//Using Interface
// We use the keyword implements which indicates Interface was implemented
class My implements Runnable {

    // Writing run is must because using this we get to know that what we are going
    // to run thread
    // So when we start the thread compiler knows what are we looking for

    // Why we don't write these methods as static why do we get error when we
    // declare it as static

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
