package com.account;

public class Account {
    private int accountBalance;
    private int pin;

    public void depositMoney(int amountToBeDeposited) {
        if (amountToBeDeposited > 0)
            accountBalance += amountToBeDeposited;

    }

    public int getAccountBalance(){
        return accountBalance;
    }

    public void withdrawCash(int amountToWithdraw){
        if (amountToWithdraw <= accountBalance - 1000)
            accountBalance -= amountToWithdraw;
    }
    public void pinWithdrawal(int amountToWithdraw,int pin){
        if (pin == 2344 && amountToWithdraw <= accountBalance - 1000){
            this.pin = pin;
            accountBalance -= amountToWithdraw;
        }
    }



}
