package F4_Generics.p4_BoundsOnGenerics;

public class p4_boundsonMethodGeneric {
    public static <T extends Number> void show(T[] list) {
        for (T x : list) {
            System.out.println(x);
        }
    }

    public static void main(String arg[]) {
        show(new Integer[] { 1, 23, 4, 54, 3 });
        // show(new String[] { "F", "G" });
        // This will throw an error because the generice type it has been bound as an
        // integer

    }
}
