package com.chendi.training.algorithms;
import java.util.*;

public class distributeCandies {

    public int distributeCandies(int[] candies) {
        Set uniqueCandy =  new HashSet();
        for( int c:candies){
            uniqueCandy.add(c);
        }
        return Math.min(uniqueCandy.size(),candies.length/2);
    }
}

