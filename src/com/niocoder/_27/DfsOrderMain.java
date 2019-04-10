package com.niocoder._27;

import com.niocoder._17.TreeNode;

public class DfsOrderMain {

    /**
     * 前序遍历
     *
     * @param root
     */
    public static void dfsOrder(TreeNode root) {
        if (root == null) return;
        System.out.println(root.val);
        dfsOrder(root.left);
        dfsOrder(root.right);
    }
}
