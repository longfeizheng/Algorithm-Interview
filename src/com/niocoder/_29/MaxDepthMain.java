package com.niocoder._29;

import com.niocoder._17.TreeNode;

public class MaxDepthMain {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode left1 = new TreeNode(9);
        TreeNode rigth1 = new TreeNode(20);
        TreeNode left2 = new TreeNode(15);
        TreeNode right2 = new TreeNode(7);
        root.left = left1;
        root.right = rigth1;
        rigth1.left = left2;
        rigth1.right = right2;

        int max = maxDepth(root);
        int min = minDepth(root);
        System.out.println("max=" + max + ",min=" + min);
    }

    public static int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null) return minDepth(root.right) + 1;
        if (root.right == null) return minDepth(root.left) + 1;
        return Math.min(minDepth(root.left) + 1, minDepth(root.right) + 1);
    }
}
