package com.chendi.training.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {
    public int[] intersect(int[] A, int[] B){
        Arrays.sort(A);
        Arrays.sort(B);

        List<Integer> list = new ArrayList<Integer>();

        int indexA=0, indexB=0;
        while(indexA<A.length&&indexB<B.length){
            if(A[indexA]<B[indexB]){
                indexA++;
            }
            else if (A[indexA]>B[indexB]){
                indexB++;
            }
            else list.add(A[indexA]);
            indexA++;
            indexB++;
        }

        int [] result= new int[list.size()];
        int i=0;
        while(i<list.size()){
            result[i]=list.get(i);
            i++;
        }
        return result;

    }
}
