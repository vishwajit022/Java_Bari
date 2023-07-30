package Multithreading;

class Display extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            i = i + 1;

            System.out.println("Class" + i++);
            try {
                Thread.sleep(10000);
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
