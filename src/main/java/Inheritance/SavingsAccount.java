package Inheritance;

public class SavingsAccount extends BankAccount{

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        System.out.println("This is the savings account.");
    }
}
