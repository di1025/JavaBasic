package com.chendi.training.algorithms;

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


}
