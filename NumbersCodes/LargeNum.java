package NumbersCodes;
import java.util.Scanner;

public class LargeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers :");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 == n2) {
            System.out.println("Both are equal");
        } else {
            int largeNum = (n1 > n2) ? n1 : n2;
            System.out.println(largeNum + " is the large number");
        }
        sc.close();
    }
}
