package com.techelevator;

public class SavingsAccount extends BankAccount {



    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);

    }


    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    public int withdraw(int amountToWithdraw) {

        if (getBalance() - amountToWithdraw >= 150) { // and you have 150$
            return super.withdraw(amountToWithdraw);

        }

        if (getBalance() >= amountToWithdraw + 2) { // if you do have enough money
             return super.withdraw(amountToWithdraw + 2);
        }

        return getBalance();
    }

}

