package com.chendi.training;

public class Cup {
    int handlerNum;

    public Cup(int num, String lid){
        this.handlerNum = num;
    };

    public int getHandlerNum(){
        System.out.println("i am in getHandlerNum");
        return this.handlerNum;
    };

    public void pour(int lit){
        System.out.println("I have poured "+ lit + " water");
    };

    public static void main(String[] args){
        System.out.println("Hello World");
        Cup w = new Cup(6, "around");
        System.out.println(w);
        int hNum = w.getHandlerNum();
        System.out.println(w.getHandlerNum());
        w.pour(10);
    }


}

