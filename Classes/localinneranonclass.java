package Classes;

abstract class My {
    abstract void display();
}

class Outer {
    public void meth1() {
        My m = new My() {
            void display() {
                System.out.println("Hello");
            }
        };
        // Here we are writing ; after theend of body object class
    }
}

public class localinneranonclass {
    public static void main(String arg[]) {
        Outer o = new Outer();
        o.meth1();
    }
}
