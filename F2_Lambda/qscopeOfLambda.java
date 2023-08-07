package F2_Lambda;

interface Mylambda {
    public void display();
}

class Obj {
    public void run() {
        int j = 10;
        Mylambda m = () -> {
            int a = 1;
            System.out.println("Hello" + ++j);
            // We cannot update the value which in same method or Lambda
        };
    }
}

public class qscopeOfLambda {

    public static void main(String arg[]) {
        Obj o = new Obj();
        o.run();
    }
}
