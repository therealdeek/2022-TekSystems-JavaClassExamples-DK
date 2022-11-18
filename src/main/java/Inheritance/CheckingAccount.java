package Inheritance;

public class CheckingAccount extends BankAccount {

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        System.out.println("This is the checking account.");
    }
}
