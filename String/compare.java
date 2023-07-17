package String;

public class compare {
    public static void main(String args[]) {
        String str1 = "java";
        String str2 = "java";
        System.out.println(str1 == str2);

        String a = "java";
        String b = new String("java");
        System.out.println(a == b);
        // False because references for both of the strings are different

    }
}
