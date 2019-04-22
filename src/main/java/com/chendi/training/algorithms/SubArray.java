package com.chendi.training.algorithms;

import java.util.Arrays;
import java.util.HashSet;

// if b is a's sub array
public class SubArray {
    public static boolean isSubArray(int[] A, int[] B, int n, int m) {
        int i = 0;
        int j = 0;
        if (n < m) return false;
        Arrays.sort(A);
        Arrays.sort(B);

        while(i<n&&j<m) {
            if (A[i] < B[j]) {
                i++;
            } else if (A[i] == B[j]) {
                i++;
                j++;
            } else if (A[i] > B[j]) {
                return false;
            }
        }
            if(j<m)
                return false;
            else
                return true;
    }

    public static boolean isSubset(int[] A, int[] B, int n, int m){
        HashSet hashSet = new HashSet();
        for(int a:A){
            if(!hashSet.contains(a)){
                hashSet.add(a);
            }
        }

        for(int b:B){
            if(!hashSet.contains(b))
                return false;
        }

            return true;

    }

    static boolean sub(int arr1[], int arr2[], int m,
                            int n)
    {
        HashSet<Integer> hset= new HashSet<>();

        // hset stores all the values of arr1
        for(int i = 0; i < m; i++)
        {
            if(!hset.contains(arr1[i]))
                hset.add(arr1[i]);
        }

        // loop to check if all elements of arr2 also
        // lies in arr1
        for(int i = 0; i < n; i++)
        {
            if(!hset.contains(arr2[i]))
                return false;
        }
        return true;
    }


    public static void main(String[] args) {


        int A[] = {2, 3, 0, 5, 1, 1, 2};
        int B[] = {3, 0, 5, 2, 1};
        int n = A.length;
        int m =B.length;

        if (isSubset(A, B, n, m))
            System.out.println("YES\n");
        else
            System.out.println("NO\n");
    }

}
