package NumbersCodes;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range ");
        int num = sc.nextInt();

        int a = 0, b = 1;
        System.out.print(a + "," + b);
        for (int i = 2; i <= num; i++) {
          
            int temp = a + b;
            a = b;
            b = temp;
            System.out.print(","+temp);
        }
        sc.close();
    }
}
