package F2_Lambda;

@FunctionalInterface
interface Lambda {
    public void display(String s); // Functional interface with a single abstract method 'display'
}

public class p1_revusinglambda {
    public static void rev(String str) {
        StringBuffer sb = new StringBuffer(str); // Create a new StringBuffer with the input string
        sb.reverse(); // Reverse the content of the StringBuffer
        System.out.println(sb); // Print the reversed string to the console
    }

    public static void main(String arg[]) {
        Lambda m = p1_revusinglambda::rev; // Create a Lambda instance using a method reference to 'rev'
        m.display("Hello"); // Call the 'display' method of the Lambda instance with the string "Hello"
    }
}
