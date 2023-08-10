package F4_Generics.p4_BoundsOnGenerics;

public class p3_MethodGenerics {
    public static <T> void show(T[] list) {
        for (T x : list) {
            System.out.println(x);
        }
    }

    public static void main(String arg[]) {
        show(new String[] { "Hello", "Hi" });
        show(new Integer[] { 1, 3, 45, 6, 76 });
    }
}
