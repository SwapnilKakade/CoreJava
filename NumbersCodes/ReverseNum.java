package NumbersCodes;
import java.util.Scanner;

/**
 * ReverseNum
 */
public class ReverseNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();

        int rev = 0 ;
        int digit ;
        
        while (num != 0) {
            digit = num % 10 ;
            rev = rev * 10 + digit ;
            num /= 10 ;
        }
        System.out.println("The reverse number is "+ rev);
        sc.close();
    }
}