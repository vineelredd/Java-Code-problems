
import java.util.Scanner;

public class ATM {
    private static double balance = 0;
    private static String receipt = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean running = true;

        while (running) {
            System.out.println("\n----- Bank Menu -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Print Receipt");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    printReceipt();
                    break;
                case 5:
                    running = false;
                    System.out.println("Thank you for using the bank!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }

    public static void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
        receipt += "Checked Balance: ₹" + balance + "\n";
    }

    public static void deposit(Scanner scanner) {
        System.out.print("Enter amount to deposit: ₹");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
            receipt += "Deposited: ₹" + amount + "\n";
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public static void withdraw(Scanner scanner) {
        System.out.print("Enter amount to withdraw: ₹");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
            receipt += "Withdrawn: ₹" + amount + "\n";
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public static void printReceipt() {
        System.out.println("\n--- Transaction Receipt ---");
        System.out.println(receipt.isEmpty() ? "No transactions yet." : receipt);
        System.out.println("Final Balance: ₹" + balance);
    }
}