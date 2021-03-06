package com.chendi.training.algorithms;

import java.util.ArrayList;
import java.util.List;

public class DFSNodePrint {

    public static void dfsRecur(TreeNode node) {
        System.out.println(node.value);
        if (node.left != null) { dfsRecur(node.left);}
        if (node.right != null) { dfsRecur(node.right); }
    }



    public void dfsPrint(TreeNode node){
        System.out.println(node.value);
        if(node.left!=null) dfsPrint(node.left);
        if(node.right!=null) dfsPrint(node.right);
    }

    public static void main (String []args){
        TreeNode root = new TreeNode(1);

        TreeNode l = new TreeNode(5);
        root.left=l;

        TreeNode r = new TreeNode(9);
        root.right=r;

        TreeNode ll = new TreeNode(10);
        l.left=ll;

        TreeNode lr = new TreeNode(8);
        l.right=lr;

        TreeNode lrr = new TreeNode(9);
        lr.right=lrr;

        TreeNode rr = new TreeNode(7);
        r.right=rr;

        TreeNode rrr = new TreeNode(10);
        r.right.right=rrr;

        dfsRecur(root);
        DFSNodePrint dfsNodePrint = new DFSNodePrint();

        dfsNodePrint.dfsPrint(root);

        nodePrint(root);
    }

    public static void nodePrint(TreeNode node){
        System.out.println(node);
        if(node.left!=null) nodePrint(node.left);
        if(node.right!=null) nodePrint(node.right);
    }

}
