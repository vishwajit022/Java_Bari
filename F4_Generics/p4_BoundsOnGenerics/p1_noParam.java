package F4_Generics.p4_BoundsOnGenerics;

class MyArray<T> {
    T arr[];
    int length = 0;

    public MyArray(int capacity) {
        arr = (T[]) new Object[capacity];

    }

    public void append(T v) {
        arr[length++] = v;
    }

    public void display() {
        for (int i = 0; i < length; i++)
            System.out.println(arr[i]);

    }
}

public class p1_noParam {
    public static void main(String arg[]) {
        // Here in this program we aren't writing any < _ > Diamond brackets here
        MyArray ma = new MyArray(23);
        ma.append("Helllo");
        ma.append(21);
        ma.append("Ingole");
        ma.display();
        // here in this program we add Different data type elements in one single array
        // using generic without using <> brackets

    }
}
