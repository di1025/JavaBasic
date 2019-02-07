package com.chendi.training.algorithms;

public class DFSNodePrint {

    public static void dfsRecur(TreeNode node) {
        System.out.println(node.value);
        if (node.left != null) { dfsRecur(node.left);}
        if (node.right != null) { dfsRecur(node.right); }
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

        dfsPrint(root);
    }

    public static void dfsPrint(TreeNode n){
        System.out.println(n);
        if(n.left!=null){dfsPrint(n.left);}
        if(n.right!= null){dfsPrint(n.right);}
    }



}
