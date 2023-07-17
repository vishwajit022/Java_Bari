package String;

public class email {
    public static void main(String args[]) {
        String str = "programmer@gmail.com";
        int i = str.indexOf("@");
        String uname = str.substring(0, i);
        String domain = str.substring(i + 1, str.length());
        System.out.println("Username:" + uname);
        System.out.println("Domain:" + domain);
    }
}
