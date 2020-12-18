package edu.northeastern.mengzhe;

import java.util.ArrayDeque;
import java.util.Queue;

public class Q1 {
    public static boolean isSubPath(ListNode head, TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode tn = q.poll();
            if (tn.val == head.val && dfs(head, tn))
                return true;
            if (tn.left != null)  q.add(tn.left);
            if (tn.right != null) q.add(tn.right);
        }
        return false;
    }

    static boolean dfs(ListNode head, TreeNode root) {
        if (head == null)   return true;
        if (root == null)   return false;
        if (head.val != root.val)
            return false;
        return dfs(head.next, root.left) || dfs(head.next, root.right);
    }

    public static void main(String[] args) {
        ListNode head1= new ListNode(4);
        head1.next=new ListNode(2);
        head1.next.next=new ListNode(8);

        ListNode head2= new ListNode(1);
        head2.next=new ListNode(4);
        head2.next.next=new ListNode(2);
        head2.next.next.next=new ListNode(6);

        ListNode head3= new ListNode(1);
        head3.next=new ListNode(4);
        head3.next.next=new ListNode(2);
        head3.next.next.next=new ListNode(6);
        head3.next.next.next.next=new ListNode(8);

        TreeNode root = new TreeNode(1);
        root.left= new TreeNode(4);
        root.right= new TreeNode(4);
        root.left.right= new TreeNode(2);
        root.right.left= new TreeNode(2);
        root.left.right.left= new TreeNode(1);
        root.right.left.left= new TreeNode(6);
        root.right.left.right= new TreeNode(8);
        root.right.left.right.left= new TreeNode(1);
        root.right.left.right.right= new TreeNode(3);

        System.out.println(isSubPath(head1,root));
        System.out.println(isSubPath(head2,root));
        System.out.println(isSubPath(head3,root));

    }
}
/**
 * Run Result

 true
 true
 false

 *
 * ***/
