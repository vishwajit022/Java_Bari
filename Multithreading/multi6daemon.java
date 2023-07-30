package Multithreading;

class My extends Thread {
    // My class: This is a subclass of Thread. It overrides the run() method, which
    // contains an infinite loop printing "Class" repeatedly.
    public void run() {
        while (true) {
            System.out.println("Class");
        }
    }
}

public class multi6daemon {
    public static void main(String arg[]) throws InterruptedException {
        My m = new My();
        m.setDaemon(true);
        m.setDaemon(true);
        // The setDaemon(true) method is called on the thread m. This sets the thread as
        // a daemon thread. Daemon threads are threads that run in the background and do
        // not prevent the JVM from exiting if all other non-daemon threads have
        // finished executing.
        m.start();
        // m.start();: The start() method is called on the thread m, which begins the
        // execution of the run() method in a separate thread.

        Thread mainThread = Thread.currentThread();
        // Thread mainThread = Thread.currentThread();: This line retrieves a reference
        // to the main thread (the thread executing the main() method).
        mainThread.join();
        // The join() method is called on the main thread. This means that the main
        // thread will wait for the m thread to complete before continuing its own
        // execution. However, since the m thread is a daemon thread, it will run
        // indefinitely. mainThread.join();

    }
}
