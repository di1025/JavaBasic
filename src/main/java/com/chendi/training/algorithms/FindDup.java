package com.chendi.training.algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FindDup {
    public int[] arrayA = new int[]{4,3,2,7,8,2,3,1,3};

    public List<Integer> dup(int[] nums){
        int[] arraySet = new int[nums.length+1];
        for(int i=0; i<nums.length;i++) {
            arraySet[nums[i]]+=1;
        }
        List result = new ArrayList();
        for(int i=0;i<arraySet.length;i++){
            if(arraySet[i]==3){
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> du(int[] array){
        int[] arrayB = new int[array.length+1];
        for (int i=0;i<array.length;i++){
            arrayB[array[i]]+=1;
        }
        List<Integer> result = new ArrayList<>();
        for (int i=0;i<arrayB.length;i++){
            if(arrayB[i]==2){
                result.add(i);
            }
        }
        return result;
    }


    public static void main(String []args){
        practice p = new practice();
        System.out.println(findDuplicated(p.arrayA));
    }

    public static List<Integer> findDuplicated(int[] nums){
    int[] arr = new int[nums.length+1];
    for(int i=0;i<nums.length;i++){
        arr[nums[i]]+=1;
    }
    List dup = new ArrayList();
    for(int i=0;i<arr.length;i++){
        if(arr[i]>=2) {dup.add(i);};
    }
    return dup;
    }


}
