package com.chendi.training.algorithms;


import java.util.*;

public class TreeNode {
   public Integer value;
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
           myQueue.offer(list);
           list = new ArrayList<>();
            for (TreeNode n: copy){
                if(n.left!=null){ list.add(n.left); }
                if(n.right!=null){ list.add(n.right); }
            }
//            for(int i=0;i<copy.size();i++){
//                if(copy.get(i).left!=null){ list.add(copy.get(i).left); }
//                if(copy.get(i).right!=null){ list.add(copy.get(i).right); }
//            }
       }
       System.out.println(myQueue);

       List<Integer> maxNums = new ArrayList<>();

       for(int i=0; i<myQueue.size();i++){
           List<TreeNode> queueList = myQueue.poll();
           for (TreeNode n:queueList){
               int temp = queueList.get(0).value;
               if(n.value>=temp){temp=n.value;}
               maxNums.add(temp);
           }
       }
       System.out.println(maxNums);
   }

   public static void maxNumbers(List<Integer> list){
       Integer temp = list.get(0);
       for (Integer i:list){
           if(i>temp){temp = i;}
       }
       System.out.println(temp);
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
       List<Integer> a =new ArrayList(Arrays.asList(1,2,9,4,5));
       maxNumbers(a);
   }
}