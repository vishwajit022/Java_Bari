package OOPS;

class Super {
    void display() {
        System.out.println("Hello");
    }
}

class Sub extends Super {
    void display() {
        System.out.println("Hello World");
    }
}

public class overriding {
    public static void main(String arg[]) {
        Sub s = new Sub();
        s.display();
        // SInce sub class has it's own method display it will run it's own display
        // method

        Super su = new Super();
        su.display();
        // Obviously super is reference as well as object so it will run it's own
        // display

        Super sh = new Sub();
        sh.display();
        // Conclusion :- Method will be called depending upon the object not on the
        // refernce

    }
}
