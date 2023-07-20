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

public class inheritanceConstructor {
    public static void main(String arg[]) {
        Child c = new Child(); // This will print both of the classes
        // Child ch= new Parent();
        // We cannot create a parent class using a Child class
        // Two ways to create
        // 1: Child c = (Child) new Parent();
        // 2: Parent c = new Parent();
        // Tip:- Narrowing Broadening concept
        System.out.println("Break                          :");

        Parent ch = new Parent();

    }

}
