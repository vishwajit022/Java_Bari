package String;

public class create {
    public static void main(String args[]) {
        String str1 = "Java Program";
        String str2 = new String("Java");

        String str3 = new String(str2);

        System.out.println(str2);
        System.out.println(str3);

        byte b[] = { 65, 66, 67, 68 };
        String str4 = new String(b);
        System.out.println(str4);
    }
}
