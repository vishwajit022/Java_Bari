package Multithreading;

class Display {
    synchronized public void show(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }

    }
}

class Thread1 extends Thread {
    Display d;

    public Thread1(Display d) {
        this.d = d;
    }

    public void run() {
        d.show("Hello World");
    }
}

class Thread2 extends Thread {
    Display d;

    public Thread2(Display d) {
        this.d = d;
    }

    public void run() {
        d.show("Welcome All");
    }
}

public class synchronization {
    public static void main(String arg[]) {
        Display d = new Display();
        Thread1 t = new Thread1(d);
        Thread2 th = new Thread2(d);
        t.start();
        th.start();

    }

}
