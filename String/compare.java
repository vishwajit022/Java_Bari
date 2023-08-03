public class compare {
    public static void main(String args[]) {
        // Compare two string literals
        String str1 = "java";
        String str2 = "java";
        System.out.println(str1 == str2);
        // Output: true
        // Explanation: When comparing string literals, Java optimizes and reuses the
        // string objects if they have the same value. So, both str1 and str2 point to
        // the same "java" string literal in the string pool. Hence, the result is true.

        // Compare a string literal and a string object
        String a = "java";
        String b = new String("java");
        System.out.println(a == b);
        // Output: false
        // Explanation: When comparing a string literal and a string object created
        // using the `new` keyword, they are two different objects in memory. The `a`
        // variable points to the string literal in the string pool, whereas the `b`
        // variable points to a new string object created on the heap. Hence, the result
        // is false.
    }
}
