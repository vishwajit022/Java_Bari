package Multithreading;

public class multi1usingloops {

    public static void display() {
        while (true) {
            System.out.println("Class");
        }
    }

    public static void main(String arg[]) {
        display();
        // This will only print Class because the control won't get a chance to get into
        // main while loop
        while (true) {
            System.out.println("Main");
        }

    }

}
