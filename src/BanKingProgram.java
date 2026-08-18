import java.util.Scanner;

public class BanKingProgram {

    static Scanner scanner = new Scanner(System.in);
    static double balance = 0;

    public static void main(String[] args) {

        boolean isRunning = true;

        while (isRunning) {

            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("**************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("**************");

            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    showBalance();
                    break;

                case 2:
                    deposit();
                    break;

                case 3:
                    withdraw();
                    break;

                case 4:
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        System.out.println("******");
        System.out.println("Thank you! Have a nice day!");
        System.out.println("******");

        scanner.close();
    }

    static void showBalance() {
        System.out.println("********");
        System.out.println("Your balance is: $" + balance);
        System.out.println("********");
    }

    static void deposit() {

        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Amount can't be negative or zero!");
        } else {
            balance += amount;
            System.out.println("Deposit successful!");
        }
    }

    static void withdraw() {

        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Amount can't be negative or zero!");
        }
        else if (amount > balance) {
            System.out.println("INSUFFICIENT FUNDS!");
        }
        else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        }
    }
}