package com.chendi.training.practice;

public class CheckingAccountException extends Exception{
    private double amount;

    public CheckingAccountException(double amount){
        this.amount=amount;
    }

    public double getAmount(){
        return this.amount;
    }
}
