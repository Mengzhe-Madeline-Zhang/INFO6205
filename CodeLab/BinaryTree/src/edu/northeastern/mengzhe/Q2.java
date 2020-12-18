package edu.northeastern.mengzhe;

public class Q2 {
    private static int sum;

    public static int findTilt(TreeNode root) {
        sum = 0;
        findSum(root);
        return sum;
    }

    public static int findSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int sumL = findSum(root.left);
        int sumR = findSum(root.right);
        sum += Math.abs(sumL - sumR);
        return sumL + sumR + root.val;
    }


    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(1);
        root1.left= new TreeNode(2);
        root1.right= new TreeNode(3);

        TreeNode root2 = new TreeNode(4);
        root2.left= new TreeNode(2);
        root2.right= new TreeNode(9);
        root2.left.left= new TreeNode(3);
        root2.left.right= new TreeNode(5);
        root2.right.right= new TreeNode(7);

        TreeNode root3 = new TreeNode(21);
        root3.left= new TreeNode(7);
        root3.right= new TreeNode(14);
        root3.left.left= new TreeNode(1);
        root3.left.right= new TreeNode(1);
        root3.right.left= new TreeNode(2);
        root3.right.right= new TreeNode(2);
        root3.left.left.left= new TreeNode(3);
        root3.left.left.right= new TreeNode(3);

        System.out.println(findTilt(root1));
        System.out.println(findTilt(root2));
        System.out.println(findTilt(root3));

    }
}
/**
 * Run Result

 1
 15
 9

 *
 * ***/
