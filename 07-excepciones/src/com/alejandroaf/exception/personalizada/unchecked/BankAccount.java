package com.alejandroaf.exception.personalizada.unchecked;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new NegativeBalanceException("Fondos insuficientes...");
        }
        balance -= amount;
        System.out.println("Extracción exitosa!");
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount(500);
            account.withdraw(300);
            System.out.printf("Saldo: %f\n", account.getBalance());
            account.withdraw(300);
            System.out.printf("Saldo: %f\n", account.getBalance());
        } catch (NegativeBalanceException e ) {
            System.out.println(e.getMessage());
        }
    }
}
