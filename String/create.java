public class create {
    public static void main(String args[]) {
        // Create a string using a string literal
        String str1 = "Java Program";
        // The variable `str1` references a string literal "Java Program".

        // Create a string using the `new` keyword and a string literal
        String str2 = new String("Java");
        // The variable `str2` references a new string object on the heap with the value
        // "Java".

        // Create a string using the `new` keyword and another string object
        String str3 = new String(str2);
        // The variable `str3` references a new string object on the heap with the same
        // value as `str2`, which is "Java".

        System.out.println(str2);
        // Output: Java
        // The `str2` string object is printed, which contains the value "Java".

        System.out.println(str3);
        // Output: Java
        // The `str3` string object is printed, which contains the same value as `str2`,
        // which is "Java".

        // Create a string using a byte array
        byte b[] = { 65, 66, 67, 68 };
        String str4 = new String(b);
        // The variable `str4` references a new string object on the heap created from
        // the byte array, where each byte is converted to its corresponding ASCII
        // character.

        System.out.println(str4);
        // Output: ABCD
        // The `str4` string object is printed, which contains the characters 'A', 'B',
        // 'C', and 'D', corresponding to the bytes { 65, 66, 67, 68 } in the byte
        // array.

    }
}
