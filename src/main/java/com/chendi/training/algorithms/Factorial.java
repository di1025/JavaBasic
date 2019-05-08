package com.chendi.training.algorithms;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Factorial {
    public static int fac(int n){
        if(n==0) return 1;
        else{
        int result= fac(n-1)*n;
        return result;
        }
    }
    public static void main(String[] arg){
       System.out.println(fac(4));
        LocalDateTime timePoint = LocalDateTime.now();     // The current date and time
       System.out.println(timePoint);
       System.out.println(LocalDate.of(2012, Month.DECEMBER, 1));
    }
}
