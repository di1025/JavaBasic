package com.chendi.training.practice;

import com.chendi.training.Chips;

import java.util.Comparator;

public class ChipsWeightComparator implements Comparator<Chips> {

    public int compare(Chips c1,Chips c2){
        if(c1.getWeight()<c2.getWeight()) return -1;
        else if(c1.getWeight()>c2.getWeight()) return 1;
        else return 0;
    }


}
