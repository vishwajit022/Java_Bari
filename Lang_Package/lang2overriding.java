package Lang_Package;

class MyObject {
    public String toString() {
        return "My Object is My Object none of your object";
    }

    public int hashCode() {
        return 10;
    }

    public boolean equals(Object o) {
        return this.hashCode() != o.hashCode();
        // return this.hashCode() == o.hashCode();
    }
}

public class lang2overriding {
    public static void main(String arg[]) {
        MyObject m = new MyObject();
        MyObject t = new MyObject();
        System.out.println(m.toString());
        System.out.println(m.hashCode());
        System.out.println(m.equals(t));
    }
}
