package com.chendi.training.algorithms;

import apple.laf.JRSUIUtils;

import java.util.*;

public class Treenodes {
    Integer value;
    Treenodes right;
    Treenodes left;

    public Treenodes(Integer root){this.value= root;}

    public static List<Integer> toQueue(Treenodes root) {
        List<Treenodes> list = new ArrayList<Treenodes>();
        Queue<List> myQueue = new ArrayDeque<List>();

        list.add(root);

        while (list.size() > 0) {
            List<Treenodes> copy = new ArrayList<Treenodes>(list);
            myQueue.offer(list);
            list = new ArrayList<>();

            for (Treenodes n : copy) {
                if (n.left != null) {
                    list.add(n.left);
                }
                if (n.right != null) {
                    list.add(n.right);
                }
            }
        }

        List<Integer> maxNums = new ArrayList<>();

        for(int i=0; i<myQueue.size();i++){
//        for(List<Treenodes> mylist:myQueue){
            List<Treenodes> queueList = myQueue.poll();
            int temp = queueList.get(0).value;
            for (Treenodes n:queueList){
                if(n.value>=temp){temp=n.value;}
            }
        }
        System.out.println(myQueue);
        return maxNums;

//        List<Integer> maxNumbers = new ArrayList<>();
//
//        for(List mylist:myQueue){
//            List<Treenodes> queueList = myQueue.poll();
//            for(Treenodes n:queueList){
//               int temp= queueList.get(0).value;
//               if(n.value>=temp){temp = n.value;}
//               maxNumbers.add(temp);
//            }
//
//        }
//        System.out.println(myQueue);
//        return maxNumbers;
    }

    public static void largestInTree(Treenodes root) {
        List<Treenodes> treeList = new ArrayList<Treenodes>();
        List<Treenodes> temp = new ArrayList<Treenodes>();
        temp.add(root);
        while (temp.size() > 0) {
            for (Treenodes n : temp) {
                treeList.add(n);
                List<Treenodes> copy = new ArrayList<Treenodes>(temp);
                temp = new ArrayList<>();
                if (n.right != null) { temp.add(n.right); treeList.add(n.right);}
                if(n.left!=null){temp.add(n.left);treeList.add(n.left);}
            }
        }
        System.out.println(treeList);

        int t = treeList.get(0).value;
        for(Treenodes n:treeList){
            if(n.value>t){t=n.value;}
        }

        System.out.println(t);
    }

    public static void main(String []args){
        Treenodes root = new Treenodes(1);
        Treenodes l = new Treenodes(3);
        root.left=l;
        Treenodes r = new Treenodes(7);
        root.right=r;
        Treenodes ll = new Treenodes(5);
        l.left=ll;
        Treenodes lr = new Treenodes(8);
        l.right=lr;
        Treenodes rl = new Treenodes(9);
        r.left=rl;
        Treenodes rr = new Treenodes(10);
        r.right=rr;
        System.out.println(toQueue(root));
        largestInTree(root);
    }
}
