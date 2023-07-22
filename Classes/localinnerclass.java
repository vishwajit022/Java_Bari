package Classes;

class Outer {
    void Display() {
        class Inner {
            void Display() {
                System.out.println("XYZ");
            }
        }
        Inner i = new Inner();
        i.Display();

    }
}

public class localinnerclass {
    public static void main(String arg[]) {
        Outer o = new Outer();
        o.Display();
    }
}
