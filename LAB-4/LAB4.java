import java.util.Scanner;

public class LAB4 {
    
    static int accNumber;
    static String accName;
    static double accBalance;
    static String transactions = "";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        accNumber = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter account holder name: ");
        accName = sc.nextLine();
        System.out.println("Enter account balance: ");
        accBalance = sc.nextDouble();
        
        int choice;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Print transactions");
            System.out.println("4. Print account summary");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    depositMoney();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                case 3:
                    printTransactions();
                    break;
                case 4:
                    printAccountSummary();
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
        
        //Scanner.close();
    }
    
    public static void initializeCustomer(int accountNumber, String accountHolderName, double accountBalance) {
        accNumber = accountNumber;
        accName = accountHolderName;
        accBalance = accountBalance;
    }
    
    public static void depositMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println(".......................");
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid amount. Please try again.");
        } else {
            accBalance += amount;
            transactions += "Deposited: " + amount + "\n";
            System.out.println("Deposit successful.");
        }
    }
    
    public static void withdrawMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        System.out.println(".........................");
        double amount = sc.nextDouble();
        if (amount <= 0 || amount > accBalance) {
            System.out.println("Invalid amount. Please try again.");
        } else {
            accBalance -= amount;
            transactions += "Withdrawn: " + amount + "\n";
            System.out.println("Withdrawal successful.");
        }
    }
    
    public static void printTransactions() {
    
        System.out.println(".......................");
        System.out.println("Transactions:\n\n" + transactions);
        System.out.println("...........................");
    }
    
    public static void printAccountSummary() {
        System.out.println(".......................");
        System.out.println("Account Number: " + accNumber);
        System.out.println(".......................");
        System.out.println("Account Holder Name: " + accName);
        System.out.println(".......................");
        System.out.println("Account Balance: " + accBalance);
        System.out.println(".......................");
    }
}