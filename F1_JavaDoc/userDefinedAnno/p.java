package F1_JavaDoc.userDefinedAnno;

// Custom annotation MyAnno with two elements: name and project.
@interface MyAnno {
    String name(); // Element 'name' of type String in the annotation.

    String project(); // Element 'project' of type String in the annotation.
}

// Main class p
@MyAnno(name = "Vishwa", project = "blurb")
public class p {
    // This class is annotated with the custom annotation MyAnno, providing values
    // for its elements.

    // Main method with a single parameter of type String.
    public static void main(String s) {
        // Local variable 'a' of type int.

        @MyAnno(name = "Vishwajit", project = "p")
        int a;

        // However, in Java, annotations on local variables are not commonly used and
        // have limited practical usage.
        // Annotations are typically more useful when applied to classes, methods, or
        // fields to provide metadata.

    }
}
