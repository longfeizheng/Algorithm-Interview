package com.niocoder._26;

import com.niocoder._17.TreeNode;
import com.niocoder._28.LevelOrderMain;

import java.util.ArrayDeque;
import java.util.Queue;

public class BfsOrderMain {

    /**
     * 广度优先遍历
     *
     * @param root
     */
    public static void bfsOrder(TreeNode root) {
        if (root != null) {
            Queue<TreeNode> queue = new ArrayDeque<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                System.out.println(node.val);
                LevelOrderMain.aa(queue, node);
            }
        }
    }
}
