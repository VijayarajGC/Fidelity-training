import java.util.Scanner;

class Account
{

    private int accountNo;
    private String name;
    private double balance;


    public Account(int accountNo, String name, double balance)
    {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }


    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
        else
        {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
        else if (amount > balance)
        {
            System.out.println("Insufficient balance!");
        }
        else
        {
            System.out.println("Withdrawal amount must be positive!");
        }
    }


    public void checkBalance()
    {
        System.out.println("Current Balance: " + balance);
    }


    public void displayAccountInfo()
    {
        System.out.println("Account No: " + accountNo);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account No: ");
        int accountNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        Account account = new Account(accountNo, name, balance);

        // Perform account operations based on user input
        int choice;
        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Information");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    account.displayAccountInfo();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        while (choice != 5);

        sc.close();
    }
}
