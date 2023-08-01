package Lang_Package;

public class lang3wrapper {
    public static void main(String arg[]) {
        // int i=10;
        // Integer a= Integer.valueOf(10);
        // Integer b=10;

        // Byte c=15;
        // Byte d=Byte.valueOf("15");

        // //Boxing Method

        // byte bb=15;
        // Byte e=Byte.valueOf(bb);

        // short s=15;
        // Short ss =Short.valueOf(s);

        // float f=12.3f;
        // Float ff=Float.valueOf(f);

        // char gg = 'S';
        // Character g=Character.valueOf(gg);
        // //This how we create Object of Primitive Data types

        float f = 12.5f;
        Float h = Float.valueOf(f);
        float k = h;
        System.out.println(k);
        // Autoboxing

        int q = 20;
        Integer i = Integer.valueOf(q);
        int l = i;
        System.out.println(l);

        int m = 15;
        Integer n = Integer.valueOf(m);
        Integer o = 15;
        System.out.println(n.equals(o));
        // True

        Integer m1 = Integer.valueOf(12);
        Integer m2 = Integer.valueOf("1010", 2);
        System.out.println(m2);
        // We can use it to change binary to decimal

    }
}
