package F1_JavaDoc.InbuiltJavaDoc;

class Parent {
    public void display() {
    }
}

class Child extends Parent {
    // THis annotation ensures that we are overriding the parent class or else it
    // will give an error
    @Override
    public void display() {
        System.out.println("Hello");
    }
}

public class p_1override {
    public static void main(String s) {

    }
}
