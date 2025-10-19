import java.util.Random;
import java.util.Scanner;

public class Lab12GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        Random random = new Random();
        int no = random.nextInt(101);
        System.out.println(no);
        int attempts = 0;

        while(true) {
            if(!sc.hasNextInt()) {
                System.out.println("Please enter a valid number");
                sc.next();
                continue;
            }
            int  guess = sc.nextInt();
            attempts++;
           if(guess < 0 || guess>100){
               System.out.println("Enter a number between 1 and 100");
           }
           if(guess < no){
               System.out.println("Too low, try again!!!");
           }
           else if(guess > no){
               System.out.println("Too high, try again!!!");
           }
           else
           {
               System.out.println("Correct in "+attempts+" attempts");
           }

         }
    }
}
