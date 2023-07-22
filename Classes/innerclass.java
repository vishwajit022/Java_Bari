package Classes;

class Outer {
    class Inner {
        void Display() {
            System.out.println("Print Inner Class");
        }

    }

    void Display() {
        Inner i = new Inner();
        i.Display();

    }
}

public class innerclass {
    public static void main(String arg[]) {
        Outer o = new Outer();
        o.Display();
    }
}
