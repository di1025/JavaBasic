package com.chendi.training.algorithms;

import java.util.*;

public class returnUnique {

    public static List uniquelist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int a:arr){
            if(!set.contains(a)){
                set.add(a);
            }
        }

        List<Integer> unique = new ArrayList<>(set);

        return unique;
    }

    public static void main(String []args){
        int[] arrayA = new int[]{4,3,2,7,8,2,3,1,3};
        System.out.println(uniquelist(arrayA));
    }

    public static List unique(int[] arr){
        Set<Integer> set = new HashSet<>();

        for(int a:arr){
            if(!(set.contains(a))){
                set.add(a);
            }
        }
        List result = new ArrayList(set);
        return result;
    }
}