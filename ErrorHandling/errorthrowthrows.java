package ErrorHandling;

public class errorthrowthrows {

    static int fun1() {
        return 10 / 0;
    }

    static void fun2() {
        fun1();

    }

    static void fun3() {
        fun2();
    }

    public static void main(String arg[]) {

        try {
            fun3();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}