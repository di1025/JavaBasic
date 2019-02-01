package com.chendi.training.practice;


public class Factorial {
    public Factorial(){}
    public static long factorial(int a){
        if (a==1) return 1;
        return a*factorial(a-1);
    }

    public static void main (String [] args){
        System.out.println(Factorial.factorial(4));
    }
}
