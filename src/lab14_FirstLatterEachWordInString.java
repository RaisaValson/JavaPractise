import java.util.Scanner;

public class lab14_FirstLatterEachWordInString {
    public static void main(String[] args) {
        System.out.println("Enter the sentence");
        Scanner sc = new Scanner(System.in);
        String[] words= sc.nextLine().split(" ");
        for(int i=0; i<words.length;i++){
            System.out.println(words[i].charAt(0));
        }
    }
}
