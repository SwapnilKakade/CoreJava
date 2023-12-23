package NumbersCodes;
import java.util.Scanner;

public class PrimeNumRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of prime numbers");
        int low = sc.nextInt();
        int high = sc.nextInt();

        for(int i = low; i < high; i++) {
            if(isPrime(i)){
                System.out.println(i + " ");
            }
        }
        sc.close();
    }
    public static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
