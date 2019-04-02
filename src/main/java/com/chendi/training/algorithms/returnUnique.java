package com.chendi.training.algorithms;

import java.util.*;

public class returnUnique {
    public int[] arrayA = new int[]{4,3,2,7,8,2,3,1,3};

    public static List uniquelist() {

        List<Integer> x = new ArrayList<Integer>(Arrays.asList(4, 3, 2, 7, 8, 2, 3, 1, 3));

        Set<Integer> set = new HashSet<>(x);

        List<Integer> unique = new ArrayList<>(set);

        return unique;
    }
}