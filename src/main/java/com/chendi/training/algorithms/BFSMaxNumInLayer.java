package com.chendi.training.algorithms;

import apple.laf.JRSUIUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSMaxNumInLayer {
    public static List<Integer> maxNumInLayer(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        queue.offer(root);
        while(queue.size()!=0){
            int temp=0;
            int queueSize= queue.size();
            for( int i=0;i<queueSize;i++){
                TreeNode node =queue.poll();
                if(node.value>=temp){
                    temp=node.value;
                }
                if(!(node.right==null)){
                    queue.offer(node.right);
                }
                if(!(node.left==null)){
                    queue.offer(node.left);
                }
            }
            result.add(temp);

        }
        return result;
    }

    public static List<Integer> maxInLayer(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        queue.offer(root);

        while(!(queue.size()==0)){
            int temp = 0;
            int queueSize = queue.size();

            for (int i=0;i<queueSize;i++){
                TreeNode node = queue.poll();
                if(node.value>=temp){
                    temp= node.value;
                }
                if(!(node.left==null)){
                    queue.offer(node.left);
                }
                if(!(node.right==null)){
                    queue.offer(node.right);
                }
                result.add(temp);
            }
        }
        return result;
    }

    public static List<List<Integer>> treeLayer(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();

        queue.offer(root);

        while(!(queue.size()==0)){
            List<Integer> temp = new ArrayList<>();
            int queueSize= queue.size();
            for(int i=0;i<queueSize;i++){
                TreeNode node = queue.poll();
                temp.add(node.value);
                if(!(node.right==null)){
                    queue.offer(node.right);
                }
                if(!(node.left==null)){
                    queue.offer(node.left);
                }
            }
            result.add(temp);

        }
        return result;
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
        System.out.println(maxNumInLayer(root));
        System.out.println(treeLayer(root));
//        treeLayer(root);

    }
}