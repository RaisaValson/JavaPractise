import java.util.Scanner;

public class Lab11_GradeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        int gradeMark = mark/10;
        switch (gradeMark){
            case 10:
            case 9:
                System.out.println("Grade is A");
                break;
            case 8:
            System.out.println("Grade is B");
            break;
            case 7:
                System.out.println("Garde is C");
                break;
            case 6:
                System.out.println("Grade is D");
                break;
            default:
                System.out.println("Grade is E");
                break;
        };
    }
}
