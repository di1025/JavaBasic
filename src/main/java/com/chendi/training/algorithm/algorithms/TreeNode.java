package com.chendi.training.algorithm.algorithms;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
   public int value;
   public TreeNode left;
   public TreeNode right;

   public TreeNode(){}
   public TreeNode(int node){
       this.value=node;
   }

   public static void treeToQueue(TreeNode node){
       List<TreeNode> list = new ArrayList<TreeNode>();
       Queue<List> myQueue = new ArrayDeque<>();

       list.add(node);

       while (list.size()>0){
           List<TreeNode> copy = new ArrayList<>(list);
           list = new ArrayList<>();
            for (TreeNode n: copy){
                if(n.left!=null){
                    list.add(n.left);
                }
                if(n.right!=null){
                    list.add(n.right);
                }
            }

           myQueue.offer(list);
       }
       System.out.println(myQueue);
   }

   public static void main (String []args){
       TreeNode root = new TreeNode(1);
       TreeNode l = new TreeNode(3);
       root.left=l;
       TreeNode r = new TreeNode(7);
       root.right=r;
       TreeNode ll = new TreeNode(5);
       l.left=ll;
       TreeNode lr = new TreeNode(8);
       l.right=lr;
       TreeNode rl = new TreeNode(9);
       r.left=rl;
       TreeNode rr = new TreeNode(10);
       r.right=rr;
       treeToQueue(root);

   }


}