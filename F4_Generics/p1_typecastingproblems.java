package F4_Generics;

public class p1_typecastingproblems {
    public static void main(String arg[]) {
        // Object is the Parent of all the classes so we can use an Object to create a
        // string
        Object o = new String("Hello");

        // The following line has issues, it should be:
        // o = Integer.valueOf(10);
        o = Integer.valueOf(10);

        // But when we wish to create a string using Object we get an error
        // Here we can use typecasting
        String str = (String) o;

        System.out.println(str); // Print the string

        // The above typecasting will cause a ClassCastException at runtime
        // because you're trying to cast an Integer object to a String, which is not
        // valid.
    }
}
