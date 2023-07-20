package OOPS;

class Parent {
    public Parent() {
        System.out.println("Parent Construct ");
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
        Child c = new Child(); // This will print both of the classes but first Parent class will execute
        // Child ch= new Parent();
        // We cannot create a parent class using a Child class
        // Two ways to create
        // 1: Child c = (Child) new Parent();
        // 2: Parent c = new Parent();
        // Tip:- Narrowing Broadening concept
        System.out.println("Break                          :");

        Parent ch = new Parent();

        // Similarly we are going to create one more Object of Grand child class

        System.out.println(" ");

        System.out.println(" ");

        System.out.println(" ");

        System.out.println(" ");

        GrandChild g = new GrandChild();

        // Here all the things will be printed in an heriarchial manner without missing
        // out anyone
    }

}
