public class AccountManager {

    private double balance = 0;
    
    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) throws BalanceInsufficentException {
        if (balance >= amount){
            balance -= amount;
        }else {
            throw new BalanceInsufficentException("Bakiye yetersiz");
        }
    }

    public double getBalance(){
        return balance;
    }

}