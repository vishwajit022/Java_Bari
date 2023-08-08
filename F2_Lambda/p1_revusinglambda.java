package F2_Lambda;

interface Lambda {
    public void display(String s);
}

public class p1_revusinglambda {
    public static void rev(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String arg[]) {
        Lambda m = p1_revusinglambda::rev;
        m.display("Hello");
    }
}
