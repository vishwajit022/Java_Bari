package Multithreading;

class Display extends Thread {
    Display(String name) {
        super(name);
    }

}

public class multi4constructor {
    public static void main(String arg[]) {
        Display d = new Display("Vishu");
        System.out.println("Thread Name: " + d.getName());
        System.out.println("Thread ID: " + d.threadId());
        System.out.println("Priority:" + d.getPriority());
    }
}
