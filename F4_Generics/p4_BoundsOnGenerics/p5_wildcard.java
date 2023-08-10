package F4_Generics.p4_BoundsOnGenerics;

class MyArray<T> {

    T arr[];
    int length = 0;

    public MyArray(int capacity) {
        // Changed to use an array of type T[] and casting to Object[].
        arr = (T[]) new Object[capacity];
    }

    public void append(T v) {
        arr[length++] = v;
    }

    public void display() {
        for (int x = 0; x < length; x++) {
            System.out.println(arr[x]);
        }
    }
}

class MyArray2<T> extends MyArray<T> {
    public MyArray2(int capacity) {
        super(capacity);
    }
}

public class p5_wildcard {

    public static void main(String arg[]) {
        // Specified the generic types for MyArray and MyArray2 instances.
        // MyArray<String[]> m = new MyArray<>(10);
        MyArray2 ma = new MyArray2<>(10);

        // Appending single elements to the arrays.
        // m.append(new String[] { "Jake", "Loren", "Rancho" });
        ma.append(new Integer[] { 10, 3, 45, 23 });

        // Displaying the elements in the arrays.
        // m.display();
        ma.display();
    }
}
