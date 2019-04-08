package com.niocoder._19;

import com.niocoder._17.TreeNode;

public class IowestCommonAncestorMain {

    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        // LCA 问题，查阅相关资料
        if (root == null) {
            return root;
        }
        if (root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        } else if (left != null) {
            return left;
        } else if (right != null) {
            return right;
        }
        return null;
    }
}
