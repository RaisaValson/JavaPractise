import java.util.Scanner;

public class Lab19_vowelorconsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        String input = sc.next();
        char c = input.charAt(0);
        if(c == 'a' || c=='A' || c=='e'|| c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U') {
            System.out.println("Character entered is vowel");
        }
            else{
                System.out.println("Character entered is a consonent");
            }
        }
    }

