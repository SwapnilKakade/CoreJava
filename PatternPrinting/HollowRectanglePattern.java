package PatternPrinting;

import java.util.Scanner;
/**
 * HollowRectangle
 */
public class HollowRectanglePattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for(int i = 0; i <= num; i++) {
            for(int j = 0; j <= num; j++) {
                if ((i== 0 || i == num)||(j== 0 || j==num)) {
                     System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}