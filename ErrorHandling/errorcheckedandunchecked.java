
package ErrorHandling;

class LowBalanceException extends Exception {
    public String toString() {
        return "Balance Should not be less than 5000";
    }
}

public class errorcheckedandunchecked {
    static void fun1() {
        try {
            throw new LowBalanceException();
        } catch (LowBalanceException e) {
            System.out.println(e);
        }
    }

    static void fun2() {
        fun1();
    }

    static void fun3() {
        fun2();
    }

    public static void main(String[] args) {
        fun3();
    }
}

/*The exception `LowBalanceException` is a checked exception. Checked exceptions are those that need to be either caught or declared in the method signature using the `throws` keyword. In the given code, the `LowBalanceException` is caught in the `catch` block of the `fun1()` method, which makes it a checked exception.*/