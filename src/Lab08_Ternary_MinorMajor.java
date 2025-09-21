import java.util.Scanner;

public class Lab08_Ternary_MinorMajor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the person");
        int age = sc.nextInt();
        String ageGroup = ((age>= 18) ? ((age >= 60) ? "Senior citizen" : "Major"): "Minor");
        System.out.println(ageGroup);
    }
}
