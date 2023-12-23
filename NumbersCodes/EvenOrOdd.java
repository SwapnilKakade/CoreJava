package NumbersCodes;
import java.util.Scanner;

public class EvenOrOdd {

    // checking whether the number is even or odd
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // using tenarray operator :

        String message = (num % 2 == 0) ? "Number is even" : "Number is odd";
        System.out.println(message);
        sc.close();
    }
}
