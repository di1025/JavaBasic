package com.chendi.training.algorithms;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BFSLayerPrint {

    public static List<List<Integer>> treeLayer(TreeNode node){
        List<TreeNode> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> valueList = new ArrayList<>();

        list.add(node);
        valueList.add(node.value);

        while(list.size()>0){
            List<TreeNode> copy = new ArrayList(list);
            result.add(valueList);
            list = new ArrayList<>();
            valueList = new ArrayList<>();
            for (TreeNode n:copy){
                if (n.left!=null){ list.add(n.left); valueList.add(n.left.value);}
                if (n.right!=null){ list.add(n.right); valueList.add(n.right.value);}
            }
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
        System.out.println(treeLayer(root));
//        treeLayer(root);

    }

}
