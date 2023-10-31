import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a four digit number: ");
        int num = input.nextInt();
        if (num < 1000 || num > 9999) {
            System.out.println("Enter a valid number");
        } else {
            int revNum = revNum(num);
            if (num == revNum) {
                System.out.println("The given number " + num + " is a palindrome");
            } else {
                System.out.println("The given number " + num + " is not a palindrome");
            }
        }
    }
    public static int revNum(int Num) {
        int reversed = 0;
        while (Num != 0) {
            int digit = Num % 10;
            reversed = reversed * 10 + digit;
            Num /= 10;
        }
        return reversed;
    }
}
