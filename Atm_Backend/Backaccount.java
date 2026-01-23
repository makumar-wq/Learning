abstract public class Backaccount {
    protected String owner ;
    protected double balance ;

    public Backaccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    
    // abstract void displayBalance();
    abstract void withdrawAmount(int amount);
    // abstract void depositAmount(int amount);
}
