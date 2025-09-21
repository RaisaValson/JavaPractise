import java.util.Scanner;

public class Lab05_Ternary_OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int i = sc.nextInt();
        String odd_even = (i%2 == 0) ? "The entered number is even": "The entered number is odd";
        System.out.println(odd_even);
    }
}
