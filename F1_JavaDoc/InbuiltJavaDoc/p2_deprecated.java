package F1_JavaDoc.InbuiltJavaDoc;

class Oldclass {
    @Deprecated
    public void display() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Hi");
    }
}

public class p2_deprecated {
    @SuppressWarnings("Deprecation")
    public static void main(String arg[]) {
        Oldclass o = new Oldclass();
        o.display();
        // The program will give a warning
    }
}
