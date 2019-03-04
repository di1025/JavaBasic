package com.chendi.training.algorithms;

public class DFSPathSum {

    public static boolean dfsSum(TreeNode node, int sum) {
        if (node == null) return false;
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

    public static boolean sumPath(TreeNode node, int sum) {
        if (node == null) return false;
        if (node.right != null || node.left != null) {
            sum -= node.value;
        } else {
            sum -= node.value;
            if (sum == 0) return true;
            if (sum != 0) return false;
        }
        return sumPath(node.left, sum) || sumPath(node.right, sum);
    }


 public static boolean sumP(TreeNode node, int sum){
        if(node==null) return false;
        if(node.left!=null||node.right!=null) sum-=node.value;
        else{
            sum-=node.value;
            if(sum==0) return true;
            else return false;
        }
        return sumP(node.left,sum)||sumP(node.right,sum);
 }
    public static boolean sumPath2(TreeNode root, int sum){
        if(root==null) return false;
        if(root.right!=null||root.left!=null){
            sum-=root.value;
        }
        else {
            sum-=root.value;
            if(sum==0) return true;
            if(sum!=0) return false;
        }
        return sumPath2(root.right,sum)||sumPath2(root.left,sum);
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

        System.out.println(sumPath(root,25));

        System.out.println(pathTotal(root,16));
    }

    public static boolean pathTotal(TreeNode node, int sum) {
        if(node==null) return false;
        if(node.right!=null||node.left!=null) sum-=node.value;
        else{
            sum-=node.value;
            if(sum!=0) return false;
            if(sum==0) return true;
        }
        return pathTotal(node.right,sum)||pathTotal(node.left,sum);
    }
}