package com.chendi.training;

import com.chendi.training.practice.ChipsWeightComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Chips implements Comparable<Chips> {
    int weight;
    String type;

    public Chips(){};

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

//    public int compareTo(Chips c){
//        return c.weight-this.weight;//this-c is ascending; c-this is descending;
//    }

    public int compareTo(Chips c){
        return type.compareTo(c.getType()); // ascending
//        return c.getType().compareTo(type);//descending
    }


    public static void  main(String[] args){
//        System.out.println("Hello foodie!");
//        Chips sweet = new Chips(20,"Fried");
//        Chips notSweet =new Chips(30,"Salty");
//        System.out.println(sweet);
//        int w = sweet.getWeight();
//        System.out.println(w);
//        String v =sweet.getType();
//        System.out.println(v);
//        sweet.vol();
//        notSweet.vol();
        ArrayList<Chips> list = new ArrayList<Chips>();
        list.add(new Chips(3,"def"));
        list.add(new Chips(4,"abc"));
        list.add(new Chips(5,"feb"));
        Collections.sort(list);
        for (Chips c:list){
            System.out.println(c.getWeight()+" "+c.getType());
        }
        ChipsWeightComparator chipsWeightComparator = new ChipsWeightComparator();
        Collections.sort(list,chipsWeightComparator);
        for(Chips c:list){
            System.out.println(c.getWeight()+" "+c.getType());
        }


    };


}
