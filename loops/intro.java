package loops; // Declares the package name "loops"

public class intro { // Defines a class named "intro"

    public static void main(String args[]) { // Main method, the entry point of the program

        // First for loop: Print numbers from 0 to 10
        for (int i = 0; i <= 10; i++) { // Start the loop from i=0 and iterate until i<=10
            System.out.println(i); // Print the value of 'i' in each iteration
            // The loop will print numbers 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 in separate
            // lines
        }

        // Second for loop: Print numbers from 0 to 10 along with their powers of 2
        for (int i = 0, j = 1; i <= 10; i++, j = j * 2) {
            // Start the loop from i=0 and j=1 and iterate until i<=10
            // In each iteration, 'i' will increase by 1, and 'j' will be multiplied by 2

            System.out.println(i + " " + j); // Print the values of 'i' and 'j' in each iteration
            // The loop will print pairs of numbers where the first number is from 0 to 10
            // (inclusive),
            // and the second number is the corresponding power of 2:
            // 0 1
            // 1 2
            // 2 4
            // 3 8
            // 4 16
            // 5 32
            // 6 64
            // 7 128
            // 8 256
            // 9 512
            // 10 1024
        }
    }
}
