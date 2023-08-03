interface Test {
    void meth1();

    void meth2();
}

class My implements Test {
    public void meth1() {
        System.out.println("Test Class from Meth1");
    }

    public void meth2() {
        System.out.println("Test Class from Meth2");
    }

    public void meth3() {
        System.out.println("Test Class from Meth3");
    }
}

public class interfacej {
    public static void main(String args[]) {
        // Interface allows us to achieve multiple inheritance in Java.
        // We can extend a class only once (single inheritance) but we can implement
        // multiple interfaces.

        // We create an object of the 'My' class but we refer to it using the reference
        // of the 'Test' interface.
        // This allows us to access only the methods defined in the 'Test' interface.

        Test t = new My(); // Creating an object of 'My' class but referring to it using the 'Test'
                           // interface reference.
        t.meth1(); // This calls the 'meth1()' method of the 'My' class and prints "Test Class from
                   // Meth1".
        t.meth2(); // This calls the 'meth2()' method of the 'My' class and prints "Test Class from
                   // Meth2".

        // t.meth3();
        // This line will cause a compilation error since the 'meth3()' method is not
        // defined in the 'Test' interface. The reference 't' of type 'Test' can only
        // access the methods declared in the 'Test' interface, not any other methods
        // that might be present in the 'My' class.
    }
}
