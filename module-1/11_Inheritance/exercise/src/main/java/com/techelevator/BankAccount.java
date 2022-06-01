package com.techelevator;

public class BankAccount {
    private String accountHolderName; // Returns the account holder name that the account belongs to.
    private String accountNumber; // Returns the account number that the account belongs to.
    private int balance; // Returns the balance value of the bank account in dollars.

    public BankAccount(String accountHolderName, String accountNumber) {

        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        balance = 0;
    }

    public BankAccount(String accountHolderName, String accountNumber, int balance) {

        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }
   //getter

    public String getAccountHolderName() {
        return accountHolderName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }

    //methods

    public int deposit(int amountToDeposit) {
        balance += amountToDeposit; // adds a deposit to balance
        return balance;
    }
    public int withdraw(int amountToWithdraw) {
        balance -= amountToWithdraw; // subtracts a withdraw from balance
        return balance;
    }


}
