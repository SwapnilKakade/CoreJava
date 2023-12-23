package NumbersCodes;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entet the number ");
        int num = sc.nextInt();
        if(isArmstrog(num)){
            System.out.println("Armstrog number");
        }else{
            System.out.println("Armstrog not number");
        }
        sc.close();
    }

    public static boolean isArmstrog(int num) {
        int temp = num;
        int sum = 0 ;
        int NoofDigit = String.valueOf(num).length() ;
 
        while (temp != 0) {
            int digit = temp % 10 ;
            sum  += Math.pow(digit, NoofDigit);
            temp = temp / 10 ;            
        }
        return sum == num ;
    }
}
