package Lang_Package;

public class lan1 {
    public static void main(String arg[]) {
        Object o = new Object();
        // System.out.println(o);//
        // It will print the same thing

        // System.out.println(o.toString());
        // #one and the same thing

        Object o2 = o;
        // System.out.println(o.equals(o2));
        // True

        System.out.println(o.hashCode());
        // Some random number
    }
}
