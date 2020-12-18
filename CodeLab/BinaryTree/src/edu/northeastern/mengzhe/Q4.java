package edu.northeastern.mengzhe;

public class Q4 {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null) {
            return null;
        }

        int preL = preorder.length;
        int inL = inorder.length;

        if (preL != inL) {
           return null;
        }

            if (preL == 1) {
            return new TreeNode(preorder[0]);
        }

        return buildTree(preorder, 0, preL-1, inorder, 0, inL-1);
    }

    private static TreeNode buildTree(int[] preOrder, int preSta, int preEnd,
                                      int[] inOrder, int inSta, int inEnd) {
        if (preSta > preEnd || inSta > inEnd) {
            return null;
        }

        int rootVal = preOrder[preSta];

        int rootIdxInOrder = -1;
        for (int i=inSta; i<= inEnd; i++) {
            if (inOrder[i] == rootVal) {
                rootIdxInOrder = i;
                break;
            }
        }

        if (rootIdxInOrder < 0) {
            return null;
        }

        TreeNode root = new TreeNode(rootVal);

        if (preSta == preEnd && inSta == inEnd) {
            return root;
        }

        int leftTreeLen = rootIdxInOrder - inSta;

        int preIdxLeftTreeEnd = preSta + leftTreeLen;

        root.left = buildTree(preOrder, preSta+1, preIdxLeftTreeEnd,
                inOrder, inSta, rootIdxInOrder-1);
        root.right = buildTree(preOrder, preIdxLeftTreeEnd+1, preEnd,
                inOrder, rootIdxInOrder+1, inEnd);

        return root;
    }

    public static void main(String[] args) {
        int[] preOrder = {3,9,20,15,7};
        int[] inOrder = {9,3,15,20,7};
        buildTree(preOrder,inOrder);
    }

}

