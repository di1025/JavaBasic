package com.chendi.training;

public class Chips {
    int weight;
    String type;

    public Chips(int num, String t){ this.weight=num; this.type=t;};


    public int getWeight(){
        return this.weight;
    };

    public String getType(){
        return this.type;
    }

    public void vol(){
        System.out.println(this.weight );
    };


    public static void  main(String[] args){
        System.out.println("Hello foodie!");
        Chips sweet = new Chips(20,"Fried");
        Chips notSweet =new Chips(30,"Salty");
        System.out.println(sweet);
        int w = sweet.getWeight();
        System.out.println(w);
        String v =sweet.getType();
        System.out.println(v);
        sweet.vol();
        notSweet.vol();
    };


}
