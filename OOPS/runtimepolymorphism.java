import java.lang.*;

class Super {
    public void meth1() {
        System.out.println("Super Meth1");
    }

    public void meth2() {
        System.out.println("Super meth2");
    }
}

class Sub extends Super {
    @Override
    public void meth2() {
        System.out.println("Sub Meth2");
    }

    public void meth3() {
        System.out.println("Sub meth3");
    }
}

public class runtimepolymorphism {
    public static void main(String arg[]) {
        // Create an instance of Sub class but store it in a reference of Super class
        Super s = new Sub();

        // Call methods using the reference of Super class

        s.meth1();
        // Output: "Super Meth1"
        // The meth1() method is in the Super class and not overridden in the Sub class,
        // so the Super class version is called.

        s.meth2();
        // Output: "Sub Meth2"
        // The meth2() method is overridden in the Sub class, so the Sub class version
        // is called.

        // s.meth3();
        // Compilation Error
        // The meth3() method is not present in the Super class, so we cannot call it
        // using the reference of the Super class. It can only be called using a
        // reference of the Sub class.

        // Note: In Java, the method that gets called is determined by the actual object
        // type at runtime, not the reference type. This is called runtime polymorphism
        // or dynamic method dispatch.
    }
}
