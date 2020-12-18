package edu.northeastern.mengzhe;

import java.util.HashSet;

public class Q6 {
    public static boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
              return find(root, k, set);
    }
    public static boolean find(TreeNode root, int k, HashSet<Integer> set){

                 if(null == root){
                         return false;
                     }

                 if(set.contains(k-root.val)){
                         return true;
                     }

                 set.add(root.val);

                 //对本树的左右节点进行判断，递归
                 return find(root.left, k, set) || find(root.right, k, set);
            }

    public static void main(String[] args) {
        TreeNode root= new TreeNode(5);
        root.left=new TreeNode(3);
        root.right=new TreeNode(6);
        root.left.left=new TreeNode(2);
        root.left.right=new TreeNode(4);
        root.right.right=new TreeNode(7);

        System.out.println(findTarget(root,9));
        System.out.println(findTarget(root,28));
    }
}
/**
 * Run Result

 true
 false

 *
 * ***/