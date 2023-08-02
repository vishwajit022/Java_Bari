package Lang_Package;

enum Dept {
    CS, IT, ECE
}

public class lang6Enum {
    public static void main(String arg[]) { // Creating Object so that we could access it in Main method
        Dept a = Dept.CS;

        // Error we can't do that
        // Dept c=3;

        System.out.println(a.ordinal());
        System.out.println(a.name());

        // Storing Enum Dept to list
        Dept list[] = Dept.values();

        for (Dept x : list) {
            System.out.print(x + "\t");
        }

    }
}
