/**
 * This tests the BankAccountClass of Chapter 3.
 * @author Axvig
 */
public class BankAccountTester{

    /**
     * The main method calls some methods of the BankAccount class
     * to see whether they are working properly.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //let's create a few accounts and check things.
        BankAccount aliceAccount = new BankAccount();
        BankAccount bobAccount = new BankAccount(540.13);
        
        //make some deposites and withdrawals
        bobAccount.deposit(1000);
        aliceAccount.deposit(1600);
        aliceAccount.deposit(28.30);
        bobAccount.withdraw(987.14);
        
        //check to see whether our program gives expected results
        System.out.println("Alice has $" + aliceAccount.getBalance());
        System.out.println("Alice ought to have $1628.30");
        System.out.println("Bob has $" + bobAccount.getBalance());
        System.out.println("Bob ought to have $552.99");

        //check to see if interest is working
        BankAccount charlieAccount = new BankAccount();
        BankAccount dougAccount = new BankAccount(10000,0.06);
        charlieAccount.deposit(50);

        charlieAccount.addInterest();
        dougAccount.addInterest();
        
        System.out.println("Charlie has $" + charlieAccount.getBalance());
        System.out.println("Charlie ought to have $51.00");
        System.out.println("Doug has $" + dougAccount.getBalance());
        System.out.println("Doug ought to have $10,600");
        
        dougAccount.transferTo(charlieAccount, 15.20);

        System.out.println("Charlie has $" + charlieAccount.getBalance());
        System.out.println("Charlie ought to have $66.20");
        System.out.println("Doug has $" + dougAccount.getBalance());
        System.out.println("Doug ought to have $10,584.80");}

    }
    

