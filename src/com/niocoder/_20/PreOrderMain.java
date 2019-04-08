package com.niocoder._20;

import com.niocoder._17.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PreOrderMain {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrder(root, list);
        return list;
    }

    public void preOrder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }
}
