package OOPS;

class Parent {
    public Parent() {
        System.out.println("Non-Parameterised Parent Const");
    }

    public Parent(int x) {
        System.out.println("Parametrised Parent Const");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Non-Parametrised Child Const");
    }

    public Child(int y) {
        System.out.println("Parametrised Child Const");
    }

    public Child(int a, int b) {
        super(b);// keyword which refers to super class(upper class)
        System.out.println("2 param Child");
    }
}

public class inheritanceParameterisedConst {
    public static void main(String arg[]) {
        Child c = new Child();// Non-param Child
        Child ch = new Child(20); // Non param Parent - Param Child

        Child chi = new Child(2, 20);// Param of Parent - 2 param Child
    }
}
