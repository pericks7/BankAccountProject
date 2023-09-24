public class MoneyMarketAccount {
        /*
    instance variables include the current balance of the account.
    */
   
    public static final double MM_DEFAULT_RATE = BankAccount.DEFAULT_RATE*2;

    private double MMbalance;
    private int MMtransactions;
    private double MMrate;
    
    /**
     * Constructs a Money Market account with a zero balance.
     */
    public MoneyMarketAccount()
    {
        MMbalance = 0;
        MMtransactions = 0;
        MMrate = MM_DEFAULT_RATE;
    }
     
    /**
     * Constructs a bank account with a given balance
     * @param initialBalance the initial balance
     */
    public MoneyMarketAccount(double MMinitialBalance)
    {
        MMbalance = MMinitialBalance;
        MMtransactions = 0;
        MMrate = MM_DEFAULT_RATE;}
    
    /**
     * Constructs a bank account with a given balance and custom rate.
     */
    public MoneyMarketAccount(double MMinitialBalance, double MMinitialRate)
    {
        MMbalance = MMinitialBalance;
        MMrate = MM_DEFAULT_RATE;
        MMtransactions = 0;
    }

    /**
     * Deposits a given amount into the account.
     * @param amount the amount to be deposited
     */
    public void MMdeposit(double amount)
    {
        MMbalance = MMbalance + amount;
        MMtransactions += 1;
    }
    
    /**
     * Withdraws a given amount from the account.
     * 
     * 
     * @param amount the amount to withdraw
     */
    public void MMwithdraw(double MMamount)
    {
        MMbalance = MMbalance - MMamount-5; // Charging $5 for withdrawal
        MMtransactions = MMtransactions + 1;
    }
    
    /**
     * Returns the current balance of the account.
     * @return balance:  the balance
     */
    public double MMgetBalance()
    {
        return MMbalance;
    }

    /**
     * Gets value of transactions.
     */
    public int MMgetTransactions()
    {
        return MMtransactions;
    }

    /**
     * Add interest to account.
     */
    public void MMaddInterest()
    {
        double MMinterestToAdd = MMrate * MMbalance; //local variable
        MMbalance = MMbalance + MMinterestToAdd;
    }

    /**
     * Check interest rate
     */
    public double MMgetRate()
    {
        return MMrate;
    }

    /**
     * Allows for transferring funds from one account to another.
     */
    public void transferTo(MoneyMarketAccount otherAccount, double amt)
    {
        this.MMwithdraw(amt);// take money out of account that called this method
        otherAccount.MMdeposit(amt);// put money into the account specified in the parameters
    }
}


