import java.util.Scanner;

public class Lab13_NoOfWords {
    public static void main(String[] args) {
        System.out.println("Enter the sentence");
        Scanner sc = new Scanner(System.in);
        String senstence = sc.nextLine();
        String[] words = senstence.split(" ");
        System.out.println(words.length);
    }
}
