package com.chendi.training.practice;

public class ForLoop {
    public static void main(String args[]){
        int [] numbers={1,2,3,4};
        String [] names={"a","b","c","d"};

        for (int x : numbers){
            System.out.println(x);
//            System.out.println(",");
        }
        System.out.println("\n");

        for (String n: names){
            System.out.println(n);
            System.out.println(",");
        }

    }

}
