package com.chendi.training.algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

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
}






