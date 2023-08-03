class Parent {
    public Parent() {
        System.out.println("Non-Parameterized Parent Constructor");
    }

    public Parent(int x) {
        System.out.println("Parameterized Parent Constructor");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Non-Parameterized Child Constructor");
    }

    public Child(int y) {
        System.out.println("Parameterized Child Constructor");
    }

    public Child(int a, int b) {
        super(b); // The 'super' keyword is used to refer to the superclass (parent class).
                  // It calls the parameterized constructor of the Parent class with the argument
                  // 'b'.
        System.out.println("Two-parameter Child Constructor");
    }
}

public class inheritanceParameterizedConst {
    public static void main(String arg[]) {
        Child c = new Child(); // This will call the non-parameterized Child constructor and print
                               // "Non-Parameterized Child Constructor".
        Child ch = new Child(20); // This will call the parameterized Child constructor with argument '20' and
                                  // print "Parameterized Child Constructor".
        Child chi = new Child(2, 20); // This will call the parameterized Parent constructor with argument '20' and
                                      // print "Parameterized Parent Constructor",
                                      // then call the two-parameter Child constructor and print "Two-parameter Child
                                      // Constructor".
    }
}
