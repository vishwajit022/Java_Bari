package F4_Generics;

//We can store only one data in this type of class program

// Defining a generic class named Data that can hold objects of any type.
class Data<T> {
    private T obj; // The object of type T

    // Setter method to assign a value to the object
    public void setobj(T v) {
        obj = v;
    }

    // Getter method to retrieve the stored object
    public T getobj() {
        return obj;
    }
}

public class p2_introGenerics {
    public static void main(String arg[]) {
        // Creating an instance of the Data class with a specific type parameter (String
        // in this case)
        // Data<String> d = new Data();
        // // Assigning a value to the object within the Data instance
        // d.setobj("Vishwajit");

        // // Retrieving the stored value and printing it
        // System.out.print(d.getobj());

        Data<Integer> d = new Data();
        d.setobj(20);
        System.out.println(d.getobj());
    }
}
