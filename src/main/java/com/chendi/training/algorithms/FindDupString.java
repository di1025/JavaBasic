package com.chendi.training.algorithms;


import java.util.HashMap;
import java.util.Map;

public class FindDupString {

    public static void findDupLetter(String str){
        int[] count = new int[256];

        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }

        for(int i=0;i<256;i++){
            if(count[i]>1 && Character.isAlphabetic(i)){
                System.out.printf("%c, count = %d \n",i,count[i]);
            }
        }

    }

    public static void findDupL(String str){
        HashMap<Character,Integer> map= new HashMap<>();

        char[] charArray = str.toCharArray();

        for(char c:charArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            if (!map.containsKey(c)) {
                map.put(c, 1);
            }
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>1 && Character.isAlphabetic(entry.getKey())){
                System.out.println("letter: "+entry.getKey()+" appear: "+entry.getValue());
            }
        }
    }



    public static void main(String[] args)
    {
        String str = "test string";
//        findDup(str);
        findDupLetter(str);
        findDupL(str);
    }



}