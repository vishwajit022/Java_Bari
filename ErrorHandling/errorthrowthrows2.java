package ErrorHandling;

//It is compulsory to write throws Exception next to method so that control flow would know that at next phase the error is going to be handled
class NegativeDimensionException extends Exception {
    public String toString() {
        return "Dimensions of the Rectangle cannot be Negative or Zero";
    }
}
// Here we are extending Exception class

public class errorthrowthrows2 {
    static int meth1(int l, int b) throws Exception {
        if (l <= 0 || b <= 0) {
            throw new NegativeDimensionException();
        }

        return l * b;
    }

    static void meth2() throws Exception {
        meth1(10, -3);
    }

    public static void main(String arg[]) {
        try {
            meth2();
        } catch (NegativeDimensionException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
