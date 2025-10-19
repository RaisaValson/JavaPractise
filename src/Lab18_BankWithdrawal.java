import java.util.Scanner;

public class Lab18_BankWithdrawal {
    public static void main(String[] args) {
        System.out.println("Enter the amount to withdraw");
        Scanner sc = new Scanner(System.in);
        double amountToWithdraw = sc.nextFloat();

        double balance = 10000;
        if (amountToWithdraw < balance && amountToWithdraw > 0 && amountToWithdraw % 100 == 0) {
            double currentBal = balance-amountToWithdraw;
            System.out.printf("Current balance is %5.2f", currentBal);
        }
        else{
            System.out.println("The amount entered doesnt match the criteria for withdrawal");
        }
    }
}


