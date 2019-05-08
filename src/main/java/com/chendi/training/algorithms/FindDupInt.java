package com.chendi.training.algorithms;

import java.util.*;


public class FindDupInt {



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
//             int[] arrayA = new int[]{4,3,2,7,8,2,3,1,3};
//            practice p = new practice();
//            findD(arrayA);
//            System.out.println(findD(arrayA));
//            System.out.println(findDupMap(arrayA));
            int a= Integer.valueOf("5");
            Integer b = Integer.valueOf("12");
            System.out.println(a);
            System.out.println(b);

        }

        public static List<Integer> findDuplicated(int[] nums){
            int[] arr = new int[nums.length+1];
            for(int i=0;i<nums.length;i++){
                arr[nums[i]]++;
            }
            List dup = new ArrayList();
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=2) {dup.add(i);};
            }
            return dup;
        }

        public static List<Integer> findD(int[] nums){
            int[] arr = new int[nums.length+1];

            for(int n:nums){
                arr[n]++;
            }
            List<Integer> result = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                if(arr[i]>1) result.add(i);
            }
            return result;
        }

        public static Map<Integer,Integer> findDupMap(int[] num){
            int[] arr = new int[num.length+1];

            for( int n:num){
                arr[n]++;
            }
            Map<Integer,Integer> map = new HashMap<Integer,Integer>();

            for(int i=0;i<arr.length;i++){
                if(arr[i]>1){
                    map.put(i,arr[i]);
                }
            }

            for(Map.Entry<Integer,Integer> m:map.entrySet()){
                System.out.println(m.getKey()+": "+m.getValue());
            }
            return map;
        }


    }


