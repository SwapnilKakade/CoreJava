package NumbersCodes;
import java.util.Scanner;

public class LCMofNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int lcm = 0;

        int max = (num1 > num2) ? num1 : num2 ;

        for(int i = max ; i < num1 * num2 ; i++){
            if(num1 % i == 0 || num2 % i == 0){
                lcm = i;
            }
        }
        System.out.println(num1 + " and " + num2 + " Lcm is " + lcm);
        sc.close();
    }
}
