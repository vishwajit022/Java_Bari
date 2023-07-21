package OOPS;

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
        Super s = new Sub();
        s.meth1(); // Super Meth1
        s.meth2(); // Sub Meth2
        // s.meth3();
        // Since we created s object instance using the reference of Super class
        // And Super class doesn't have meth 3 as a result we won't be able to utilise
        // the meth3 method

    }
}
