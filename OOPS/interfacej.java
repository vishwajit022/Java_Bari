package OOPS;

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
        // We can extend a class only once but we can implement a class multiplenumber
        // of times.
        Test t = new My();
        t.meth1();
        t.meth2();
        // t.meth3();
        // SImilarly like we did in inheritance here test class is used as reference and
        // Test class doesn't have meth3()
        // & that's why it will throw an exception thread

    }

}
