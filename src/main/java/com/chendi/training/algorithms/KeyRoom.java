package com.chendi.training.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class KeyRoom {

    public boolean visitRooms(List<List<Integer>> rooms){
        Stack<Integer> keys = new Stack<>();
        int[] opened= new int[(rooms.size())];
        opened[0]=1;
        for (int n:rooms.get(0)){
            keys.push(n);
            opened[n]=1;
        }


        while(keys.isEmpty()==false){
            int i = keys.pop();
            for(int r:rooms.get(i))
                if(opened[r]==0){
                    keys.push(r);
                    opened[r]=1;
                }

        }

//        for(int k:keys)
//            if(keys.size()!=0)
//                for (int r:rooms.get(k))
//                    if(opened[r]==0) {
//                        keys.push(r);
//                        opened[r] = 1;
//                    }

        for(int i:opened){
            if(i==0) return false;
        }
        return true;


    }


    public static void main(String []args){
        KeyRoom keyRoom= new KeyRoom();
        List<List<Integer>> rooms = new ArrayList<List<Integer>>();
        rooms.add(Arrays.asList(1,3));
        rooms.add(Arrays.asList(3,0,1));
        rooms.add(Arrays.asList(2));
        rooms.add(Arrays.asList());
//        System.out.println(rooms);
        System.out.println(keyRoom.visitRooms(rooms));

    }
}
