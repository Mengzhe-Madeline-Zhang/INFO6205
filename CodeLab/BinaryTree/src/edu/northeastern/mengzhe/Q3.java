package edu.northeastern.mengzhe;

public class Q3 {
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return null;
        if (t1 == null) return t2;
        if (t2 == null) return t1;
        TreeNode root = new TreeNode(t1.val + t2.val);
        root.left = mergeTrees(t1.left, t2.left);
        root.right = mergeTrees(t1.right, t2.right);
        return root;
    }

    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(1);
        t1.left= new TreeNode(3);
        t1.right= new TreeNode(2);
        t1.left.left= new TreeNode(5);

        TreeNode t2 = new TreeNode(2);
        t2.left= new TreeNode(1);
        t2.right= new TreeNode(3);
        t2.left.right= new TreeNode(4);
        t2.right.right= new TreeNode(7);

        mergeTrees(t1,t2);
    }
}
