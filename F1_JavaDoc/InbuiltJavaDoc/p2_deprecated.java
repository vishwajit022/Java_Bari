package F1_JavaDoc.InbuiltJavaDoc;

// Oldclass with two methods: display() and show()
class Oldclass {
    // This method is marked as @Deprecated, which means it is no longer recommended
    // to use.
    // Deprecated methods are still functional but might be removed in future
    // versions.
    @Deprecated
    public void display() {
        System.out.println("Hello");
    }

    // This is a regular method without any annotations.
    public void show() {
        System.out.println("Hi");
    }
}

// Main class
public class p2_deprecated {
    // This annotation @SuppressWarnings("Deprecation") is used to suppress warnings
    // related to deprecated elements.
    // In this case, it suppresses the warning that would occur when calling the
    // deprecated method display().
    @SuppressWarnings("Deprecation")
    public static void main(String arg[]) {
        // Create an object of the Oldclass
        Oldclass o = new Oldclass();

        // Call the display method, which is marked as @Deprecated
        o.display();
        // The program will give a warning due to the use of the deprecated method.

        // Call the show method, which is not marked as @Deprecated
        o.show();
    }
}
