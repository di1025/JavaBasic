package com.chendi.training.algorithms;

import static com.chendi.training.algorithms.DFS.dfsRecur;

public class DFSPathSum {


    public static boolean dfsSum(TreeNode node, int sum) {

        if (node.left != null || node.right != null) {
            sum -= node.value;
        } else {
            sum -= node.value;
            if (sum ==0)
                return true;
            else
                return false;
        }
        return dfsSum(node.left, sum) || dfsSum(node.right, sum);
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
        System.out.println(dfsSum(root,16));

    }
}