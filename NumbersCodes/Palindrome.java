package NumbersCodes;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        int digit;
        int temp = num;
        while (num != 0) {
            digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        if (num == temp) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }


        
// String palindrome =
        String str = "aba";
        if (isPalindrome(str)) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }
        sc.close();
    }

    public static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}