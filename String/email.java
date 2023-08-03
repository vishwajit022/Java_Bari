public class email {
    public static void main(String args[]) {
        // Define the email address as a string
        String str = "programmer@gmail.com";

        // Find the index of the "@" symbol in the email address
        int i = str.indexOf("@");

        // Extract the username part of the email address using the substring method
        String uname = str.substring(0, i);

        // Extract the domain part of the email address using the substring method
        String domain = str.substring(i + 1, str.length());

        // Print the extracted username and domain
        System.out.println("Username:" + uname);
        System.out.println("Domain:" + domain);
    }
}
