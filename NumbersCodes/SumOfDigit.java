package NumbersCodes;
import java.util.Scanner;

/**
 * SumOfDigit
 */
public class SumOfDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nummber");
        int num = sc.nextInt();

        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        System.out.println("Sum of digits: " + sum);
          sc.close();
    }
  
}