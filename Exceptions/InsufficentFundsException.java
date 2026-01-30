package Exceptions;

public class InsufficentFundsException extends Exception {

    private double amount;

    public InsufficentFundsException(double amount){
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "You don't have enough money.";
    }

    public double getAmount() {
        return amount;
    }
}
