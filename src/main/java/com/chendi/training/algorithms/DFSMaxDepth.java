package com.chendi.training.algorithms;

public class DFSMaxDepth {
    public static int maxDepth(TreeNode node){
        if(node==null){ return 0;}
        else
            return 1+Math.max(maxDepth(node.left),maxDepth(node.right));
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        TreeNode l = new TreeNode(5);
        root.left = l;

        TreeNode r = new TreeNode(9);
        root.right = r;

        TreeNode ll = new TreeNode(10);
        l.left = ll;

        TreeNode lr = new TreeNode(8);
        l.right = lr;

        TreeNode lrr = new TreeNode(9);
        lr.right = lrr;

        TreeNode rr = new TreeNode(7);
        r.right = rr;

        TreeNode rrr = new TreeNode(10);
        r.right.right = rrr;

        System.out.println(maxDepth(root)+"+ " +maxD(root));

    }

    public static int maxD(TreeNode n){
        if(n==null){return 0;}
        else{
            return 1+Math.max(maxD(n.left),maxD(n.right));
        }

    }

}
