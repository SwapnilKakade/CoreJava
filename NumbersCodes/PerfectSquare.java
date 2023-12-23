package NumbersCodes;
import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

       if(isPerfectSquare(num)){
        System.out.println(num + " is perfect square number");
       }else{
        System.out.println(num + " is not perfect square number");
       }
       sc.close();
    }

    public static boolean isPerfectSquare(int num){
         for(int i = 1; i < num; i++) {
            if(i * i == num){
                return true;
            }
        }
        return false;
    }
}
