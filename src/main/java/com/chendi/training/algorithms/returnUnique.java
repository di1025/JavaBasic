package com.chendi.training.algorithms;

import java.util.*;

public class returnUnique {
   public int[] arrayA = new int[]{4,3,2,7,8,2,3,1,3};

    public static List uniquelist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int a:arr){
            if(!set.contains(a)){
                set.add(a);
            }
        }

//        List<Integer> x = new ArrayList<Integer>(arrayA.asList(4, 3, 2, 7, 8, 2, 3, 1, 3));



        List<Integer> unique = new ArrayList<>(set);

        return unique;
    }
}