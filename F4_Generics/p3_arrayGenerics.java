package F4_Generics;

class MyArray<T> {
    T[] A; // Declare an array of type T
    int length = 0;

    // Constructor to initialize the array
    public MyArray(int capacity) {
        // Object is the parent class of every other classes
        // here we won't be use it without typecasting
        // The type cast (T[]) is used to inform the compiler that we are treating this
        // Object array as an array of type 'T'.
        // This is necessary due to type erasure.
        // It's important to note that the type cast can lead to runtime issues if not
        // used carefully.
        A = (T[]) new Object[capacity];
    }

    public void append(T v) {
        A[length++] = v;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(A[i]);
        }
    }
}

public class p3_arrayGenerics {
    public static void main(String arg[]) {
        // MyArray<Integer> ma = new MyArray(10); // Provide capacity in constructor
        // ma.append(10);
        // ma.append(20);
        // ma.append(30);
        // ma.display(); // Add this line to display the elements

        MyArray ma = new MyArray(23);
        ma.append("Vishwajit");
        ma.append(Integer.valueOf(10));
        ma.append("Ingole");
        ma.display();
    }
}
