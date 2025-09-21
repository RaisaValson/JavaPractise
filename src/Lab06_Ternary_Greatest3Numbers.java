public class Lab06_Ternary_Greatest3Numbers {
    public static void main(String[] args) {
        int a = 2;
        int b = 23;
        int c = -12;
        int greatestNum = (a > b) ? ((a>c) ? a:c) : ((b>c) ? b:c);
        System.out.println(greatestNum);
    }
}
