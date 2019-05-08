package com.chendi.training.algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class smallestNumInTwoList {
    public int smallNumInlists(int[] A, int[] B) {
        int aSize = A.length;
        int bSize = B.length;

        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int a = 0; a < aSize; a++) {
            while (i < bSize && B[i] <= A[a])
                i++;
                if (B[i] == A[a]) {
                    return A[a];
            }

        }
        return -1;
    }

    public static int smallestNumInList(int[] A, int[] B){

        int asize = A.length;
        int bsize = B.length;

        Arrays.sort(A);
        Arrays.sort(B);

        int b=0;
        for (int a=0;a<asize;a++){
            while(b<bsize && B[b]<=A[a]){
                b++;
                if(B[b]==A[a]){
                    return B[b];
                }
            }
        }
        return -1;
    }

}
