package F2_Lambda;

interface Mylambda {
    void display(String s);
}

public class p2_upperletterusingconstructor {
    public p2_upperletterusingconstructor(String s) {
        System.out.println(s.toUpperCase());
    }

    public static void main(String arg[]) {
        Mylambda l = p2_upperletterusingconstructor::new;
        l.display("Hello");

    }
}
