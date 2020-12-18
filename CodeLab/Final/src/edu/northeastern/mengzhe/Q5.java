package edu.northeastern.mengzhe;

public class Q5 {
    public static boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null && t == null) return true;
        if(s == null || t == null) return false;

          if(s.val == t.val) {
            if(isSameTree(s.left, t.left) && isSameTree(s.right, t.right)) return true;
        }


        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private static boolean isSameTree(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) return true;
        if(t1 == null || t2 == null) return false;
        if(t1.val != t2.val) return false;

        return isSameTree(t1.left, t2.left) && isSameTree(t1.right, t2.right);
    }


    public static void main(String[] args) {
        TreeNode s1= new TreeNode(3);
        s1.left=new TreeNode(4);
        s1.right=new TreeNode(5);
        s1.left.left=new TreeNode(1);
        s1.left.right=new TreeNode(2);

        TreeNode s2= new TreeNode(3);
        s2.left=new TreeNode(4);
        s2.right=new TreeNode(5);
        s2.left.left=new TreeNode(1);
        s2.left.right=new TreeNode(2);
        s2.left.right.left=new TreeNode(0);

        TreeNode t= new TreeNode(4);
        t.left=new TreeNode(1);
        t.right=new TreeNode(2);

        System.out.println(isSubtree(s1,t));
        System.out.println(isSubtree(s2,t));
    }
}
/**
 * Run Result

 true
 false

 *
 * ***/