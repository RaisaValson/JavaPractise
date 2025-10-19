import java.util.Scanner;

public class Lab17_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = sc.nextInt();
        Boolean isLeapYear = false;
        if (year%400==0) {
            isLeapYear = true;
        }
           else if (year%100==0) {
                isLeapYear = false;
            }
           else if(year%4==0){
                isLeapYear = true;
        }
           else{
               isLeapYear = false;
        }
        System.out.println((isLeapYear == true) ? "Leap Year" : "Not a leap year");
        }

    }
