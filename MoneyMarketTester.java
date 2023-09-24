public class MoneyMarketTester {
    /**
 * This tests the MoneyMarketAccountClass
 * @author Axvig edited by Peter Erickson
 *
 */
 

 {MoneyMarketAccount MMaliceAccount = new MoneyMarketAccount();
    MoneyMarketAccount MMbobAccount = new MoneyMarketAccount(540.13);
    
    //make some deposites and withdrawals
    MMbobAccount.MMdeposit(1000);
    MMaliceAccount.MMdeposit(1600);
    MMaliceAccount.MMdeposit(28.30);
    MMbobAccount.MMwithdraw(987.14);
    
    //check to see whether our program gives expected results
    System.out.println("Alice has $" + MMaliceAccount.MMgetBalance());
    System.out.println("Alice ought to have $1628.30");
    System.out.println("Bob has $" + MMbobAccount.MMgetBalance());
    System.out.println("Bob ought to have $547.99ndfajsdk;lfjas;ldfjl;asjd;fja");

    //check to see if interest is working
    MoneyMarketAccount MMcharlieAccount = new MoneyMarketAccount();
   MoneyMarketAccount MMdougAccount = new MoneyMarketAccount(10000,0.06);
    MMcharlieAccount.MMdeposit(50);

    MMcharlieAccount.MMaddInterest();
    MMdougAccount.MMaddInterest();
    
    System.out.println("Charlie has $" + MMcharlieAccount.MMgetBalance());
    System.out.println("Charlie ought to have $51.00");
    System.out.println("Doug has $" + MMdougAccount.MMgetBalance());
    System.out.println("Doug ought to have $10,600");
    
    MMdougAccount.transferTo(MMcharlieAccount, 15.20);

    System.out.println("Charlie has $" + MMcharlieAccount.MMgetBalance());
    System.out.println("Charlie ought to have $66.20");
    System.out.println("Doug has $" + MMdougAccount.MMgetBalance());
    System.out.println("Doug ought to have $10,584.80");}
    }




