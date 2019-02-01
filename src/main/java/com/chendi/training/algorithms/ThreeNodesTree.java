package com.chendi.training.algorithms;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ThreeNodesTree {
   public int value;
   public ThreeNodesTree left;
   public ThreeNodesTree right;
   public ThreeNodesTree middle;

    public ThreeNodesTree(){}

    public ThreeNodesTree(int node){
        this.value=node;
    }

    public static void threeNodesTreeToQueue(ThreeNodesTree rootnode){
        List<ThreeNodesTree> list = new ArrayList<>();
        Queue<List> myQueue = new ArrayDeque<>();

        list.add(rootnode);

        while (list.size()>0){
            List<ThreeNodesTree> copy = new ArrayList<>(list);
            list = new ArrayList<>();

            for (ThreeNodesTree n: copy){
                if (n.left!=null){
                    list.add(n.left);
                }
                if(n.middle!=null){
                    list.add(n.middle);
                }
                if(n.right!= null){
                    list.add(n.right);
                }
            }
            myQueue.offer(list);
        }
    System.out.println(myQueue);
    }

    public static void main(String []args){
        ThreeNodesTree root = new ThreeNodesTree(1);
        ThreeNodesTree l = new ThreeNodesTree(2);
        ThreeNodesTree m = new ThreeNodesTree(3);
        ThreeNodesTree r = new ThreeNodesTree(4);
        ThreeNodesTree ll = new ThreeNodesTree(5);
        ThreeNodesTree lm = new ThreeNodesTree(6);
        ThreeNodesTree lr = new ThreeNodesTree(7);
        ThreeNodesTree ml = new ThreeNodesTree(8);
        ThreeNodesTree mm = new ThreeNodesTree(9);
        ThreeNodesTree mr = new ThreeNodesTree(10);
        ThreeNodesTree rl = new ThreeNodesTree(11);
        ThreeNodesTree rm = new ThreeNodesTree(12);
        ThreeNodesTree rr = new ThreeNodesTree(13);
        root.left=l;
        root.middle=m;
        root.right=r;
        l.left=ll;
        l.middle=lm;
        l.right=lr;
        m.left=ml;
        m.middle=mm;
        m.right=mr;
        r.right=rr;
        r.middle=rm;
        r.left=rl;
        threeNodesTreeToQueue(root);
    }


}
