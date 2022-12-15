package banksystem;

import java.util.*;

class BankAccount extends Exception {

    private double balance, withdraw, deposit;

    BankAccount(double balance) throws IllegalArgumentException {
        this.balance = balance;
        if (balance < 0) {
            throw new IllegalArgumentException("Invalid Balance!");
        }
    }

    public void Withdraw(double withdraw) throws IllegalArgumentException {
        this.withdraw = withdraw;
        System.out.println("Withdraw : " + withdraw);
        balance -= withdraw;
        System.out.println("Updated Balance : " + balance);
        if (withdraw > balance) {
            throw new IllegalArgumentException("You can't withdraw more than current balance.");
        }
    }

    public void Deposit(double deposit) throws IllegalArgumentException {
        this.deposit = deposit;
        System.out.println("Deposit : " + deposit);
        balance += deposit;
        System.out.println("Updated Balance : " + balance);
        if (deposit < 0) {
            throw new IllegalArgumentException("Invalid Deposit!");
        }
    }
}

public class BankSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Your Balance : ");
            double a = input.nextDouble();
            BankAccount obj = new BankAccount(a);

            System.out.print("Withdraw : ");
            double b = input.nextDouble();
            obj.Withdraw(b);

            System.out.print("Deposit : ");
            double c = input.nextDouble();
            obj.Deposit(c);

        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

    }

}
