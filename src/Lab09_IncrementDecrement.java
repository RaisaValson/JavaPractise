public class Lab09_IncrementDecrement {
    public static void main(String[] args) {
//        Increment operator
        int a = 6;
        System.out.println(a);
        int b = ++a;
        System.out.println(b);
        System.out.println(a);
        int c = a;
        System.out.println(a);
        System.out.println(c);
        int d = a++;
        System.out.println(d);
        System.out.println(a);

//        Decrement operator

        int e =10;
        int f = --e;
        System.out.println(e);
        System.out.println(f);
        int g = e--;
        System.out.println(e);
        System.out.println(g);

        int arg= Integer.parseInt(args[0]);
        System.out.println(arg);

    }
}
