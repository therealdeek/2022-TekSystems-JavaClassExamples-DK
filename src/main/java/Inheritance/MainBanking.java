package Inheritance;

public class MainBanking {
    public static void main(String[] args) {

        CheckingAccount ca = new CheckingAccount();
        SavingsAccount sa = new SavingsAccount();

        ca.deposit(15);
        System.out.println("to checking " + ca);

        sa.deposit(10);
        System.out.println("to savings " + sa);



    }
}
