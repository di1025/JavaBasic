package com.chendi.training.algorithms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int current  = 1;
        for(int num: nums) {
            if(current == num) {
                current++;
            }
            else if(current < num) {
                return current;
            }
        }
        return current;
    }

    public static void main(String[] args) {
        int[] nums = new int []{1,2,3,4,7};
        FirstMissingPositive f = new FirstMissingPositive();
       System.out.println(f.firstMissingPositive(nums));
    }

}
