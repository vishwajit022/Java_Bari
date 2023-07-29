package Multithreading;

class Display extends Thread {
    public void run() {
        while (true) {
            System.out.println("Class");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class multi5sleep {
    public static void main(String arg[]) {
        Display d = new Display();
        d.start();

    }

}
