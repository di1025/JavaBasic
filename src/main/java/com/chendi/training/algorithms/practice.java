package com.chendi.training.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practice {

    public static void div3(){
        for (int i=1;i<100;i++){
            if(i%3==0)
            System.out.println(i+",");
        }
    }

    public static void div5(){
        for(int i=1;i<100;i++){
            if(i%5==0)
                System.out.println(i+",");
        }
    }

    public static void div35(){
        for(int i=1;i<100;i++){
            if(i%5==0&&i%3==0)
                System.out.println(i+",");
        }
    }


    public static int strInt(String s){
        return Integer.valueOf(s);
    }

    public static boolean sumUpTwo(int a, int b, int c){
        if(c==a+b){ return true; }
        else return false;
    }

    public static boolean comp(int a, int b, int c){
        if(b>a && c>b){
            return true;
        }
        else return false;
    }


//55
    public static void secToHour(int seconds){
        int secs = seconds%60;//remainder
        int mins = (seconds/60)%60;//seconds->min->remainder is mins left
        int hours = (seconds/60)/60;//seconds->mins->hours
        System.out.println(hours+":"+mins+":"+secs);
    }
//54
    public static boolean rightmost(int a, int b, int c){
        return (a%10==b%10)||(b%10==c%10)||(c%10==a%10);
    }

//    public static int divBetweenTwo(int a ,int b, int c){
//        int d=Math.abs(a-b);
//        if(d>0){
//
//        }
//    }


    //56//TODO

    public static int result(int x, int y, int p) {
        if (x%p == 0)
            return( y/p - x/p + 1);
        return(y/p - x/p);
    }

    //TODO 57

    public static String firstLetterCapital(String s) {
       String[] arr = s.split(" ");
       arr[0]=arr[0].substring(0,1).toUpperCase()+arr[0].substring(1);
       String str = Arrays.toString(arr);
       str = str.substring(1, str.length()-1).replace(",", "");
       return str;
    }

    public static void capitalToLower(String s){
        s=s.toLowerCase();
        System.out.println(s);
    }

    public static String penultimate(String s){
        String[] str = s.split(" ");
        return str[str.length-2];
    }


    public static String firstLettersCapital(String s){
        String [] arr =s.split(" ");
        StringBuffer b = new StringBuffer();
        for (String n:arr){
            b.append(Character.toUpperCase(n.charAt(0))).append(n.substring(1)).append(" ");
        }
        return b.toString().trim();
    }
//61
    public static String reverse(String s){
        s=s.trim();
        String result = "";
        char[] ch = s.toCharArray();
        for(int i=s.length()-1;i>=0;i--){
            result+=ch[i];
        }
        return result;
    }

    public int[] arrayA = new int[]{4,3,2,7,8,2,3,1,3};

    public List<Integer> dup(int[] array){
        int[] arrayB = new int[array.length+1];
        for (int i=0;i<array.length;i++){
            arrayB[array[i]]+=1;
        }
        List<Integer> result = new ArrayList<>();
        for (int i=0;i<arrayB.length;i++){
            if(arrayB[i]==3){
                result.add(i);
            }
        }
        return result;
    }
// return the n th value=(n-1)+(n-2)

    int sum;


    public int fibonacci(int n,Integer[] mem) {
        if (n == 0) {
            mem[0]=0;
            return 0;
        }
        if (n == 1) {
            mem[1]=1;
            return 1;
        }

        if (n <= mem.length) {
            if(mem[n-1]!=null) {
                return mem[n-1];
            }
        }

        sum = fibonacci(n - 1,mem) + fibonacci(n - 2,mem);
        mem[n]= sum;
        return sum;
    }



    public static void main (String []args){
//        div3();
//        System.out.println(" + ");
//        div5();
//        System.out.println(" + ");
//        div35();
//        System.out.println(" + ");
//        System.out.println(strInt("7"));
//        System.out.println( sumUpTwo(3,4,8));
//        System.out.println(comp(4,3,7));
//        secToHour(86399);
//        System.out.println(rightmost(21,30,95));
//        System.out.println(result(5,20,3));
 //       System.out.println(firstLettersCapital("the cat is cute!"));
//        practice p = new practice();
//        System.out.println(p.dup(p.arrayA));
//        Integer[] mem = new Integer[100+1];
//        System.out.println(p.fibonacci(100,mem));
//        System.out.println(firstLetterCapital("the cat is cute!"));
//        capitalToLower("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG");
//        System.out.println(penultimate("The quick brown fox jumps over the lazy dog."));
        System.out.println(reverse("reh"));
    }

}
