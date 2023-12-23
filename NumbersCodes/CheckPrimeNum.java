package NumbersCodes;
import java.util.Scanner;

public class CheckPrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        if (isPrime(n)) {
            System.out.println("Number is prime ");
        } else {
            System.out.println("Number is not prime");
        }
        sc.close();
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return true;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
