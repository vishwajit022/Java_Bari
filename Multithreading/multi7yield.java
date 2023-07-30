package Multithreading;

class Yield extends Thread {
    public void run() {
        int i = 0;
        while (true) {
            System.out.println("Class" + i++);
        }
    }
}

public class multi7yield {
    public static void main(String arg[]) {
        Yield y = new Yield();
        y.start();
        int i = 0;
        while (true) {
            System.out.println("Main" + i++);
            y.yield();
        }

    }

}
