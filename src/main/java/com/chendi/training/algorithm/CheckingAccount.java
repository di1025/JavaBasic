package com.chendi.training.algorithm;

public class CheckingAccount {
    private double balance;

    private CheckingAccount(){
    }

    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount) throws CheckingAccountException{
        if (amount<=balance){
            balance-=amount;
        }else {
            double needs= amount - balance;
            throw new CheckingAccountException(needs);
        }

    }

    public double getBalance(){
        return balance;
    }

    public static void main (String [] args){
        CheckingAccount c = new CheckingAccount();
        c.deposit(1000);

        try{
        c.withdraw(600);
        c.withdraw(500);
    }catch (CheckingAccountException e ){
            System.out.println("Sorry, you are short $ "+e.getAmount());
            e.printStackTrace();
        }
    }



}
