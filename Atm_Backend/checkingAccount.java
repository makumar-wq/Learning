// package Atm_Backend;
// import Atm_Backend.Backaccount;
public class checkingAccount extends Backaccount {
    static private int creditLimit = 5000;
    
    public int amount ;
    // override the abstract methods
    public checkingAccount(String owner, double balance) {
        super(owner, balance);
    }

    @Override
    void withdrawAmount(int amount) {
        if(amount <= super.balance){
            if(amount <= creditLimit){
                super.balance -= amount;
                System.out.println("Withdrawal of " + amount + " successful. New balance: " + super.balance);
                return;
            }else{
                System.out.println("Amount exceeds credit limit");
                System.out.println("Withdrawal failed as your amount exceeds credit limit of " + creditLimit);
                return;
            }
        }else{
            System.out.println("Insufficient balance");
        }
    }
}
