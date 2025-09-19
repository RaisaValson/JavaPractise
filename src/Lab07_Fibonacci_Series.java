public class Lab07_Fibonacci_Series {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=a+b;
        int i=0;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        while(i<=10){
            a=b;
            b=c;
            c=a+b;
            System.out.println(c);
            i++;
        }
    }
}
