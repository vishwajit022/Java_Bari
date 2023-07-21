package OOPS;

import java.util.*;
import java.lang.*;

abstract class Super {
    Super() {
        System.out.println("Super Class");
    }

    public void meth1() {
        System.out.println("Super Meth1");
    }

    abstract public void meth2();
}

class Sub extends Super {
    public void meth2() {
        System.out.println("Sub Meth2");
    }
}

public class abstractclass {
    public static void main(String args[]) {
        Super s = new Sub();// This will print Conctructor automatically
        s.meth1();// This will print Super Meth1
        s.meth2();// This will print Sub Meth2
    }
}
