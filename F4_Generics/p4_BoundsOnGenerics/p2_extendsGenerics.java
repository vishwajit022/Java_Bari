package F4_Generics.p4_BoundsOnGenerics;

class MyArray<T> {
    T A[];
    int length = 0;

    public MyArray(int capacity) {
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

class MyArray2<T> extends MyArray<T> {

    public MyArray2(int capacity) {
        super(capacity);

    }

}

public class p2_extendsGenerics {
    public static void main(String arg[]) {
        MyArray2 m = new MyArray2(10);
        m.append("Vishwajit");
        m.append(21);
        m.display();
    }
}
