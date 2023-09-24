/**
 * Objects of this class simulation a bank account.
 * @author Axvig
 */
public class BankAccount 
{
    /*
    instance variables include the current balance of the account.
    */
    public static final double DEFAULT_RATE = 0.02;

    private double balance;
    private int transactions;
    private double rate;
    
    /**
     * Constructs a bank account with a zero balance.
     */
    public BankAccount()
    {
        balance = 0;
        transactions = 0;
        rate = DEFAULT_RATE;
    }
     
    /**
     * Constructs a bank account with a given balance
     * @param initialBalance the initial balance
     */
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
        transactions = 0;
        rate = DEFAULT_RATE;
    }
    
    /**
     * Constructs a bank account with a given balance and custom rate.
     */
    public BankAccount(double initialBalance, double initialRate)
    {
        balance = initialBalance;
        rate = initialRate;
        transactions = 0;
    }

    /**
     * Deposits a given amount into the account.
     * @param amount the amount to be deposited
     */
    public void deposit(double amount)
    {
        balance = balance + amount;
        transactions += 1;
    }
    
    /**
     * Withdraws a given amount from the account.
     * 
     * 
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount)
    {
        balance = balance - amount;
        transactions = transactions + 1;
    }
    
    /**
     * Returns the current balance of the account.
     * @return balance:  the balance
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     * Gets value of transactions.
     */
    public int getTransactions()
    {
        return transactions;
    }

    /**
     * Add interest to account.
     */
    public void addInterest()
    {
        double interestToAdd = rate * balance; //local variable
        balance = balance + interestToAdd;
    }

    /**
     * Check interest rate
     */
    public double getRate()
    {
        return rate;
    }

    /**
     * Allows for transferring funds from one account to another.
     */
    public void transferTo(BankAccount otherAccount, double amt)
    {
        this.withdraw(amt);// take money out of account that called this method
        otherAccount.deposit(amt);// put money into the account specified in the parameters
    }
}
