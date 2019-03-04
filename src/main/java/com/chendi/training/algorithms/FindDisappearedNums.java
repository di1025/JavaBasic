package com.chendi.training.algorithms;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNums {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        for (int s : nums) {
            arr[s - 1] = s;
        }

        List ans = new ArrayList();

        for (int i=0;i<arr.length;i++)
            if (arr[i] == 0) {
                ans.add(i + 1);
            }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        FindDisappearedNums f = new FindDisappearedNums();
        System.out.println(f.findDisappearedNumbers(nums));

    }
}

