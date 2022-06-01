package com.techelevator;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountHolderName, String accountNumber) {
        // invoke the super class constructor on these two variables
        super(accountHolderName, accountNumber);
    }

    // constructor
    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        // invoke the super class constructor on these three variables
        super(accountHolderName, accountNumber, balance);
    }

    public int withdraw(int amountToWithdraw) {
        // if the balance is less than or equal to 100
        if (getBalance() <= -100) {

            return getBalance(); // return the balance
        }

        int balance = getBalance() - amountToWithdraw; // set balance equal to the amount in the account minus the withdraw

        if (balance > 0) {
            super.withdraw(amountToWithdraw); // if it's positive make the withdraw
        }


        if (balance < 0 && balance >= -100) { // if it's negative and greater than or equal to -100
            amountToWithdraw = amountToWithdraw - 10; // withdraw with the 10$ fee
            super.withdraw(amountToWithdraw); // go into the super class bank account and withdraw the amount to withdraw
        }

        return getBalance();

    }


}
