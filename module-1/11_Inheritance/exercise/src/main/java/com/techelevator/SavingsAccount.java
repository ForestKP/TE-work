package com.techelevator;

public class SavingsAccount extends BankAccount {



    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);

    }


    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    public int withdraw(int amountToWithdraw) {


        if (amountToWithdraw > getBalance()) { // if you don't have enough money return the account balance
            return getBalance();
        }

            if (getBalance() - amountToWithdraw < 150) { // and you have less than 150$
                super.withdraw(amountToWithdraw + 2); // withdraw the amount given + 2$
                return getBalance(); // return the balance
            }

         if (getBalance() >= amountToWithdraw) { // if you do have enough money

        }
        return super.withdraw(amountToWithdraw);
    }

}

