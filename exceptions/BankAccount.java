package exceptions;

public class BankAccount {
    private double balance;

    public BankAccount(double amount){
        this.balance=amount;
    }

    public void withdraw(double amount) throws InsufficentFundsException{
        if(amount> balance){
            throw new InsufficentFundsException(amount);
        }
        balance -= amount;
    }
}
