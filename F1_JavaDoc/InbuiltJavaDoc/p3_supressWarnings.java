package F1_JavaDoc.InbuiltJavaDoc;

// Import statement for List
import java.util.List;

// Main class
public class p3_supressWarnings {
    // Static List variable declared without specifying its type.
    // This can cause a warning as it is a raw type and not using generics.
    static List l;

    // This annotation @SuppressWarnings("unchecked") is used to suppress warnings
    // related to unchecked conversions.
    // In this case, it suppresses the warning that would occur when using a raw
    // type List without generics.
    @SuppressWarnings("unchecked")
    public static void main(String arg[]) {
        // Attempt to add an element to the List l, which is declared without specifying
        // its type (raw type).
        // This may cause unchecked conversion warnings since the List is not using
        // generics.
        // To fix this warning, use generics to specify the type of elements in the
        // List.
        l.add(10);
    }
}
