package Inheritance;

public class BankAccount {
    private double balance = 10.0;

    public void deposit(double amount) {
        balance = balance + amount;
    }
}
