package com.chendi.training.algorithms;

public class Fibonacci {
    public int fibonacci(int n, Integer[] mem) {

        if (n == 0) {
            mem[0] = 0;
            return 0;
        }
        if (n == 1) {
            mem[1] = 1;
            return 1;
        }

        if (n <= mem.length && mem[n] != null) {
            return mem[n];
        } else {
            mem[n] = fibonacci(n - 1) + fibonacci(n - 2);
            return mem[n];
        }
    }

    public static int fibonacci(int n) {//n is index
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        return result;
    }

    public int getFibonacci(int n) {//n is index
        int[] result = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            if (i == 0) {
                result[i] = 0;
            } else if (i == 1) {
                result[i] = 1;
            } else {
                result[i] = result[i - 1] + result[i - 2];
            }
        }
        return result[n];
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();

//        f.fibonacci(10, new Integer[10]);
//        System.out.println(f.getFibonacci(0));
        Integer[] mem = new Integer[11];
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(10));
        System.out.println(fftest(10));


//        System.out.println(pracF1(10));
    }

    public static int test1(int n) {// n is index
        if (n == 0) return 0;
        if (n == 1) return 1;
        int result = test1(n - 1) + test1(n - 2);
        return result;
    }

    public static int test2Loop(int n) {//n is index
        int[] result = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            if (i == 0) result[i] = 0;
            else if (i == 1) result[i] = 1;
            else result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }

    public int test3Mem(int n, Integer[] mem) {

        if (n == 0) {
            mem[0] = 0;
            return 0;
        }
        if (n == 1) {
            mem[1] = 1;
            return 1;
        }
        if (n < mem.length && mem[n] != null) {
            return mem[n];
        } else {
            mem[n] = test3Mem(n - 1, mem) + test3Mem(n - 2, mem);
            return mem[n];
        }
    }

    public static int ff(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            if (i == 0) result[i] = 0;
            else if (i == 1) result[i] = 1;
            else {
                result[i] = ff(i - 1) + ff(i - 2);
            }
        }
        return result[n];
    }

    public static int fftest(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else {int result = fftest(n - 1) + fftest(n - 2);
    return result;}
    }

    public static int ffrecursive(int n,Integer[] mem){

            if(n==0){mem[0]=0;return 0;}
            if(n==1){mem[1]=1;return 1;}
            if(n<=mem.length && mem[n]!=null){
                return mem[n];
            }
            else mem[n]=ffrecursive(n-1,mem)+ffrecursive(n-2,mem);
            return mem[n];
        }


    }



