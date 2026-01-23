import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //checkingAccount(String owner, double balance, int amount)
        Scanner sc = new Scanner(System.in);
        System.out.println("owner name : ");
        String owner = sc.nextLine();   
        System.out.println("balance : ");
        double balance = sc.nextDouble();
        System.out.println("amount : ");
        int amount = sc.nextInt();
        sc.close();
        Backaccount account = new checkingAccount(owner, balance);
        account.withdrawAmount(amount);
        Backaccount[] accounts = new Backaccount[2]; 
        //crearte two checkingAccount objects one as saving and one as checking
        accounts[0] = new checkingAccount("Alice", 10000);
        accounts[1] = new checkingAccount("Bob", 2000);
        // make a loop to withdraw amount from both accounts
        for(Backaccount acc : accounts){
            System.out.println("Withdrawing 3000 from " + acc.owner);
            acc.withdrawAmount(3000);
        }
    
    }
}