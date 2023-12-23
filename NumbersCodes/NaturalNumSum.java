package NumbersCodes;
import java.util.Scanner;

public class NaturalNumSum {

    // Sum of the natural numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the natural number range: ");
        int n = sc.nextInt();
        int sum = 0 ;
        for(int i = 0; i <= n; i++) {
            sum += i ;
        }
        System.out.println("Sum of the natural numbers is: " + sum);
        System.out.println();
        int add = getSum(n);
        System.out.println("Additon of the natural numbers is: " + add);
        sc.close();
    }
     
    public static int getSum(int n){
        if(n == 0) return n;
        
        return n + getSum(n - 1);
    }
}