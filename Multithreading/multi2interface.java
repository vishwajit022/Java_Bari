package Multithreading;

//Using Interface

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
        Thread t = new Thread(m);
        t.start();
        while (true) {
            System.out.println("Main");
        }
    }
}
