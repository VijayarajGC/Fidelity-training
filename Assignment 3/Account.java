 import java.util.Scanner;
public class Account
{
    private int id;
    private String accounttype;
    private double balance;

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getAccounttype()
    {
        return accounttype;
    }
    public void setAccounttype(String accounttype)
    {
        this.accounttype=accounttype;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public Account(int id,String accounttype,double balance)
    {
        this.id=id;
        this.accounttype=accounttype;
        this.balance=balance;

    }
    public  boolean withdraw(double amount)
    {
        if(balance>=amount)
        {
            balance-=amount;
            return true;
        }
        else
        {
            return false;
        }
    }
    public String getDetails()
    {
        return "Account ID:"+id+"\nAccount type:"+accounttype+"\nBalance;"+balance;
    }
}

class Acconttype
{
    public static void main(String args[])
    {
        Account account = new Account(314567,"Savings",1000);
        System.out.println("Account details");
        System.out.println(account.getDetails());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw");
        double amount =scanner.nextDouble();
        if(account.withdraw(amount))
        {
            System.out.println("Withdraw Successful");
            System.out.println("New balance:"+account.getBalance());
        }
        else
        {
            System.out.println("No balance");
        }
    }
}

