import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        BankAccount A = new BankAccount("Swapnil", 1);
        A.showMenu();
    }
}

/**
 * Bank account
 */
class BankAccount {
    int balance;
    int previousTransaction;
    String CustomerName;
    int CustomerId;

    BankAccount(String cName, int cId) {
        CustomerName = cName;
        CustomerId = cId;
    }

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = amount;
        }
    }

    void previousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposit: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("withdraw: " + previousTransaction);
        } else {
            System.out.println("No previous transaction");
        }
    }

    void showMenu() {
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome " + CustomerName);
        System.out.println("Your ID is " + CustomerId + "\n");

        do {
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Previous Transaction");
            System.out.println("5. Exit");

            System.out.println("Enter your choice:");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Balance = " + balance + "\n");
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit:");
                    int depositAmount = sc.nextInt();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter the amount to withdraw:");
                    int withdrawAmount = sc.nextInt();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    previousTransaction();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option! Please enter again.\n");
                    break;
            }
        } while (option != 5);

        System.out.println("Thank you for using our services.");
    }
}
