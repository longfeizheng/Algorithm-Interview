package com.niocoder._17;

import java.util.ArrayList;
import java.util.List;

public class IsValidBSTMain {

    static double last = -Double.MAX_VALUE;

    public static void main(String[] args) {

    }

    /**
     * 中序遍历结果为升序
     *
     * @param root
     * @return
     */
    public static boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) return false;
        }
        return true;
    }

    public static void inOrder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
}
