class Parent {
    public Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Child Constructor");
    }
}

class GrandChild extends Child {
    public GrandChild() {
        System.out.println("Grand Child Constructor");
    }
}

public class inheritanceConstructor {
    public static void main(String arg[]) {
        Child c = new Child(); // This will print both of the classes, first Parent constructor will execute,
                               // followed by Child constructor.

        // Note: We cannot create a Parent object using a Child class directly.

        System.out.println("Break                          :");

        Parent ch = new Parent(); // This will only print the Parent constructor.

        // Similarly, we are going to create one more object of GrandChild class.

        System.out.println(" ");

        GrandChild g = new GrandChild();

        // Here all the constructors will be printed in a hierarchical manner without
        // missing
        // out anyone. First, Parent constructor will execute, then Child constructor,
        // and finally
        // Grand Child constructor.
    }

}
