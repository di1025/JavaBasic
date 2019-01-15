package com.chendi.training.algorithm;

import java.util.HashSet;
import java.util.Set;


public class AddingToASetForLoop {
    public static void main(String args[]) {
        int collection[] = {34, 22, 10, 60, 30, 22};
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 5; i++) {
            set.add(collection[i]);
        }
        if (collection.length == set.size()) {
            System.out.println("The collection is a set");
        } else System.out.println("The collection is not a set");
        System.out.println(set);
    }
}