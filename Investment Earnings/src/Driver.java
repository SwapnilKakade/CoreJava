import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the buying price per share: ");
        double buyingPrice = sc.nextDouble();
        int day = 1;
        double closingPrice = 0.1;
        double earnings;

        while(true){
            System.out.println("Enter the closing price for day: "+ day +" (enter any negative value to exit): ");
            closingPrice = sc.nextDouble();
            
            if(closingPrice < 0.0)
                break ;

            earnings = closingPrice - buyingPrice;

            if(earnings > 0){
                System.out.println("After day: "+ day +" , you earned: " + earnings + " per share ");
            } else if(earnings < 0.0){
                 System.out.println("After day: "+ day +" , you lost: " + (-earnings) + " per share ");
            } else {
                System.out.println("After day "+ day + ", you have no earnings per share ");
            }
            day += 1;
        }
        sc.close();
    }
}
