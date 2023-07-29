package Multithreading;

class Display {
    public static void display() {
        while (true) {
            System.out.println("Class");
        }
    }
}
// Here we could either write the method either in main method CLASS or
// We could create a different class create and object for it so we could use it

public class multi1usingloops {

    public static void main(String arg[]) {
        Display d = new Display();

        d.display();
        // This will only print Class because the control won't get a chance to get into
        // main while loop
        while (true) {
            System.out.println("Main");
        }

    }

}
